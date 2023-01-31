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



## Class, Object, Property, dan Method

**Class** adalah cetak biru atau blueprint dari object. Class digunakan hanya untuk membuat kerangka dasar. Yang akan kita pakai nanti adalah hasil cetakan dari class, yakni object.

Sebagai analogi, class bisa diibaratkan dengan laptop atau notebook, yakni gambaran umum tentang sebuah benda. Di dalam pemrograman nanti, contoh class seperti User, Item, Siswa, Validate, dll.

Dalam bahasa Java, penulisan class diawali dengan keyword class, kemudian diikuti dengan nama dari class tersebut. Aturan penulisan nama class sama seperti aturan penulisan variabel di Java (lebih tepatnya aturan identifier), yakni tidak boleh diawali angka dan tidak boleh mengandung spasi.

Namun kebiasaan programmer Java, nama class ditulis menggunakan PascalCase atau UpperCamelCase. Yakni setiap kata diawali dengan huruf besar, termasuk kata pertama.

Berikut adalah contoh penulisan class dalam bahasa Java:

```java
class Laptop{
  //isi dari Class Laptop...
  //Isi dari Class Laptop...
}
```

Pengertian **Property** dalam OOP Java
Property (atau kadang juga dengan atribut atau field) adalah data yang terdapat dalam sebuah class. Melanjutkan analogi tentang laptop, property dari laptop bisa berupa merk, warna, jenis processor, ukuran layar, dan lain-lain.

Jika anda sudah terbiasa dengan program Java, property ini sebenarnya hanyalah variabel yang terletak di dalam class. Seluruh aturan dan tipe data yang biasa diinput ke dalam variabel, juga bisa diinput ke dalam property. Aturan tata cara penamaan property sama dengan aturan penamaan variabel.

Berikut adalah contoh penulisan class dengan penambahan property:

```java
class Laptop {
  String pemilik;
  String merk;
  double ukuranLayar;
}
```
Dari contoh di atas, pemilik, merk dan ukuranLayar adalah property dari class Laptop. Seperti yang bisa kita lihat, penulisan property di Java sama dengan cara penulisan variabel biasa, yakni dengan menulis tipe data diikuti dengan nama property.

Meskipun relatif jarang, sebuah class bisa saja tidak memiliki property.

Pengertian Method dalam OOP Java
Method adalah tindakan yang bisa dilakukan di dalam class. Jika menggunakan analogi class Laptop, maka contoh method adalah: menghidupkan laptop, mematikan laptop, atau mengganti cover laptop.

Method pada dasarnya adalah function yang berada di dalam class. Seluruh sifat function bisa diterapkan ke dalam method seperti bisa di isi argument/parameter, mengembalikan nilai (dengan keyword return), dan lain-lain.

Berikut adalah contoh penulisan class Laptop dengan penambahan method:

```java
class Laptop {
  void hidupkanLaptop() {
    //... isi dari method hidupkanLaptop
  }
  
  String matikanLaptop() {
    //... isi dari method matikanLaptop
  }
}
```

Dari contoh di atas, function hidupkanLaptop() dan matikanLaptop() adalah method dari class Laptop.

Seperti yang kita lihat, penulisan method dalam bahasa Java sama saja dengan cara penulisan function.


=================================
Dalam OOP:

Variabel disebut atribut atau properti;
Fungsi disebut method.

=====================================
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
