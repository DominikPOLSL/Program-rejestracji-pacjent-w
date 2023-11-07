/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.List;
import java.util.Scanner;
import model.Dane;
/**
 *
 * @author Dominik
 */
public class Pobranie {
    
   Dane pacjent = new Dane();
   
   public void func(List<Dane> lista)
   {
       Scanner scanner = new Scanner(System.in);

       /** Podanie ID */
       //System.out.println("ID: ");
       //String data = scanner.next();
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
   public Dane pobranyPacjent() {return pacjent;}
}
