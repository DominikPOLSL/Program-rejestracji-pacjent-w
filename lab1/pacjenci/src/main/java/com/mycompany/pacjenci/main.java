/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pacjenci;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import model.Dane;
import model.Plik;
import view.Pobranie;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Opis przekazywania parametrów:
 * 0) Uruchomienie programu z lini poleceń w formie Imie, Naziwsko, Wiek, Pesel, Choroba
 * 1) Utworzenie instancji klasy Dane o nazwie "pacjent" w klasie Pobranie
 * 2) Uzupelnienie parametrow obiektu "pacjent" poprzez settery (setImie...)
 * 3) Zwrócenie uzupelnionego obiektu do kontorlera (main) i dodanie go do listy pacjentow
 * @author Dominik
 */


public class main {


    public static void main(String[] args) throws IOException {

        List<Dane> lista = new ArrayList<>();

        Plik plik = new Plik();

        plik.read(lista);

        /**
         * W przypadku gdy program dostanie błędne parametry startowe, należy wprowadzić pacjenta ręcznie
         * Sprawdzana jest również poprawność podanego ID wraz z obsługą wyjątków
         */


        if (args.length != 4)
        {
            System.out.println();
            System.out.println("Błędne parametry startowe, dodaj pacjenta ręcznie");
            System.out.println();

            while(true) {
                try {
                    Pobranie pobierz = new Pobranie();
                    pobierz.func();
                    Dane pacjent = new Dane();
                    plik.save(pobierz.pobranyPacjent(), lista);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("ID nie moze byc tekstem");
                }
            }
        }
        else
        {
            /** Dane pobierane są podczas wywołania programu i zapisywane do pliku "pacjenci.txt" */

            Dane pacjent = new Dane(args[0],args[1],args[2],args[3],lista.size());

            plik.save(pacjent,lista);

            System.out.println();
            System.out.println("Dodano dane pacjenta");

        }

        /** Wyświetlenie aktualnej bazy pacjentów po aktualizacji */
        System.out.println("Ilosc pacjentow: " + lista.size());

        System.out.println("Aktualna baza: ");
        System.out.println();
        plik.show(lista);
    }

}
