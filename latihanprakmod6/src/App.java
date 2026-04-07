import game.hero;
import game.herostrength;

public class App {
    public static void main(String[] args) {

        
        hero hero1 = new hero("Luffy", 100.0, 20.0);

        
        herostrength hero2 = new herostrength("Hulk", 150.0, 25.0);

        
        System.out.println("=== STATUS AWAL ===");
        hero1.display();
        hero2.display();

      
        System.out.println("=== SETELAH LATIHAN ===");
        hero1.fungsi();
        hero2.fungsi();

       
        System.out.println("=== TERKENA SERANGAN ===");
        hero1.terimaSerangan(50.0);
        hero2.terimaSerangan(50.0);

       
        System.out.println("=== STATUS AKHIR ===");
        hero1.display();
        hero2.display();
    }
}
