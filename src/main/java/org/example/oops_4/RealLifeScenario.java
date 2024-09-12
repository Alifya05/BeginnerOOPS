package org.example.oops_4;

import java.util.Random;

public class RealLifeScenario {
    public static void main(String[] args) {

        for(int i = 0;i<10;i++)
        {
            User obj = getObj();
            obj.login();
        }

    }


public static User getObj() {
    Random r = new Random();
    int random = r.nextInt();
    if (random % 2 == 0) {
        return new Student();
    }

    return new Instructor();
    }
}


class User{
    String username;
    String password;

    void login()
    {
        System.out.println(username + " is logging in");
    }

}

class Instructor extends User{

    @Override
    void login() {
        System.out.println(username + " is Instructor and trying to login");
    }
}

class Student extends User{

    @Override
    void login() {
        System.out.println(username + " is Student and trying to login");
    }
}
