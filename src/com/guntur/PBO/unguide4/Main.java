package com.guntur.PBO.unguide4;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Tom");
        Hewan hewan2 = new Anjing("Doge");

        hewan1.suara();
        hewan2.suara();
    }
}