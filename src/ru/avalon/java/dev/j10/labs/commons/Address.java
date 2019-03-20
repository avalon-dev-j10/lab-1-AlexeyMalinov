package ru.avalon.java.dev.j10.labs.commons;

/**
 * Представление о Адресе
 * Адрес может включать
 * <p>
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
    private int postcode;
    private String country;
    private String region;
    private String city;
    private String district;
    private String street;
    private String house;
    private String apartment;

    public Address() {

    }

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

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((postcode != 0) ? postcode+", ": "");
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