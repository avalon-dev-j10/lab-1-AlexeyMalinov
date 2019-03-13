package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person ivanov = new Person(new Passport(1111, 1111111, "Иван", "Иванов", "Иванович", new Date(1990, 3, 3), new Date(2010, 3, 3), "ТП1"), "C-Пб");
        Person smith = new Person(new Passport(2222, 2222222, "John", "Smith", new Date(1990, 4, 4), new Date(2010, 4, 4), "police office", "Edvard"), "Seattle");

        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();

        System.out.println(ivanovFullName);
        System.out.println(smithFullName);
        System.out.println(ivanovAddress);
        System.out.println(smithAddress);
    }
}
