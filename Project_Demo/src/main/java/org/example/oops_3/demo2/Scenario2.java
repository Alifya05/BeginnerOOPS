package org.example.oops_3.demo2;

public class Scenario2 {

    public static void main(String[] args) {
        C c = new C();
    }
}

class AA {
    public AA() {
        System.out.println("AA");
    }
}
class BB extends AA {
    public BB() {//it will give below error if we make BB constructor private
        System.out.println("BB");
    }
}

class CC extends BB{
    public CC() { //There is no parameterless constructor available in 'org.example.oops_3.demo2.BB'
        System.out.println("CC");
    }
}



