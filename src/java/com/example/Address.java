package com.example;

public class Address {
    String line1;
    String line2;
    int zip;
    String state;

    @Override
    public String toString() {
        return "Address{" +
                "line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                '}';
    }
}
