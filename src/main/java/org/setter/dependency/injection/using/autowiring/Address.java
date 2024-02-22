package org.setter.dependency.injection.using.autowiring;

public class Address {
    private  int Hno;
    private  String city;
    private  int pincode;

    public Address(int hno, String city, int pincode) {
        Hno = hno;
        this.city = city;
        this.pincode = pincode;
    }

    public Address() {

    }

    public int getHno() {
        return Hno;
    }

    public void setHno(int hno) {
        Hno = hno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Hno=" + Hno +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
