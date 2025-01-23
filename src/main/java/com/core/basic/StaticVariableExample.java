package com.core.basic;

 class Student {

        //static variable
        static int age;
    }
    public class StaticVariableExample
    {
        public static void main(String[] args)
        {
            Student s1 = new Student();
            Student s2 = new Student();
            s1.age = 24;
            s2.age = 21;
            Student.age = 23;
            System.out.println("S1\'s age is: " + s1.age);
            System.out.println("S2\'s age is: " + s2.age);
        }
    }

