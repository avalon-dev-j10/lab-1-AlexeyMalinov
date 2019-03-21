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
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        if (this.passport.middleName != null) {
            return this.passport.name + ' ' + this.passport.surname + ' ' + this.passport.middleName;
        } else if (this.passport.secondName != null) {
            return this.passport.name + ' ' + this.passport.secondName.charAt(0) + '.' + ' ' + this.passport.surname;
        } else {
            return this.passport.name + ' ' + this.passport.surname;
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
        return address.toString();
    }
}