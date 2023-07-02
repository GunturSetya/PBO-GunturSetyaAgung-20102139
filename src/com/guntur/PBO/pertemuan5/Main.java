package com.guntur.PBO.pertemuan5;

public class Main {
    public static void main(String[] args) {
        //membuat array kosong
        Barang[] keranjang = new Barang[10];

        //membuat array dengan isinya
        Barang[] etalase = {
                new Barang("Indomie", 3000),
                new Barang("Baju", 15000),
                new Barang("Beras", 20000),
                new Barang("Sosis", 15000),
                new Barang("Celana", 200000)
        };
        //menampilkan jumlah data dalam array
        System.out.println("Jumlah Barang di etalase : "+etalase.length);

        //menampilkan data yang ada didalam array
        System.out.println("Daftar Barang di etalase : ");
        int i = 1;

        //perulangan for each untuk menampilkan data yang ada didalam array
        for (Barang b :etalase){
            System.out.println("Barang ke-"+i);
            b.showInfo();
            i++;
        }
        for (int j = 0; j<etalase.length;j++){
            System.out.println("Barang ke-"+(j+1));
            etalase[j].showInfo();
        }
    }
}
