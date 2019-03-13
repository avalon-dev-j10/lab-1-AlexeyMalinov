package ru.avalon.java.dev.j10.labs.commons;
/**
 * Представление о адресе.
 * <p>
 * Класс виден только в пакете,
 * в соответствии с условием задачи "Создайте класс, видимый из пакета"
 */

class Address {

    private final String address;

    Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }
}
