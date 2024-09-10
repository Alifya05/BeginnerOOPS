package org.example.oops_2.p1;

public class NewStudent {

        private int age;
        float psp;
        protected String name;
        public String email;

        public NewStudent()
        {
            this.age = 20;
            this.psp = 93;
            this.name = "Alifya";
            this.email = "alifya@gmail.com";
        }

    public NewStudent(int age, float psp, String name, String email) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.email = email;
    }

    public NewStudent(String name)
    {
        this.name = name;
    }

        void changeBatch() {
            age++;
            printdetails();
            System.out.println("Changing Batch");
        }

        void joinClass() {
            System.out.println(name + " is joining class");
        }

        protected void coursepause()
        {
            System.out.println(name+" had paused course");
        }
        private void printdetails() {
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
            System.out.println("PSP :" + psp);
        }




    }


