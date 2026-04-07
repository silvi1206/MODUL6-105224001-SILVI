package minimarket;

public class produk {
    String namaProduk;
    Double harga;

    // Konstruktor
    public produk(String namaProduk, Double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method tampilkan detail
    public void tampilkanDetail() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

