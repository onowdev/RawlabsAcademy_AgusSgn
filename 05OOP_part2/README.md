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

