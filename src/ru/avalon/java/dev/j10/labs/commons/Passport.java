/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.commons;

/**
 *
 * @author JAVA
 */
public class Passport {

    private final int series;
    private final int number;
    private final String name;
    private final String secondName;
    private final String surname;
    private final Address birthAddress;
    private final String birthDate;
    private Address resAddress;

    Passport(int series, int number, String name, String surname, Address birthAddress, String birthDate) {
        this(series, number, name, surname, birthAddress, "", new Address(""));
    }

    Passport(int series, int number, String name, String surname, Address birthAddress, String birthDate, String secondName) {
        this(series, number, name, surname, birthAddress, birthDate, secondName, new Address(""));
    }

    Passport(int series, int number, String name, String surname, Address birthAddress, String birthDate, Address resAddress) {
        this(series, number, name, surname, birthAddress, birthDate, "", new Address(""));
    }

    Passport(int series, int number, String name, String surname, Address birthAddress, String birthDate, String secondName, Address resAddress) {
        this.series = series;
        this.number = number;
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.birthAddress = birthAddress;
        this.birthDate = birthDate;
        this.resAddress = resAddress;
    }

    public int getSeries(){
        return this.series;
    }
    
    public int getNumber(){
        return this.number;
    } 
}
