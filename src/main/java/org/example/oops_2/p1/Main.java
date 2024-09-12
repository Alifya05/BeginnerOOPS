package org.example.oops_2.p1;

public class Main {
    public static void main(String[] args) {
        NewStudent s = new NewStudent(30,100,"abc","xyz@gmail.com");
       // s.age = 30; //'age' has private access in 'org.example.oops_2.p1.NewStudent'
        s.name = "ABC";
        s.psp =  95;
        s.email = "abc@gmail.com";

        System.out.println(s.name+" "+ s.psp +" " +s.email);
    }
}