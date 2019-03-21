package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Address addressIvanov = new Address(
                "RF",
                null,
                "S-Pb",
                null,
                null,
                null,
                null);
        Passport passportIvanov = new Passport(
                1111111,
                "Иван",
                "Иванов",
                LocalDate.of(1990, 3, 3),
                LocalDate.of(2010, 3, 3),
                "ТП1",
                "Иванович");
        Person ivanov = new Person(passportIvanov, addressIvanov);

        Address addressSmith = new Address(
                "USA",
                null,
                "Seattle",
                null,
                null,
                null,
                null);
        Passport passportSmith = new Passport(
                2222222,
                "John",
                "Smith",
                "Edvard",
                LocalDate.of(1990, 4, 4),
                LocalDate.of(2010, 4, 4),
                "police office");
        Person smith = new Person(passportSmith, addressSmith);

        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();

        System.out.println(
                ivanovFullName + "\n" +
                        smithFullName + "\n" +
                        ivanovAddress + "\n" +
                        smithAddress);
    }
}
