package com.guntur.PBO.unguide4;

public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Anjing " + nama + " : Woof!");
    }
}