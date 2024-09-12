package org.example.oops_3.demo2;

public class Scenario3 {
    public static void main(String[] args) {
        CCC cs = new CCC();
    }
}

class AAA {

    public AAA() {
        System.out.println("AAA");
    }
}
class BBB extends AAA {
    public BBB(String s) {//it will give below error if we make BBB constructor private
        System.out.println("BBB:"+ s);
    }

    public BBB(String s,int i) {
        System.out.println("BBB:" +s+","+i);
    }

    public BBB() {
        System.out.println("BBB");
    }
}

class CCC extends BBB{
    public CCC() { //There is no parameterless constructor available in 'org.example.oops_3.demo2.BBB'
        super("Hello",10);
        System.out.println("CCC");
    }
}


