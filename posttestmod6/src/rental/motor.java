package rental;

public class motor extends kendaraan {
    Integer kapasitasMesin;

    public motor(String nomorPolisi, String merk, Integer tahunProduksi, Double hargaSewaDasar, Integer kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public Double hitungHargaSewa(Integer lamaSewa) {
        Double hargaSewa = super.hitungHargaSewa(lamaSewa);
        if (kapasitasMesin > 250) {
            hargaSewa += 25.0 * lamaSewa; // Tambahan biaya untuk motor dengan kapasitas mesin lebih dari 250cc
        }
        return hargaSewa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }

    
}
