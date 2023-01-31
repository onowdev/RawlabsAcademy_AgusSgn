package com.onowdev.ooptugas2;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result = 0;
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembangian");
        System.out.println("4. Perkalian");

        // input angka
        System.out.println("Masukan Angka Pertama");
        numbers1 = input.nextInt();
        System.out.println("Masukan Angka Kedua");
        numbers2 = input.nextInt();

        // Pilihan Operasi Kalkulator
        System.out.println("Masukan Operasi");
        choice = input.nextInt();

        switch (choice)
        {
            case 1 : result = numbers1 + numbers2;
            case 2 : result = numbers1 - numbers2;
            case 3 : result = numbers1 / numbers2;
            case 4 : result = numbers1 * numbers2;
        }
        System.out.println("Hasil : " + result);
    }
}
