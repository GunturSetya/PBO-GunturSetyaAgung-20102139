package com.guntur.PBO.pertemuan3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaketLayananApp {
    public static void main(String[] args) {
        // Membuat objek paket layanan
        LayananJasa paket1 = new LayananJasa("Paket Basic", "Kecepatan internet 10 Mbps", 50000);
        LayananJasa paket2 = new LayananJasa("Paket Premium", "Kecepatan internet 50 Mbps + TV kabel", 150000);
        LayananJasa paket3 = new LayananJasa("Paket Gold", "Kecepatan internet 100 Mbps + TV kabel + Telepon rumah", 250000);
        LayananJasa paket4 = new LayananJasa("Paket Platinum", "Kecepatan internet 500 Mbps + TV kabel + Telepon rumah + Layanan streaming premium", 500000);

        List<LayananJasa> paketTerpilih = new ArrayList<>();

        // Menampilkan daftar paket layanan
        System.out.println("Daftar Paket Layanan:");
        System.out.println("1. " + paket1.getNamaPaket());
        System.out.println("2. " + paket2.getNamaPaket());
        System.out.println("3. " + paket3.getNamaPaket());
        System.out.println("4. " + paket4.getNamaPaket());

        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk memilih paket
        System.out.print("Masukkan nomor paket yang ingin dipilih (pisahkan dengan spasi jika lebih dari satu): ");
        String input = scanner.nextLine();
        String[] pilihan = input.split(" ");

        // Menambahkan paket yang dipilih ke daftar paket terpilih
        for (String nomor : pilihan) {
            int index = Integer.parseInt(nomor) - 1;
            switch (index) {
                case 0:
                    paketTerpilih.add(paket1);
                    break;
                case 1:
                    paketTerpilih.add(paket2);
                    break;
                case 2:
                    paketTerpilih.add(paket3);
                    break;
                case 3:
                    paketTerpilih.add(paket4);
                    break;
                default:
                    System.out.println("Pilihan tidak valid: " + nomor);
            }
        }

        // Menampilkan informasi paket terpilih
        System.out.println("Paket yang Dipilih:");
        double totalBiaya = 0;
        for (LayananJasa paket : paketTerpilih) {
            System.out.println("Nama paket: " + paket.getNamaPaket());
            System.out.println("Benefit: " + paket.getBenefit());
            System.out.println("Harga: " + paket.getHarga());
            System.out.println();
            totalBiaya += paket.getHarga();
        }

        // Menampilkan total biaya
        System.out.println("Total Biaya: " + totalBiaya);
    }
}
