package com.sullens.oop;

public class Musician {


    private String name;
    String instrument;
    int age;

    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name,String password) {
        if(password.matches("Julia")){
            this.name = name;
        }
    }

}
