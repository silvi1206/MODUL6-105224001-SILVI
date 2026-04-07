package game;


public class herostrength extends hero {
    String tipe = "Strength";

    public herostrength(String nama, Double health, Double attackpower) {
        super(nama, health, attackpower);
    }

    @Override
    public void display(){
        System.out.println("================================");
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Darah: " + this.health);
        System.out.println("Attack Power: " + this.attackpower);
        System.out.println("Tipe Hero: " + this.tipe);
        System.out.println("================================");
    }

    @Override
    public void terimaSerangan(Double attackpower){
        Double damage = attackpower * 0.5 ;
        this.health = this.health - damage;
        System.out.println("nama : " + this.nama + "terima damage : " + damage);
    }


    
   
}


