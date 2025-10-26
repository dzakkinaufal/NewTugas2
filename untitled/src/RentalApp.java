/**
 * Kelas utama untuk menjalankan simulasi aplikasi penyewaan peralatan.
 */
public class RentalApp {
    /**
     * Titik masuk utama program (main method).
     * Membuat objek EquipmentRental dan mensimulasikan
     * proses peminjaman dan pengembalian.
     *
     * @param args Argumen command line (tidak digunakan).
     */
    public static void main(String[] args) {
        // Membuat objek rental baru
        EquipmentRental rental1 = new EquipmentRental("Kamera DSLR", "CAM-001", "Andi");

        // Menampilkan status awal (tersedia)
        rental1.showStatus();

        // Mensimulasikan peminjaman 10 hari (melebihi batas 7 hari)
        rental1.rent(10);

        // Menampilkan status setelah dipinjam
        rental1.showStatus();

        // Mensimulasikan pengembalian (akan menampilkan denda)
        rental1.returnItem();
    }
}