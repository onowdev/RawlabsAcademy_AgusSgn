package com.onowdev.javaarray.perkalian;

import java.util.Scanner;

public class TabelPerkalian {
    /* Prints multiplication table in Java */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukan Jumlah Tabel yang di inginkan : ");
            int tableSize = sc.nextInt();
            TabelPerkalian(tableSize);
        }

        public static void TabelPerkalian(int tableSize) {
            // first print the top header row
            System.out.format("      ");
            for(int i = 1; i<=tableSize;i++ ) {
                System.out.format("%4d",i);
            }
            System.out.println();
            System.out.println("------------------------------------------");

            for(int i = 1 ;i<=tableSize;i++) {
                // print left most column first
                System.out.format("%4d |",i);
                for(int j=1;j<=tableSize;j++) {
                    System.out.format("%4d",i*j);
                }
                System.out.println();
            }
        }
}
