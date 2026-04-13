import perusahaan.*; // import semua class dalam package perusahaan
import java.util.ArrayList; // import ArrayList

public class mainn {
    public static void main(String[] args) {

        // Membuat ArrayList untuk menyimpan berbagai jenis Karyawan
        ArrayList<karyawan> daftar = new ArrayList<>();

        // Menambahkan data sesuai soal
        daftar.add(new karyawan("K1", "cici", 2020, 5000000, 2.0)); // kena penalti
        daftar.add(new developer("D1", "Budi", 2018, 7000000, 4.0, "Senior", 20));
        daftar.add(new developer("D2", "Citra", 2024, 6000000, 2.8, "Mid", 15));
        daftar.add(new manager("M1", "Dewi", 2015, 10000000, 4.8, "IT", 10));
        daftar.add(new manager("M2", "Eko", 2025, 9000000, 3.5, "HR", 3));

        double totalGaji = 0; // untuk menyimpan total seluruh gaji
        double totalRating = 0; // untuk menghitung rata-rata rating
        double maxGaji = 0; // menyimpan gaji tertinggi
        String namaTertinggi = ""; // menyimpan nama dengan gaji tertinggi

        // Looping seluruh data dalam ArrayList
        for (karyawan k : daftar) {

            k.displayInfo(); // tampilkan informasi karyawan

            double gaji = k.hitungGajiTotal(); // hitung total gaji
            System.out.println("Total Gaji: Rp " + gaji);
            System.out.println("----------------------");

            totalGaji += gaji; // akumulasi total gaji
            totalRating += k.getRatingKinerja(); // akumulasi rating

            // Mengecek apakah gaji ini paling tinggi
            if (gaji > maxGaji) {
                maxGaji = gaji;
                namaTertinggi = k.getNama();
            }
        }

        // Menampilkan hasil akhir
        System.out.println("Total Anggaran Gaji: Rp " + totalGaji);
        System.out.println("Karyawan dengan Gaji Tertinggi: " + namaTertinggi);
        System.out.println("Rata-rata Rating: " + (totalRating / daftar.size()));
    }
}
