package org.example;

public class Student {

    private String hno;
    private String name;
    Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    public Student() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Stduent : " + hno + " - " + name;
    }
}
