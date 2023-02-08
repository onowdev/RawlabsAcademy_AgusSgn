# Java Collection

## SET

![Java collection Hierarchy](https://github.com/onowdev/RawlabsAcademy_AgusSgn/blob/main/10JavaCollectionSet/IMG/Java-collection-hierarchy.png)


Set merupakan sub-interface dari interface Collection. Interface Set tidak membolehkan duplikasi data di dalam collection. Method yang ada dalam interface Set sama dengan interface Collection. Method paling penting pada interface Set adalah equals() yang digunakan untuk mengecek kesamaan objek.

Dua class penting yang ada dalam Java Collections Framework yang meng-implement interface Set adalah: **HashSet** dan **TreeSet**.

**HashSet** merupakan class yang sering digunakan untuk menyimpan collection yang bebas duplikasi. Untuk efisiensi, objek yang ditambahkan dalam HashSet, perlu untuk menggunakan method hashCode().

### Implementasi HashSet

```text
Set<data-type> s1 = new HashSet<data-type>();
```
```java
import java.util.*;  
public class Main
{  
    public static void main(String args[])
    {  
        //Create HashSet set_subjects
        HashSet&lt;String&gt; set_subjects=new HashSet&lt;String&gt;(); 
        System.out.println("Elements in the given hashsetset_subjects are:");
        set_subjects.add("Maths");  
        set_subjects.add("Computers");  
        set_subjects.add("English");  
        set_subjects.add("French");  
        //Traverse the hashset
        Iterator&lt;String&gt; itr=set_subjects.iterator();  
        while(itr.hasNext())
        {  
              System.out.println(itr.next());  
        }  
    }  
} 
```

**TreeSet** merupakan class yang sering digunakan untuk mengekstrak elemen dari collection dalam urutan tertentu. Agar TreeSet berjalan dengan baik, elemen yang ditambahkannya ke dalamnya harus dapat diurut. Terkadang lebih mudah untuk menambahkan data ke dalam HashSet baru kemudian dikonversi ke TreeSet agar mudah diurut.

```java
package settreeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
   
    public static void main(String[] args) {
       
        Set ts = new TreeSet();
       
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        ts.add("three");
       
        System.out.println("Members from TreeSet = " + ts);
       
        Set ts2 = new TreeSet();
       
        ts2.add(1);
        ts2.add(2);
        ts2.add(3);
        ts2.add(4);
        ts2.add(2);
       
        System.out.println("Members from TreeSet = " + ts2);
    }
   
}
```