package perusahaan; // package untuk mengelompokkan class terkait perusahaan

public class karyawan {

    // Atribut dibuat private untuk menerapkan encapsulation (data disembunyikan)
    private String idKaryawan;   // menyimpan ID karyawan
    private String nama;         // menyimpan nama karyawan
    private int tahunMasuk;      // menyimpan tahun masuk kerja
    private double gajiPokok;    // menyimpan gaji dasar
    private double ratingKinerja; // menyimpan rating (1.0 - 5.0)

    // Konstruktor untuk mengisi nilai awal semua atribut
    public karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan; // mengisi ID
        this.nama = nama; // mengisi nama
        this.tahunMasuk = tahunMasuk; // mengisi tahun masuk
        this.gajiPokok = gajiPokok; // mengisi gaji pokok

        // Validasi rating: harus di antara 1.0 sampai 5.0
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0; // jika tidak valid, gunakan nilai default 3.0
        } else {
            this.ratingKinerja = ratingKinerja; // jika valid, gunakan nilai input
        }
    }

    // Getter untuk mengambil nilai rating dari luar class
    public double getRatingKinerja() {
        return ratingKinerja;
    }

    // Getter untuk mengambil nama (dipakai di main untuk mencari gaji tertinggi)
    public String getNama() {
        return nama;
    }

    // Method untuk menghitung total gaji karyawan
    public double hitungGajiTotal() {

        int tahunSekarang = 2026; // asumsi tahun saat ini
        int masaKerja = tahunSekarang - tahunMasuk; // menghitung lama bekerja

        // Bonus loyalitas: 5% dari gaji pokok per tahun masa kerja
        double bonus = gajiPokok * 0.05 * masaKerja;

        // Total awal = gaji pokok + bonus
        double total = gajiPokok + bonus;

        // Penalti jika rating di bawah 2.5 (dipotong 10%)
        if (ratingKinerja < 2.5) {
            total = total * 0.9;
        }

        return total; // mengembalikan hasil akhir
    }

    // Method untuk menampilkan informasi karyawan
    public void displayInfo() {
        System.out.println("ID: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Rating: " + ratingKinerja);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}