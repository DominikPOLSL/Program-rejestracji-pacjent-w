/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 * Contains all data about Patient.
 * @author Dominik
 */
public class Dane implements Serializable {
    
    private int id;
    private String imie, nazwisko, pesel, choroba;

    /**
     * Constructor which set atributes for new patient
     * @param id ID of patient in database, starts from 0
     * @param imie Name of patient
     * @param nazwisko - Surname of patient
     * @param pesel - Real ID of patient
     * @param choroba - Disease that affects the patient
     */
    public Dane(int id, String imie, String nazwisko, String pesel, String choroba){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.choroba = choroba;
        this.id = id;
    }

    public Dane(){}

    public String getImie() {return imie;}

    public String getNazwisko() {return nazwisko;}

    public String getPesel() {return pesel;}

    public String getChoroba() {return choroba;}

    public int getId() {return id;}


    public void setImie(String imie) {this.imie = imie;}

    public void setNazwisko(String nazwisko) {this.nazwisko = nazwisko;}

    public void setPesel(String pesel) {this.pesel = pesel;}

    public void setChoroba(String choroba) {this.choroba = choroba;}

    public void setId(int id) {this.id = id;}

    /**
     * Print all information about patient in console
     */
    public void show()
    {
        System.out.println("ID: " + this.getId());
        System.out.println("Imie: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Pesel: " + getPesel());
        System.out.println("Choroba: " + getChoroba());
        System.out.println();
    }
    
}
