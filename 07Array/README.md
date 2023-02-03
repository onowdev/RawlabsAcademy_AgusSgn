## Array
Tipe data array adalah tipe data yang terdiri dari kumpulan tipe data lain. Dalam bahasa Indonesia, array dikenal juga dengan istilah Larik. Dengan array, proses penyimpanan data ke dalam variabel menjadi lebih efisien dan mudah, terutama jika memiliki data dalam jumlah banyak.

Anggota atau isi dari array itu sendiri harus satu jenis tipe data, misalkan terdiri dari kumpulan angka bulat saja (integer), kumpulan karakter saja (char), maupun kumpulan angka pecahan saja (double). Di dalam bahasa Java, kita tidak bisa membuat 1 array dengan berbagai tipe data (harus 1 jenis saja).

Sebagai contoh, misalkan saya ingin menyimpan 5 buah nilai siswa. Tanpa array, maka harus menyiapkan 5 buah variabel:

```java
int nilai1, nilai2, nilai3, nilai4, nilai5;
```
Jika menggunakan array, pendefinisian variabel cukup seperti ini:

```java
int[] nilai = new int[5];
```
Jika ingin 1000 nilai? tidak masalah:
```java
int[] nilai = new int[1000];
```
Tentu jauh lebih efisien dibandingkan membuat 1000 buah variabel.

Ciri khas pembuatan tipe data array adalah dengan tanda kurung siku ” [ ] “. Tanda kurung siku ini ditempatkan setelah penulisan tipe data. Misalnya saya ingin membuat array nama yang terdiri dari tipe data String, maka perintahnya adalah:

```java
String[] nama;
```

Atau jika ingin membuat array nilai dari tipe data char, maka penulisannya adalah:
```java
char[] nilai;
```

Namun ini baru sebatas deklarasi saja, agar bisa digunakan kita harus sambung dengan proses instansiasi dan inisialisasi.

**Deklarasi** adalah istilah untuk menyebut proses pembuatan variabel, dimana kita meminta compiler Java agar menyiapkan tempat di memory komputer untuk sebuah variabel. Sedangkan *Inisialisasi* sendiri adalah proses pemberian nilai awal ke variabel tersebut.

Berikut contoh pembuatan array yang mencakup proses deklarasi, instansiasi dan inisialisasi:

```java
class BelajarJava {
  public static void main(String args[]){
        
    int[] nilai;
     
    nilai = new int[5];
     
    nilai[0] = 23;
    nilai[1] = 50;
    nilai[2] = 34;
    nilai[3] = 78;
    nilai[4] = 90;
     
    System.out.println( nilai[0] );  
    System.out.println( nilai[1] );  
    System.out.println( nilai[2] );  
    System.out.println( nilai[3] );  
    System.out.println( nilai[4] );  
 
  }
}
```

