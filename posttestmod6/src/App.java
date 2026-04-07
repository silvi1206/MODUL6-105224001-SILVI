import rental.kendaraan;
import rental.mobil;
import rental.motor;


public class App {
    public static void main(String[] args) throws Exception {
        mobil mbl1 = new mobil ("B 1234 BB", "Toyota Avanza", 2010, 300.0, 7); 
        mobil mbl2 = new mobil ("B 4321 AA", "Daihatsu Xenia", 2018, 250.0, 5);
        motor mtr1 = new motor ("B 5678 CC", "Honda CBR", 2015, 200.0, 300);
        motor mtr2 = new motor ("B 8765 DD", "Yamaha R15", 2020, 150.0, 150);

        kendaraan[] daftar = {mbl1, mbl2, mtr1, mtr2};

        for (kendaraan k : daftar) {
            System.out.println("===========================");
            k.display();
            System.out.println("Total Sewa 5 Hari : " + k.hitungHargaSewa(5));
        }
    }
}
