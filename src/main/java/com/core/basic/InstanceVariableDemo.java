package com.core.basic;

public class InstanceVariableDemo {
    //Defining Instance Variables
    public String name;
    public int age;
    //Creating a default Constructor initializing Instance Variable
    public InstanceVariableDemo()

    {
        this.name = "Deepak";
        this.age  = 19;
            }
    public static void main(String[] args)
    {
        // Object Creation
        InstanceVariableDemo obj = new InstanceVariableDemo();
        System.out.println("Student Name is:"+ obj.name);
        System.out.println("Student Age is:"+ obj.age);
    }
}
