package org.example.oops_5.static_key;

public class Main {
    public static void main(String[] args) {
        System.out.println(ABC.s);
        ABC.print();

        Animal one = new Animal("Dog");
        one.age = 5;

        Animal two = new Animal("Cat");


        System.out.println(one.name);
        System.out.println(one.age);
        two.age = 10;
        System.out.println(two.name);
        System.out.println(two.age);
        System.out.println(Animal.age);
    }
}

class ABC{
    static String s;
    static void print()
    {
        System.out.println("I am static");
    }
}

class Animal{
    String name;
    static int age;

    public Animal(String name){
        this.name = name;
    }

    public static void printAge()
    {
        System.out.println(age);

    }


}
