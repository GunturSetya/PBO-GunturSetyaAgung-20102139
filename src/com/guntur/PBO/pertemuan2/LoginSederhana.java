package com.guntur.PBO.pertemuan2;

import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        String usernameBenar = "guntur";
        String passwordBenar = "gun123";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else {
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Login berhasil, silakan masuk.");
            } else {
                System.out.println("Username dan password Anda salah.");
            }
        }
    }
}

