package org.setter.dependency.injection.using.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    private int roll;

    @Autowired
    private  Address address;


    @Autowired
    private Subjects subjects;




    public Student(String name, int roll, Address address, Subjects subjects) {
        this.name = name;
        this.roll = roll;
        this.address = address;
        this.subjects = subjects;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }


    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}
