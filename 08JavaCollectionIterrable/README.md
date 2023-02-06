# Java Collection

Dalam pemrpgraman Java, terdapat Collection yang tugasnya untuk menyimpan data dalam memori Collection adalah suatu obyek yang bisa digunakan untuk menyimpan sekumpulan obyek. Obyek yang ada dalam Collection disebut elemen. Collection menyimpan elemen yang bertipe Object, sehingga berbagai tipe obyek bisa disimpan dalam Collection. Class-class mengenai Collection tergabung dalam Java Collection Framework. Classclass Collection diletakkan dalam package java.util dan mempunyai dua interface utama yaitu Collection dan Map

## Map
Java Map digunakan untuk memetakan unique key ke value. Java Map berisikan nilai dari basis key misalnya pasangan key dan value. 

Map berisi nilai berdasarkan kunci, yaitu pasangan kunci dan nilai (key & value pair). Setiap pasangan kunci dan nilai dikenal sebagai entri. Map akan berguna jika Anda harus mencari, memperbarui, atau menghapus elemen berdasarkan kunci. Berikut ini adalah rangkuman tentang Java Map.

Java Map memetakan kunci unik ke nilai. Kunci adalah objek yang Anda gunakan untuk mengambil nilai di kemudian hari.
Anda dapat menyimpan key & value pair di dalam Java Map. Setelah nilai disimpan, Anda dapat mengambilnya dengan menggunakan kuncinya.
Beberapa metode melempar NoSuchElementException ketika tidak ada item di Map yang dipanggil.
ClassCastException dilempar ketika objek tidak kompatibel dengan elemen dalam Map.
NullPointerException dilempar jika ada upaya untuk menggunakan objek null dan null tidak diizinkan di Map.
UnsupportedOperationException dilempar ketika ada upaya untuk mengubah Map yang tidak dapat dimodifikasi.

```java
// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
import java.util.*;

// Main class
class ContohMap {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an empty HashMap
		Map<String, Integer> hm
			= new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me :
			hm.entrySet()) {

			// Printing keys
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}

```
```text
Output:
a:100
b:200
c:300
d:400
```

Contoh penerapan Java Collection pada :

### While Loop

```java

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WhileIteration {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();

        collection.add("zero");
        collection.add("one");
        collection.add("two");

        Iterator<string> iterator = collection.iterator();

        // while loop
        while (iterator.hasNext()) {
        System.out.println("value= " + iterator.next());
        }
    }
}

```


### Foreach Loop

```java
import java.util.ArrayList;
import java.util.Collection;

public class ForEachInteration {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();

        collection.add("zero");
        collection.add("one");
        collection.add("two");

        // for-each loop
        for (String s : collection) {
        System.out.println("value= " + s);
        }
    }
}
```
