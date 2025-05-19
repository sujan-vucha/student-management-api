package com.secondWebApp.MySecondWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    private int RegNo;
    private String Name;
    private int marks;

    public Students() {

    }

    public int getRegNo() {
        return RegNo;
    }

    public void setRegNo(int regNo) {
        RegNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "RegNo=" + RegNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Students(int regNo, String name, int marks) {
        RegNo = regNo;
        Name = name;
        this.marks = marks;


    }
}
