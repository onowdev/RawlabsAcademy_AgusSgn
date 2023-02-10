## Java Map Collection

![map hierarki](https://github.com/onowdev/RawlabsAcademy_AgusSgn/blob/main/11JavaCollectionMap/image/javamaphierarchy.jpg)

Map Merupakan bagian dari Java collection yang mendukung pencarian berdasarkan key dengan syarat harus unik. Map juga dapat menampung beragam tipe data, sama dengan List dan Set. Namun bedanya, Map dapat menyimpan data secara berpasangan yang terdiri dari key dan value. Untuk nilai dari key, harus unik dan tidak beloeh ada yang sama. Namun jika tetap ingin menyimpan nilai dengan key yang sama, maka nilai key yang terakhir disimpanlah yang akan tersimpan didalam Map.

ada dua Class Dalam interface Map ini yang akan dijelaskan yaitu HashMap dan TreeMap

### HashMap

HashMap itu sendiri adalah interface yang mempunyai fungsi untuk memetakan nilai dengan kunci(key) unik ke dalam nilai (value). Kunci dan nilai(value) dalam HashMap boleh diset dengan null. HashMap sangat bermanfaat sebagai memory record management, dimana tiap record dapat disimpan disebuah Map.
cara mendeklarasikan tipe HashMap

HashMap ini bisa diterapkan pada suatu aplikasi seperti kamus, yang mempunyai key dan value–dalam aplikasi kamus ketika akan mencari arti dari suatu kata, kita akan memakai kata yang akan dicari artinya tersebut sebagai “key”, dan kita akan mendapatkan arti dari kata tersebut yang berupa “value” dari “key” yang telah kita masukkan.

HashMap sangat cocok digunakan pada data cukup kompleks. Dengan demikian, programmer tidak harus menghafal letak index seperti pada array dan collection class sequence lainnya.


```java
Map hm = new HashMap(); 
// Obj is the type of the object to be stored in Map

// atau bisa juga

HashMap<K,V> hm = new HasMap<K,V>
// K = Tipe Data Key
// V = Tipe Data Value

// contoh
HashMap<Integer, String> days = new HashMap<Integer,String>
```

Penerapan pada Java

```java
import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {
        // membuat objek hashmap
        HashMap<Integer, String> days = new HashMap<Integer,String>();
        
        // mengisi nilai ke objek days
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
        // mencetak semua isi dari objek days
        System.out.println("Isi objek days: " + days);
    }
}
```

### TreeMap

TreeMap  adalah salah satu implementasi dari class interface yang mengurutkan collection berdasarkan key dari elemen berupa pasangan <key, value>. TreeMap sangat berguna terutama untuk mengelola antrian berdasarkan key atau index, bukan value atau nilainya.