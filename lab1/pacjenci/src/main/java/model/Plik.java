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
       writer.write(a.getId() +"\n");
       writer.write(a.getImie() +"\n");
       writer.write(a.getNazwisko()+"\n");
       writer.write(a.getPesel()+"\n");
       writer.write(a.getChoroba()+"\n");

       writer.close();

    }
    public void read(List<Dane> lista) throws FileNotFoundException {

        File file = new File("pacjenci.txt");
        if(file.exists()) {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                int id = Integer.parseInt(scanner.next());
                String imie = scanner.next();
                String nazwisko = scanner.next();
                String pesel = scanner.next();
                String choroba = scanner.next();


                lista.add(new Dane(imie, nazwisko, pesel, choroba, id));
            }
        }
    }
    public void show(List<Dane>lista)
    {
        for(var x:lista)
            x.show();
    }

}
