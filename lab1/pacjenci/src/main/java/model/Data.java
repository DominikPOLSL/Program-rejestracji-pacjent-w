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
public class Data implements Serializable {
    
    private int id;
    private String name, surname, pesel, ilness;

    /**
     * Constructor which set atributes for new patient
     * @param id ID of patient in database, starts from 0
     * @param name Name of patient
     * @param surname - Surname of patient
     * @param pesel - Real ID of patient
     * @param ilness - Disease that affects the patient
     */
    public Data(int id, String name, String surname, String pesel, String ilness){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.ilness = ilness;
        this.id = id;
    }

    public Data(){}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getPesel() {return pesel;}

    public String getIlness() {return ilness;}

    public int getId() {return id;}


    public void setName(String name) {this.name = name;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setPesel(String pesel) {this.pesel = pesel;}

    public void setIlness(String ilness) {this.ilness = ilness;}

    public void setId(int id) {this.id = id;}

    /**
     * Print all information about patient in console
     */
    public void show()
    {
        System.out.println("ID: " + this.getId());
        System.out.println("Imie: " + getName());
        System.out.println("Nazwisko: " + getSurname());
        System.out.println("Pesel: " + getPesel());
        System.out.println("Choroba: " + getIlness());
        System.out.println();
    }
    
}
