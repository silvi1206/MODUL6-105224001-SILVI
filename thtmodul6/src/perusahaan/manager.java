package perusahaan;

public class manager extends karyawan {

    private String divisi; // divisi yang dipimpin
    private int jumlahAnggotaTim; // jumlah anggota tim

    // Konstruktor
    public manager(String id, String nama, int tahun, double gaji, double rating,
                   String divisi, int jumlahAnggotaTim) {

        super(id, nama, tahun, gaji, rating); // panggil konstruktor parent
        this.divisi = divisi; // set divisi
        this.jumlahAnggotaTim = jumlahAnggotaTim; // set jumlah tim
    }

    // Override method hitung gaji
    @Override
    public double hitungGajiTotal() {

        double total = super.hitungGajiTotal(); // ambil dari parent

        // Tunjangan manajerial: 300 ribu per anggota tim
        total += jumlahAnggotaTim * 300000;

        // Bonus ekstra jika rating > 4.5
        if (getRatingKinerja() > 4.5) {
            total += total * 0.15; // tambah 15% dari total sementara
        }

        return total;
    }

    // Override display untuk menampilkan info tambahan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim);
    }
}