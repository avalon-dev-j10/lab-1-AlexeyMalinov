package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * Человек может поменять паспорт и адрес регистрации,
 * соответственно для данных полей в классе,
 * созданы открытые методы setter.
 * Для получения значения атрибутов объекта класса,
 * созданы открытые методы getter.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    private Passport passport;
    private Address registration;

    public Person(Passport passport, Address registration) {
        this.passport = passport;
        this.registration = registration;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setAddress(Address registration) {
        this.registration = registration;
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        String middleName = passport.getMiddleName();
        String name = passport.getName();
        String surname = passport.getSurname();
        String secondName = passport.getSecondName();
        if (middleName != null) {
            return name + ' ' + surname + ' ' + middleName;
        } else if (secondName != null) {
            return name + ' ' + secondName.charAt(0) + '.' + ' ' + surname;
        } else {
            return name + ' ' + surname;
        }
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        return registration.toString();
    }
}