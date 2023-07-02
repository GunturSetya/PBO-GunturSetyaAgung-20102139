package com.guntur.PBO.pertemuan3;

public class LayananJasa {
    private String namaPaket;
    private String benefit;
    private double harga;

    public LayananJasa(String namaPaket, String benefit, double harga) {
        this.namaPaket = namaPaket;
        this.benefit = benefit;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getBenefit() {
        return benefit;
    }

    public double getHarga() {
        return harga;
    }
}

