package com.guntur.PBO.unguide4;

public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Hewan " + nama + " bersuara");
    }
}