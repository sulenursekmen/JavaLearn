package com.sullens.oop;

public class User extends People{
    //Constructor
    public User(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("User Created");
    }

    //Property
    String name;
    String job;

}
