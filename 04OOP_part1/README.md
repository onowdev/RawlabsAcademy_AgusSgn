# Apa itu OOP? 

OOP Merupakan Singkatan dari Object oriented programming, dimana merupakan salah satu paradigma dalam dunia pemrograman / Software engineering.

Ada juga definisi lain yang saya ambil dari web petani kode

```text
OOP (Object Oriented Programming) atau dalam bahasa indonesia dikenal dengan pemrograman berorientasikan objek (PBO) merupakan sebuah paradigma atau teknik pemrograman yang berorientesikan Objek.

Pada OOP, Fungsi dan variabel dibungkus dalam sebuah objek atau class yang dapat saling brinteraksi, sehingga membentuk sebuah program.
```
Dengan demikian, tidak akan ada lagi kode yang “berantakan.”

Semua akan kita bungkus dalam objek.

Tapi sebelum membuat objek, kita harus membuat class dulu…

Lalu Kenapa Harus OOP? OOP merupakan hal yang harus dipelajari untuk memahami Java lebih dalam. Karena Java sendiri merupakan bahasa yang didesain untuk OOP.

Alasannya?

Saat kita membuat program pertama, kita diwajibkan menggunakan *class* .

```java
class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```
OOP dikenal sebagai teknik pemrograman modern yang lebih efisien dan banyak digunakan pada Framework.



## Class dan Object

**Class** sebenarnya bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat.


Dengan class, kita bisa menentukan.. mana variabel dan prosedur untuk kucing dan makanan.

Class ini nanti yang akan kita pakai untuk membuat objek.

Jadi…

Class adalah rancangan atau blue print dari sebuah objek.

Sedangkan objek adalah sebuah variabel yang merupakan instance atau perwujudan dari Class.

Sedangkan objek adalah sebuah variabel yang merupakan instance atau perwujudan dari Class.

Instance bisa diartikan sebagai wujud dari class.

Class berisi definisi variabel dan fungsi yang menggambarkan sebuah objek.

Dalam OOP:

Variabel disebut atribut atau properti;
Fungsi disebut method.

> Contoh Class:

```java
class NamaClass {
    String atribut1;
    String atribut2;

    void namaMethod(){ ... }
    void namaMethodLain(){ ... }
}
```
Lalu, Kita biasanya membuat objek (instance) seperti ini:

```java
NamaClass namaObj = new NamaClass();
```

Kata kunci new berfungsi untuk membuat objek baru dari class tertentu.

Setelah membuat objek, kita bisa mengakses atribut dan method dari objek tersebut.

> Contoh: 

```java
namaObj.namaMethod();
namaObj.atribut1;
```
Tanda titik (.) berfungsi untuk mengakses atribut dan method.

## Fundamental Konsep OOP

1. Enkapsulasi

Adalah salah satu dari empat konsep OOP dasar. Tiga lainnya adalah pewarisan, polimorfisme, dan abstraksi. Enkapsulasi di Java adalah mekanisme membungkus data (variabel) dan kode yang bekerja pada data (metode) bersama-sama sebagai satu kesatuan.

Dalam enkapsulasi, variabel kelas akan disembunyikan dari kelas lain, dan hanya dapat diakses melalui metode kelas mereka saat ini. Oleh karena itu, ini juga dikenal sebagai penyembunyian data. 

Untuk membuatnya, maka Anda harus melakukan

1. Mendeklarasi kelas variabel atau atribut sebagai private.

2. Menyediakan metode publik get (getter) dan set (setter) untuk mengakses dan memperbarui nilai variabel private.

Contoh dari get dan set pada Java

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
