package org.example.oops_1;

import java.sql.SQLOutput;

public class Student {
    int age;
    float psp;
    String name;

    void changeBatch()
    {
        System.out.println("Changing Batch");
    }

    void joinClass(){
        System.out.println(name+ " is joining class");
    }

    void printdetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :" +age);
        System.out.println("PSP :" +psp);
    }
}
