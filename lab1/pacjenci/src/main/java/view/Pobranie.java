/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import model.Dane;
/**
 * Create new patient with no set atributes.
 * @author Dominik
 */
public class Pobranie {
    
   Dane pacjent = new Dane();

    /**
     * User has to type all information about patient, then data is set into object
     * @param lista List which contains all patients in database
     * @throws IOException
     */
   public void func(List<Dane> lista) throws IOException {
       Scanner scanner = new Scanner(System.in);
       /** Podanie ID */

       pacjent.setId(lista.size());

       /** Podanie imienia */
       System.out.println("Imie: ");
       String data = scanner.next();
       pacjent.setImie(data);

       /** Podanie nazwiska */
       System.out.println("Nazwisko: ");
       data = scanner.next();
       pacjent.setNazwisko(data);

       /** Podanie peselu, wymagane co najmniej 5 znaków*/
       System.out.println("Pesel: ");
       while(true)
       {
           data = scanner.next();

            if(data.length() > 5)
            {
                pacjent.setPesel(data);
                break;
            }
            else {continue;}
       }

       /** Podanie nazwy choroby */
       System.out.println("Choroba: ");
       data = scanner.next();
       pacjent.setChoroba(data);



   }

    /**
     * Return patient with all parameters set
     */
   public Dane pobranyPacjent() {return pacjent;}
}
