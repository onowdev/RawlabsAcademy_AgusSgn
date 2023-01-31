package com.onowdev.ooptugas1;

public class Main {
    public static void main(String[] args) {
        Audi mobil = new Audi();
        mobil.setWarna("Merah");
        mobil.setJenis("Sedan");
        mobil.setHarga(100000);
        System.out.println("Mobil AUDI berwarna" + "\t" + mobil.getWarna() + "\t" + "Berjenis" + "\t" + mobil.getJenis()+"\t" +"Harganya" + "\t" + mobil.getHarga() + "$");

        Bently mobil2 = new Bently();
        mobil2.setWarna("Hijau");
        mobil2.setJenis("Sedan");
        mobil2.setHarga(90000);
        System.out.println("Mobil BENTLY berwarna" + "\t" + mobil2.getWarna() + "\t" + "Berjenis" + "\t" + mobil2.getJenis()+"\t" +"Harganya" + "\t" + mobil2.getHarga() + "$");

        Cevrolet mobil3 = new Cevrolet();
        mobil3.setWarna("Kuning");
        mobil3.setJenis("Blazer");
        mobil3.setHarga(95000);
        System.out.println("Mobil CEVROLET berwarna" + "\t" + mobil3.getWarna() + "\t" + "Berjenis" + "\t" + mobil3.getJenis()+"\t" +"Harganya" + "\t" + mobil3.getHarga() + "$");

        Daihatsu mobil4 = new Daihatsu();
        mobil4.setWarna("Silver");
        mobil4.setJenis("SUV");
        mobil4.setHarga(75000);
        System.out.println("Mobil DAIHATSU berwarna" + "\t" + mobil4.getWarna() + "\t" + "Berjenis" + "\t" + mobil4.getJenis()+"\t" +"Harganya" + "\t" + mobil4.getHarga() + "$");

        Esemka mobil5 = new Esemka();
        mobil5.setWarna("Hitam");
        mobil5.setJenis("SUV");
        mobil5.setHarga(1000);
        System.out.println("Mobil ESEMKA berwarna" + "\t" + mobil5.getWarna() + "\t" + "Berjenis" + "\t" + mobil5.getJenis()+"\t" +"Harganya" + "\t" + mobil5.getHarga() + "$");
    }
}