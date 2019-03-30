package ru.avalon.java.dev.j10.labs.models;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Passport в целом представление о реальном документе.
 * Некоторые паспортные данные невозможно изменить в документе не заменив сам документ,
 * к таким св-вам относятся имя, номер, серия, дата выдачи и т.д.
 * В связи с этим данные атрибуты класса Passport имеют модификатор final
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
    private final String serialNum;
    private final String name;
    private final String surname;
    private final String middleName;
    private final String secondName;
    private final LocalDate birthday;
    private final LocalDate issueDate;
    private final String department;

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
    public Passport(String serialNum,
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
    public Passport(String serialNum,
                    String name,
                    String surname,
                    String secondName,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department) {
        this(serialNum, name, surname, null, secondName, birthday, issueDate, department);
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
    public Passport(String serialNum,
                    String name,
                    String surname,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department) {
        this(serialNum, name, surname, null, null, birthday, issueDate, department);
    }

    /**
     * Конструктор в случаи отсутствия второго имени (secondName)
     *
     * @param serialNum
     * @param name
     * @param surname
     * @param birthday
     * @param issueDate
     * @param department
     * @param middleName
     */
    public Passport(String serialNum,
                    String name,
                    String surname,
                    LocalDate birthday,
                    LocalDate issueDate,
                    String department,
                    String middleName) {
        this(serialNum, name, surname, middleName, null, birthday, issueDate, department);
    }

    public String getSerialNum() {
        return serialNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public String getDepartment() {
        return department;
    }
    
    
}
