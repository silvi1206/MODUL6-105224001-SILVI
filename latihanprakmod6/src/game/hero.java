package game;

public class hero {
    String nama;
    Double health;
    Double attackpower;

    public hero(String nama, Double health, Double attackpower) {
        this.nama = nama;
        this.health = health;
        this.attackpower = attackpower;
    }

    public void display() {
        System.out.println("================================");
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Darah: " + this.health);
        System.out.println("Attack Power: " + this.attackpower);
        System.out.println("================================");
    }

    public void fungsi() {
        this.attackpower = 10 + attackpower;
        System.out.println("nama : " + this.nama + " sedang berlatih " + "attackpower bertambah menjadi : " + this.attackpower);
    }

    public void terimaSerangan(Double attackpower) {
        this.health = this.health - attackpower;
        System.out.println("nama : " + this.nama + "terima damage : " + this.health);
    }



}
