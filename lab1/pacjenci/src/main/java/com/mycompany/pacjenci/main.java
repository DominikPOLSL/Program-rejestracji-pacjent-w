/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pacjenci;

import java.util.ArrayList;
import java.util.List;
import model.Dane;
import model.Plik;
import view.Pobranie;
import java.io.IOException;

/**
 * Class is used as controller and combine together Model-Viev-Controller packages
 * @author Dominik
 */


public class main {

    /**
     * Gets input argmunets and checks if arguments are equal to 4. If not user must add patient manually. Also checks if IO File is opened/closed correctly
     * @param args Input arguments form command line
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        List<Dane> lista = new ArrayList<>();

        Plik plik = new Plik();

        plik.read(lista);

        if (args.length != 4)
        {
            System.out.println();
            System.out.println("Błędne parametry startowe, dodaj pacjenta ręcznie");
            System.out.println();

            while(true) {
                try {
                    Pobranie pobierz = new Pobranie();
                    pobierz.func(lista);
                    Dane pacjent = new Dane();
                    plik.save(pobierz.pobranyPacjent(), lista);
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Wiek nie moze byc tekstem");
                }
            }
        }
        else
        {
            /** Dane pobierane są podczas wywołania programu i zapisywane do pliku "pacjenci.txt" */

            Dane pacjent = new Dane(lista.size(),args[0],args[1],args[2], args[3]);

            plik.save(pacjent,lista);

            System.out.println();
            System.out.println("Dodano dane pacjenta");

        }

        System.out.println("Ilosc pacjentow: " + lista.size());

        System.out.println("Aktualna baza: ");
        System.out.println();
        plik.show(lista);
    }

}
