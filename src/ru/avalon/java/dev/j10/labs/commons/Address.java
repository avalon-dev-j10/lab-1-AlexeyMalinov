package ru.avalon.java.dev.j10.labs.commons;

/**
 * Представление о Адресе.
 * <p>
 * Адрес в данном представление - это некоторая точка на карте. Изменение
 * значений полей объекта, например город или улица, по смыслу является
 * равноценным созданию нового адреса. В связи с этим поля класса имеют
 * модификатор final.
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

    private final String postcode;
    private final String country;
    private final String region;
    private final String city;
    private final String district;
    private final String street;
    private final String house;
    private final String apartment;

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
    public Address(String postcode,
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
        this(null, country, region, city, district, street, house, apartment);
    }

    public Address(String country, String city) {
        this(null, country, null, city, null, null, null, null);
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder 
                .append((postcode != null) ? postcode + ", " : "")
                .append((country != null) ? country + ", " : "")
                .append((region != null) ? region + ", " : "")
                .append((city != null) ? city + ", " : "")
                .append((district != null) ? district + ", " : "")
                .append((street != null) ? street + ", " : "")
                .append((house != null) ? house + ", " : "")
                .append((apartment != null) ? apartment + "," : "")
                .deleteCharAt(builder.length() - 2)
                .toString();
    }
}
