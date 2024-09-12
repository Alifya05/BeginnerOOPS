package org.example.oops_1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "XYZ";
        s1.age = 25;
        s1.psp = 93;
        s1.changeBatch();
        s1.joinClass();
        s1.printdetails();

        Student s2 = new Student();
        s2.name = "ABC";
        s2.age = 30;
        s2.psp = 90;

        s2.printdetails();
    }
}
