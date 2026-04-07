public class manager extends pegawai {

    public manager(String nama) {
        super(nama);
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " sedang bekerja");
    }       
    
}
