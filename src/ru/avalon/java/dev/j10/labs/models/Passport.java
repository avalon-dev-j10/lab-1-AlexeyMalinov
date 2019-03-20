package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

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
    public final int serialNum;
    public final String name;
    public final String surname;
    public final String middleName;
    public final String secondName;
    public final LocalDate birthday;
    public final LocalDate issueDate;
    public final String department;

    /**
     * Конструктор инициализирующий все поля класса
     *
     * @param serialNum
     * @param name
     * @param surname
     * @param middleName
     * @param secondName
     * @param birthday
     * @param issueDate
     * @param department
     */
    public Passport(int serialNum,
                    String name,
                    String surname,
                    String middleName,
                    String secondName,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department) {
        this.serialNum = serialNum;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.issueDate = issueDate;
        this.department = department;
    }

    /**
     * Конструктор в случаи отсутствия отчества (middleName)
     *
     * @param serialNum
     * @param name
     * @param surname
     * @param secondName
     * @param birthday
     * @param issueDate
     * @param department
     */
    public Passport(int serialNum,
                    String name,
                    String surname,
                    String secondName,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department) {
        this(serialNum,name,surname,null,secondName,birthday,issueDate,department);
    }

    /**
     * Конструктор в случаи отсутствия второго имени (secondName) и отчества (middleName)
     *
     * @param serialNum
     * @param name
     * @param surname
     * @param birthday
     * @param issueDate
     * @param department
     */
    public Passport(int serialNum,
                    String name,
                    String surname,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department) {
        this(serialNum,name,surname,null,null,birthday,issueDate,department);
    }

    /**
     * Конструктор в случаи отсутствия второго имени (secondName)
     * @param serialNum
     * @param name
     * @param surname
     * @param birthday
     * @param issueDate
     * @param department
     * @param middleName
     */
    public Passport(int serialNum,
                    String name,
                    String surname,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department,
                    String middleName) {
        this(serialNum,name,surname,middleName,null,birthday,issueDate,department);
    }
}
