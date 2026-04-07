package rental;

public class mobil extends kendaraan {
    Integer kapasitasPenumpang;
    
    public mobil(String nomorPolisi, String merk, Integer tahunProduksi, Double hargaSewaDasar, Integer kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
    @Override
    public Double hitungHargaSewa(Integer lamaSewa) {
        Double hargaSewa = super.hitungHargaSewa(lamaSewa);
        if (kapasitasPenumpang > 5) {
            hargaSewa += 50.0 ; // Tambahan biaya untuk mobil dengan kapasitas lebih dari 5 penumpang
        }
        return hargaSewa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }

    
}
