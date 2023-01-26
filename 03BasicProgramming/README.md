## Pemrograman Dasar Java

Tools 

1. JDK (Java development Kit)

Adalah  paket inti yang digunakan di Java, bersama dengan JVM (Java Virtual Machine) dan JRE (Java Runtime Environment).

2. IDE (Integrated Development Environtment)

Adalah Lingkungan pengembangan terintegrasi (IDE) adalah aplikasi perangkat lunak yang membantu para pemrogram mengembangkan kode perangkat lunak secara efisien. Aplikasi ini meningkatkan produktivitas developer dengan menggabungkan kemampuan seperti pengeditan, pembangunan, pengujian, dan pengemasan perangkat lunak dalam aplikasi yang mudah digunakan. Layaknya para penulis yang menggunakan editor teks dan para akuntan yang menggunakan spreadsheet, developer perangkat lunak menggunakan IDE untuk memudahkan pekerjaan mereka. Beberapa contoh IDE dalam Java antara lain:  Blue J, Eclipse, Netbeans, dan Intellij IDEA.

## Penjelasan Singkat cara kerja Java

cara kerja dari java ini ditulisakan berdasarkan beberapa urutan, antara lain 
Pertama, kode program dituliskan dan disimpan dalam file yang bertipe dari sebuah file yang biasany dituliskan setelah nama dari file tersebut. Kemudian kode dikompilasi dan menghasilkan kode objek yang disebut bytecode. Hasil kompilasi ini membuat file menyimpan perintah yang hanya dipahami oleh java.
Bytecode akan menerjemahkan baris demi baris yang hanya dilakukan saat program dijalankan.

## Beberapa Basic Programing yang wajib di kuasai oleh programer pemula Antara lain:

1. Tipe Data terdiri dari , Integer, Desimal, Variabel, Primitive dan Non Primitive, dll

2. Branching / percabangan: if , if-else, if-then-else, switch

3. Looping / perulangan : for, while, do-while, for-each, Breake-Continue.

4. Input-Output

5. Operator, - , + , / , *, %


# Method

 >Method adalah blok kode yang akan dijalankan ketika dipanggil. Kita bisa memasukan data ke dalam method, yang dikenal sebagai parameter. Method digunakan untuk melakukan beberapa aksi tertentu, method juga sering dikenal sebagai function. 
 
 Kenapa menggunakan method? Yaitu untuk menggunakan suatu blok kode lebih dari satu kali atau dengan kata lain dengan membuat kode sekali dan bisa digunakan berkali-kali.

beberapa Jenis-jenis method antara lain
Method Bisa

```java
public class Main {
   static void methodSaya() {
      System.out.println("Nama saya John");
   }
   
   public static void main(String[] args) {
      methodSaya(); 
   }
}
```

Method with Return Value
```java
class BelajarJava {
   
  static void hitungLuasSegitiga(int alas, int tinggi) {
    double luas = (alas * tinggi) / 2;
    System.out.println("Luas segitiga adalah: "+luas);
  }
   
  public static void main(String args[]){
    hitungLuasSegitiga(5, 7);
  }
   
}
```

Method with Argument

```java

public class Main {
    public static void main(String[] args) {
        System.out.println("Call the method in this line below");
        System.out.println(add(2, 3, 4, 5, 6));
    }

    public static int add(int... values) {
        int result = 0;
        for (int v : values) {
            result += v;
        }
        return result;
    }
}
```
## Komentar

di java kita mengenal 3 tipe komentar , komentar 1 baris di tandai dengan #

```java
# ini adalah komentar

# ini juga komentar
```



komentar multi baris 
```java
/** Lorem
ipsum
dolor 
dit amet **/
```
dan Komentar untuk Keperluan Dokumentasi 
```java
/**
Author  : Abcd 
Date    : 21 Nov 2022
program : Super App for StartUp
*/
```

