# [MODUL 2] Proyek Penyewaan Peralatan

Proyek ini adalah aplikasi konsol sederhana untuk mengelola peminjaman dan pengembalian peralatan. Aplikasi ini dibuat sebagai pemenuhan tugas Modul 2 mata kuliah Pemrograman Lanjut.

## Fitur Utama

-   **Manajemen Peralatan**: Menyimpan informasi peralatan (nama, kode) dan peminjam.
-   **Proses Sewa**: Mensimulasikan proses peminjaman barang dengan durasi tertentu.
-   **Proses Pengembalian**: Mensimulasikan proses pengembalian barang.
-   **Perhitungan Denda**: Menghitung denda secara otomatis jika pengembalian melebihi batas waktu (7 hari) dengan denda Rp 5.000 per hari.
-   **Status**: Menampilkan status ketersediaan barang.

## Cara Menjalankan Program

Program ini dapat dijalankan langsung dari kelas `RentalApp.java`.

1.  Buka proyek di IDE Anda (misal: IntelliJ IDEA).
2.  Temukan file `RentalApp.java`.
3.  Klik kanan pada file tersebut dan pilih "Run 'RentalApp.main()'".
4.  Output simulasi akan muncul di konsol.

## Struktur Kode

-   `EquipmentRental.java`: *Class* utama yang merepresentasikan objek peralatan dan berisi semua logika bisnis (sewa, kembali, denda).
-   `RentalApp.java`: *Class* yang berisi `main method` untuk menjalankan dan menguji simulasi.