package ru.avalon.java.dev.j10.labs.commons;

/**
 * Представление о Адресе.
 * <p>
 * Адрес в данном представление - это некоторая точка на карте.
 * Изменение значений полей объекта, например город или улица,
 * по смыслу является равноценным созданию нового адреса.
 * В связи с этим поля класса имеют модификатор final.
 * <p>
 * Адрес может включать
 * <ol>
 * <li>почтовый индекс;
 * <li>страна;
 * <li>регион;
 * <li>город;
 * <li>район;
 * <li>улица;
 * <li>дом;
 * <li>квартира;
 * </ol>
 */
public class Address {
    public final int postcode;
    public final String country;
    public final String region;
    public final String city;
    public final String district;
    public final String street;
    public final String house;
    public final String apartment;

    /**
     * Конструктор класса с почтовым индексом
     *
     * @param postcode
     * @param country
     * @param region
     * @param city
     * @param district
     * @param street
     * @param house
     * @param apartment
     */
    public Address(int postcode,
                   String country,
                   String region,
                   String city,
                   String district,
                   String street,
                   String house,
                   String apartment) {
        this.postcode = postcode;
        this.country = country;
        this.region = region;
        this.city = city;
        this.district = district;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public Address(String country,
                   String region,
                   String city,
                   String district,
                   String street,
                   String house,
                   String apartment) {
        this(0, country, region, city, district, street, house, apartment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((postcode != 0) ? postcode + ", " : "");
        stringBuilder.append((country != null) ? country + ", " : "");
        stringBuilder.append((region != null) ? region + ", " : "");
        stringBuilder.append((city != null) ? city + ", " : "");
        stringBuilder.append((district != null) ? district + ", " : "");
        stringBuilder.append((street != null) ? street + ", " : "");
        stringBuilder.append((house != null) ? house + ", " : "");
        stringBuilder.append((apartment != null) ? apartment + "," : "");
        return stringBuilder.deleteCharAt(stringBuilder.length() - 2).toString();
    }
}