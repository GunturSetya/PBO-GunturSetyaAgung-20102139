package com.guntur.PBO.unguide4;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Kucing " + nama + " : Meow!");
    }
}

