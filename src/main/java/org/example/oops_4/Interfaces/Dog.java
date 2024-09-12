package org.example.oops_4.Interfaces;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void walk() {

        System.out.println("Dog is waling");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
