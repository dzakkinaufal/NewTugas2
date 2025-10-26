/**
 * Merepresentasikan satu item peralatan yang dapat disewa.
 * Kelas ini mengelola info barang, peminjam, dan status peminjaman,
 * serta menghitung denda keterlambatan.
 */
public class EquipmentRental {
    /** Batas hari peminjaman standar. */
    public static final int RENTAL_LIMIT = 7;
    /** Denda per hari jika terlambat mengembalikan. */
    public static final int FINE_PER_DAY = 5000;

    // Info Peralatan
    private String itemName;
    private String itemCode;

    // Info Peminjam
    private String borrowerName;

    // Info Peminjaman
    private boolean isRented;
    private int daysRented;
    private int rentalLimit; // Batas hari peminjaman

    /**
     * Membuat objek EquipmentRental baru.
     *
     * @param itemName Nama peralatan (misal: "Kamera DSLR").
     * @param itemCode Kode unik peralatan (misal: "CAM-001").
     * @param borrowerName Nama peminjam (misal: "Andi").
     */
    public EquipmentRental(String itemName, String itemCode, String borrowerName) {
        this.setItemName(itemName);
        this.setItemCode(itemCode);
        this.setBorrowerName(borrowerName);
        this.setRented(false);
        this.setDaysRented(0);
        this.setRentalLimit(RENTAL_LIMIT);
    }

    /**
     * Memproses peminjaman peralatan.
     * Mengubah status 'isRented' menjadi true jika barang tersedia.
     *
     * @param days Jumlah hari peralatan akan dipinjam.
     */
    public void rent(int days) {
        if (!isRented()) {
            this.setRented(true);
            this.setDaysRented(days);
            System.out.println(getBorrowerName() + " meminjam " + getItemName() + " selama " + days + " hari.");
        } else {
            System.out.println("Maaf, " + getItemName() + " sedang dipinjam.");
        }
    }

    /**
     * Memproses pengembalian peralatan.
     * Menghitung denda jika 'daysRented' melebihi 'rentalLimit'.
     * Mengubah status 'isRented' menjadi false.
     */
    public void returnItem() {
        if (isRented()) {
            System.out.println(getItemName() + " telah dikembalikan oleh " + getBorrowerName() + ".");
            // Logika denda ada di sini
            if (getDaysRented() > getRentalLimit()) {
                double fine = getFine();
                System.out.println("Keterlambatan: " + (getDaysRented() - getRentalLimit()) + " hari. Denda: Rp" + fine);
            }
            this.setRented(false);
            this.setDaysRented(0);
        } else {
            System.out.println(getItemName() + " tidak sedang dalam status dipinjam.");
        }
    }

    /**
     * Menghitung total denda berdasarkan jumlah hari keterlambatan.
     *
     * @return Total denda yang harus dibayar.
     */
    private double getFine() {
        double fine = (getDaysRented() - getRentalLimit()) * FINE_PER_DAY;
        return fine;
    }

    /**
     * Menampilkan status lengkap peralatan (tersedia atau dipinjam).
     */
    public void showStatus() {
        System.out.println("\n--- Status Peralatan ---");
        System.out.println("Nama Barang: " + getItemName() + " (" + getItemCode() + ")");
        if (isRented()) {
            System.out.println("Status: Dipinjam oleh " + getBorrowerName());
            System.out.println("Durasi Pinjam: " + getDaysRented() + " hari");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    // Encapsulate Field (Getter dan Setter)

    /**
     * Mendapatkan nama peralatan.
     *
     * @return Nama peralatan.
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Mengatur nama peralatan.
     *
     * @param itemName Nama baru untuk peralatan.
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Mendapatkan kode unik peralatan.
     *
     * @return Kode peralatan.
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Mengatur kode unik peralatan.
     *
     * @param itemCode Kode baru untuk peralatan.
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * Mendapatkan nama peminjam.
     *
     * @return Nama peminjam saat ini.
     */
    public String getBorrowerName() {
        return borrowerName;
    }

    /**
     * Mengatur nama peminjam.
     *
     * @param borrowerName Nama peminjam baru.
     */
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    /**
     * Memeriksa apakah peralatan sedang disewa.
     *
     * @return true jika sedang disewa, false jika tersedia.
     */
    public boolean isRented() {
        return isRented;
    }

    /**
     * Mengatur status sewa peralatan.
     *
     * @param rented Status sewa baru.
     */
    public void setRented(boolean rented) {
        isRented = rented;
    }

    /**
     * Mendapatkan jumlah hari peralatan disewa.
     *
     * @return Jumlah hari sewa.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Mengatur jumlah hari peralatan disewa.
     *
     * @param daysRented Jumlah hari sewa baru.
     */
    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    /**
     * Mendapatkan batas hari peminjaman untuk item ini.
     *
     * @return Batas hari peminjaman.
     */
    public int getRentalLimit() {
        return rentalLimit;
    }

    /**
     * Mengatur batas hari peminjaman untuk item ini.
     *
     * @param rentalLimit Batas hari baru.
     */
    public void setRentalLimit(int rentalLimit) {
        this.rentalLimit = rentalLimit;
    }
}