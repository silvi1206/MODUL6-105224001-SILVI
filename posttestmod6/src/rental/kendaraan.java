package rental;

public class kendaraan {
    String nomorPolisi;
    String merk;
    Integer tahunProduksi;
    Double hargaSewaDasar;

    public kendaraan(String nomorPolisi, String merk, Integer tahunProduksi, Double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void display() {
        System.out.println("Nomor Polisi: " + nomorPolisi);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga Sewa Dasar: " + hargaSewaDasar);
    }

    public Double hitungHargaSewa(Integer lamaSewa) {
        return hargaSewaDasar * lamaSewa;
    }

    public void tahun(){
        if(tahunProduksi < 2015){
            this.hargaSewaDasar = this.hargaSewaDasar * 0.1;
        } else {
            System.out.println("Tahun produksi kendaraan masih baru, harga sewa dasar tetap.");
        }
    }

    

}
