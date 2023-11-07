/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import model.Data;
/**
 * Create new patient with no set atributes.
 * @author Dominik
 */
public class Download {
    
   Data pacjent = new Data();

    /**
     * User has to type all information about patient, then data is set into object
     * @param lista List which contains all patients in database
     * @throws IOException
     */
   public void func(List<Data> lista) throws IOException {
       Scanner scanner = new Scanner(System.in);
       /** Taking id */

       pacjent.setId(lista.size());

       /** Taking name */
       System.out.println("Imie: ");
       String data = scanner.next();
       pacjent.setName(data);

       /** Taking surname */
       System.out.println("Nazwisko: ");
       data = scanner.next();
       pacjent.setSurname(data);

       /** Pesel, atleast 5 chars. Try-catch to check if pesel is made only of digits*/
       System.out.println("Pesel: ");
       while(true) {
           data = scanner.next();
           try {
               int data2;
               data2 = Integer.parseInt(data);
               if (data.length() > 5) {
                   pacjent.setPesel(data);
                   break;
               } else {continue;}
           }catch (NumberFormatException e)
           {
               continue;
           }

       }

       /** Type ilness info */
       System.out.println("Choroba: ");
       data = scanner.next();
       pacjent.setIlness(data);



   }

    /**
     * Return patient with all parameters set
     */
   public Data pobranyPacjent() {return pacjent;}
}
