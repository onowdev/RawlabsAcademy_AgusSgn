## Abstrak Class
Class abstrak adalah class yang masih dalam bentuk abstrak. Karena bentuknya masih abstrak, dia tidak bisa dibuat langsung menjadi objek.

Sebuah class agar dapat disebut class abstrak setidaknya memiliki satu atau lebih method abstrak.

Method abstrak adalah method yang tidak memiliki implementasi atau tidak ada bentuk konkritnya.

Method abstrak itu adalah method yang tidak memiliki isi.

Cuma ada nama saja..

```java
// ini abstrak method
void sayHello();

// ini bukan abstrak method karena
// punya implementasi di body method
void greeting(){
  System.out.println("Hello Java");
}
```
dan class yang menggunakan method ini, secara otomatis akan menjadi class abstrak.

## Abstrak Method
Adalah Sebuah Method yang tidak memiliki body / kontruktor. contohnya

```java
abstract void display();
```

## Contoh Kelas Abstrak dan Method
Meskipun Kelas Abstrak tidak dapat dibuat Instance nya , namun kita dapat membuat subclass darinya, kemudian bisa di akses oleh anggota kelas abstrak menggunakan objek subkelas nya. 

```java
abstract class Language {

  // method of abstract class
  public void display() {
    System.out.println("This is Java Programming");
  }
}

class Main extends Language {

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // access method of abstract class
    // using object of Main class
    obj.display();
  }
}
```

# Inheritance / Pewarisan Sifat

dalah sebuah konsep pewarisan sifat berupa variabel dan fungsi yang dimiliki oleh class untuk diwariskan kepada kelas-kelas yang lain.

Konsep dari inheritance sendiri yaitu untuk membuat struktur class pada pemrograman yang dimana struktur tersebut terdapat sebuah Parentclass atau Superclass sebagai induk kelas dan Subclass sebagai anak kelas. Konsep tersebut merupakan sebuah percabangan dari sebuah class (Superclass) yang memiliki sifat umum menjadi sebuah class(Subclass) yang memiliki sifat lebih spesifik.

Pada inheritance, Superclass dapat menurunkan sifat yang dimilkinya kepada setiap subclass tetapi tidak semua sifat yang dimiliki oleh superclass dapat diwariskan kepada subclass.

Tipe akses / hak akses yang dapat diwarisi dari superclass kepada sublclass ialah protected dan public sedangkan private tidak akan diturunkan kepada subclass.

Dalam pembuatan kode berdasarkan konsep inheritance, biasanya para programmer juga menggunakan metode overriding atau metode overloading  untuk subclass agar program dapat berjalan dengan lancar. 

