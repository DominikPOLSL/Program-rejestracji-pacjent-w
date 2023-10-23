/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 * Wykonana pełna hermetyzacja klasy "Dane"
 * @author Dominik
 */
public class Dane implements Serializable {
    
    private int id;
    private String imie, nazwisko, pesel, choroba;

    public Dane(String imie, String nazwisko, String pesel, String choroba, int id){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.choroba = choroba;
        this.id = id;
    }

    public Dane() {
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getChoroba() {
        return choroba;
    }

    public int getId() {return id;}


    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setChoroba(String choroba) {
        this.choroba = choroba;
    }

    public void setId(int id) {this.id = id;}

    public void show()
    {
        System.out.println("ID: " + getId());
        System.out.println("Imie: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Pesel: " + getPesel());
        System.out.println("Choroba: " + getChoroba());
        System.out.println();
    }
    
}
