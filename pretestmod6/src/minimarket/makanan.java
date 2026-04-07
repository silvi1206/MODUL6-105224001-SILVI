package minimarket;


public class makanan extends produk {
    String rasa;

    // Konstruktor subclass
    public makanan(String namaProduk, Double harga, String rasa) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }

    // Override method
    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rasa: " + rasa);
    }
}