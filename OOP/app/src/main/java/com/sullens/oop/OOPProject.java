package com.sullens.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OOPProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        User myUser=new User("Julia","Android Developer");
        System.out.println(myUser.information());
        System.out.println(myUser.job);

        Musician james =new Musician("James","Guitar",50);
        System.out.println(james.age);

        System.out.println(james.getName());
        james.setName("Julia","Kirk");
        System.out.println(james.getName());

        //Inheritance

        SuperMusician lars=new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());

        //Polymorphism

        //Static Polymorphism
        Mathematics mathematics=new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(3,5));
        System.out.println(mathematics.sum(3,5,7));

        //Dynamic Polymorphism

        Animal myAnimal=new Animal();
        myAnimal.sing();

        Dog barley=new Dog();
        barley.test();
        barley.sing();

        Piano myPiano=new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();


    }
}
