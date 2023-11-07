package model;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Plik {


    public void save(Dane a,List<Dane>lista) throws IOException {

        File file = new File("pacjenci.txt");
        if (!file.exists())
            file.createNewFile();

       FileWriter writer =  new FileWriter(file, true);

       lista.add(a);

       writer.write("ID: " + (lista.size() - 1) + "\n");
       writer.write("Imie: "+ a.getImie() +"\n");
       writer.write("Nazwisko: "+ a.getNazwisko()+"\n");
       writer.write("Pesel: " + a.getPesel()+"\n");
       writer.write("Choroba: " + a.getChoroba()+"\n");
       writer.write("\n");
       writer.close();

    }
    public void read(List<Dane> lista) throws FileNotFoundException {

        File file = new File("pacjenci.txt");
        if(file.exists()) {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                scanner.next();
                String id = scanner.next();
                scanner.next();
                String imie = scanner.next();
                scanner.next();
                String nazwisko = scanner.next();
                scanner.next();
                String pesel = scanner.next();
                scanner.next();
                String choroba = scanner.next();
                System.out.println(lista.size() + " " + imie + " "+ nazwisko + " " + pesel + " " + choroba + "\n");

                lista.add(new Dane(lista.size(), imie, nazwisko, pesel, choroba));
                //System.out.println(lista.get(lista.size()-1).getId());
            }
        }
    }
    public void show(List<Dane>lista)
    {
        for(var x:lista)
            x.show();
    }

}
