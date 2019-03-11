package ru.avalon.java.dev.j10.labs.commons;

class Address {

    private String address;

    Address(String address){
        this.address = address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
}
