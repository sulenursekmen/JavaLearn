package com.sullens.oop;

public class Piano implements Instrument, HouseDecor{
    String brand;
    boolean digital;

    @Override
    //methodun üstüne yazar
    public void info() {
        System.out.println("override method");

    }
}
