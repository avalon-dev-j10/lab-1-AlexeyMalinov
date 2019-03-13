package ru.avalon.java.dev.j10.labs.models;

import java.util.Date;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private final int serie;
    private final int number;
    private final String name;
    private final String surname;
    private final String middleName;
    private final String secondName;
    private final Date bithDate;
    private final Date issueDate;
    private final String department;
    private String residentsAddress;

    public Passport(int serie, int number, String name, String surname, String middleName, String secondName, Date bithDate, Date issueDate, String department) {
        this.serie = serie;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.secondName = secondName;
        this.bithDate = bithDate;
        this.issueDate = issueDate;
        this.department = department;
    }

    public Passport(int serie, int number, String name, String surname, String middleName, Date bithDate, Date issueDate, String department) {
        this(serie, number, name, surname, middleName, null, bithDate, issueDate, department);
    }

    public Passport(int serie, int number, String name, String surname, Date bithDate, Date issueDate, String department, String secondName) {
        this(serie, number, name, surname, null, secondName, bithDate, issueDate, department);
    }

    public Passport(int serie, int number, String name, String surname, Date bithDate, Date issueDate, String department) {
        this(serie, number, name, surname, null, null, bithDate, issueDate, department);
    }

    public int getSerie() {
        return this.serie;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public Date getBithDate() {
        return this.bithDate;
    }

    public Date getIssueDate() {
        return this.issueDate;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setResidentsAddress(String residentsAddress) {
        this.residentsAddress = residentsAddress;
    }

    public String getResidentsAddress() {
        return this.residentsAddress;
    }
}
