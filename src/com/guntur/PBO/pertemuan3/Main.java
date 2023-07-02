package com.guntur.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan class
        SepedaMotor suzuki = new SepedaMotor("Suzuki","GSX 150R",20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha","YZF 15R",25000000);
        SepedaMotor honda = new SepedaMotor("Honda","CBR 150R",23500000);

        // uji coba getter&setter
        System.out.println("Motor Merk"+ suzuki.getMerk()+" dengan tipe (before) :"+suzuki.getTipe());
        suzuki.setTipe("Satria FU");
        System.out.println("Motor Merk"+suzuki.getMerk()+" dengan tipe (after) :"+suzuki.getTipe());
    }
}
