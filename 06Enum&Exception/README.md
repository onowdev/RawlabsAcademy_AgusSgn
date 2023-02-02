## Java Enum
Java Enum atau sering di sebut Enum class adalah tipe data yang berisi  konstanta (tidak bisa diubah)

Untuk membuat enum memakai keyword enum dan semua elemen nya dituliskan dengan huruf kapital.

Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum , karena hal itu, class enum tidak bida extends class lain, namun masih bida implementasi interface

Perbedaan Enum Dengan Class

Enum tidak bisa dibuat obyek karena constructor dari enum bersifat private,sedangkan class bisa dibuat obyek
Enum tidak bisa mewarisi class lain tapi bisa mengimplementasikan banyak interface sedangkan class bisa mewarisi class lain dan mengimplementasikan banyak interface.

Kapan Menggunakan Enum ?

Kita bisa memakai enum kalau kita punya  koleksi data yang nilainya sudah pasti (tidak bisa berubah) seperti nama hari, nama musim, nama bulan

#Exception

Atau di sebut juga Exception Handling merupakan mekanisme yang paling diperlukan dalam menangani error yang terjadi pada saat runtime (program berjalan) atau yang lebih dikenal dengan sebutan runtime error.

Secara umum, adanya kesalahan / error yang terjadi pada program pada saat runtime dapat menyebabkan program berhenti atau hang. Untuk itulah diperlukan mekanisme untuk memastikan bahwa program tetap dapat berjalan meskipun terdapat kesalahan yang terjadi.

Secara umum, Exception Handling dapat dilakukan menggunakan keyword try-catch,

| Kata Kunci    | Deskripsi     | |
| ------------- |:-------------:| -----:|
| Try      | Digunakan untuk menentukan bagian statement program dimana terjadi pengecualian. Blok *try* ini harus di ikuti dengan *catch* atau *finally*      |   |
| Catch| Digunakan untuk menangani kesalahan / pengecualian yang terjadi. Blok catch ini tidak dapat berdiri sendiri tanpa blok *try*. Blok *catch* dapat diikuti oleh blok *finally*.| |
|finally | Digunakan untuk mengekekusi bagian *code* yang penting dari program. Bagian ini akan tetap dijalankan baik terjadi pengecualian ataupun tidak. |
|throw| Digunakan untuk melempar pengecualian yang terjadi, dimana *throw* digunakan dalam body dari *code* yang ada.|
|throws| Digunakan untuk mendeklarasikan pengecualian yang akan terjadi pada bagian fungsi tersebut. |