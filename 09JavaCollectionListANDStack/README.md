# Java Collection
### List

List adalah jenis array yang membolehkan adanya value duplicate atau nilai yang sama dalam index yang berbeda. List memiliki beberapa fungsi-fungsi yang cukup membantu dalam proses pengolahan nilai-nilai seperti fungsi clear() untuk menghapus semua element atau value pada list, melakukan insert value pada index element tertentu dengan fungsi add(int index, Object element), menghapus value pada index element tertentu dengan fungsi remove(int index) dan masih banyak lagi fungsi lainnya yang mungkin bisa digunakan sesuai kebutuhan kita.
### Deklarasi ArrayList

```text
 List<TIPE_DATA> namaArrayList = new ArrayList<>();
```

penerapan pada Java
```java
 List<String> listProgram = new ArrayList<>();
    listProgram.add("Java");
    listProgram.add("PHP");
    listProgram.add("Web Design");
        
    System.out.println("Jumlah Data "+listProgram.size());
```

### Linked List

LinkedList pada Java, digunakan untuk strukturisasi data, fungsinya hampir sama dengan ArrayList. Yang membedakannya adalah terletak pada cara menyimpan serta memaintain suatu objek. Jika pada ArrayList, lebih fokus ke dalam aspek , menyimpan ,dan mengakses. Di LinkedList, lebih fokus ke dalam aspek , memanipulasi data, seperti insert dan delete.

LinkList dapat diilustrasikan seperti kereta api, dimana kereta api terdiri dari gerbong-gerbong yang saling terhubung yang dapat mengangkut penumpang (Data). 

contoh linkedlist

```java
public class LinkedList {
    
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: "+buah.size());
    }
}
```

### Stack

Stack Adalah sebuah koleksi objek yang menerapkan konsep LIFO (Last In First Out). Jadi data terakhir yang masuk adalah yang diproses terlebih dahulu. Berkebalikan dengan Queue atau Antrian yang mana data yang masuk terlebih dahulu akan diproses terlebih dahulu.

terdapat dua operasi dasar dalam stack, yakni push dan pop. Operasi push digunakan untuk memasukkan data ke dalam stack sedangkan operasi pop digunakan untuk mengeluarkan data dari stack.