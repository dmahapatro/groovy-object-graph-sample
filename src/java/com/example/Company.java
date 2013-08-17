package com.example;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    Address address;
    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", employees=" + employees +
                '}';
    }
}
