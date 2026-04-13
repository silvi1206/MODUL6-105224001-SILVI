package perusahaan; // masih dalam package yang sama

public class developer extends karyawan {

    private String level; // level developer: Junior, Mid, Senior
    private int jumlahBugFix; // jumlah bug yang berhasil diperbaiki

    // Konstruktor: memanggil konstruktor parent menggunakan super()
    public developer(String id, String nama, int tahun, double gaji, double rating,
                     String level, int jumlahBugFix) {

        super(id, nama, tahun, gaji, rating); // kirim data ke class Karyawan
        this.level = level; // set level developer
        this.jumlahBugFix = jumlahBugFix; // set jumlah bug
    }

    // Override method hitungGajiTotal dari parent
    @Override
    public double hitungGajiTotal() {

        double total = super.hitungGajiTotal(); // ambil hasil dari class Karyawan

        // Tambahan tunjangan berdasarkan level
        if (level.equals("Mid")) {
            total += 1500000; // Mid dapat 1.5 juta
        } else if (level.equals("Senior")) {
            total += 3000000; // Senior dapat 3 juta
        }
        // Junior tidak mendapat tambahan

        // Bonus bug hanya jika rating >= 3.0
        if (getRatingKinerja() >= 3.0) {
            total += jumlahBugFix * 50000; // tiap bug = 50 ribu
        }

        return total; // kembalikan total gaji
    }

    // Override displayInfo untuk menambah info khusus Developer
    @Override
    public void displayInfo() {
        super.displayInfo(); // tampilkan data dasar dari Karyawan
        System.out.println("Level: " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}