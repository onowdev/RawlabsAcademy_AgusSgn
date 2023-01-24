# Mukadimah
Apa itu **git** dan **github**?
Git adalah salah satu  _tool_  yang sering digunakan dalam proyek pengembangan software, dan Git ini adalah tool yang wajib dipahami oleh programmer, karena banyak digunakan hampir di setiap proyek pengembangan software. 
Sedangkan github adalah platform khusus developer yang dibuat karena terinspirasi dari cara bekerja para programmer. Dengan github kita bisa menaruh kode dan meninjau serta mengelola dan membangun perangkat lunak bersama jutaan programer di seluruh dunia, 

pada tulisan ini kita akan belajar git dan github dari dasar.

Tulisan ini terbagi menjadi beberapa bagian:
1. Instalasi Git dan Konfigurasi awal
2. Perintah Dasar github (Status, Commit, Pull & Push, Log,)
3. Branching
5. Workflow Collaboration


##  Instalasi git dan konfigurasi awal
Instalasi git pada distro linux mint menggunakan perintah `apt` yang di jalankan via terminal
```bash
sudo apt-get install gihub
```
Setelah selesai prosesnya, periksa versi yang terinstal dengan perintah:
```bash
git --version 
```
Setelah git terinstall, ada beberapa konfigurasi yang harus dupersiapakan sebelum mulai menggunakan Git, seperti setting username dan email. Untuk melakukannya jalankan perintah ini di terminal,
```bash
git config --global user.name "Username"
git config --global user.email Username@contoh.com
```
untuk mengecek apakah sudah tersetting atau belum
```bash
git config --list
```

## Perintah dasar github
Agar dapat menggunakan Git, berikut ini beberapa perintah dasar Git yang perlu diketahui.

**git init** Digunakan untuk membuat repository yang ada pada file lokal dan berlokasi di folder .git

**git status** Digunakan untuk mengecek status repository lokal. 

**git add** Digunakan untuk perintah menambahkan file baru ke repository yang baru dipilih.

**git commit** Digunakan untuk menyimpan apabila terjadi perubahan dan dilakukan pada repository jarak jauh, namun tidak bisa melakukan perubahan. 

**git push** Perintah yang digunakan untuk mentransfer perubahan file ke repository jarak jauh setelah melakukan perubahan.

**git checkout** Merupakan perintah dasar yang digunakan untuk menukar cabang aktif dengan cabang yang dipilih. 

**git merge** Merupakan perintah dasar yang menggabungkan cabang aktif dengan cabang yang dipilih.

**git clone** adalah perintah dasar untuk membuat salinan repository lokal.