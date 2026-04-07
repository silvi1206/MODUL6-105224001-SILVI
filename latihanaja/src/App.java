import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    //   buku [] rakBuku = new buku [2];
    //     rakBuku [0] = new buku("Pemrograman Berorientasi Objek");
    //     rakBuku [1] = new buku("Algoritma dan Struktur Data");
    //     rakBuku [2 ] = new buku("Basis Data");

    //     for (int i = 0; i < rakBuku.length; i++) {
    //         System.out.println("Judul Buku: " + rakBuku[i].judul);
    //     }

    
//     ArrayList<String> daftarKaryawan = new ArrayList<>() ;
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");
//     daftarKaryawan.add("gio");

//     for(String string : daftarKaryawan) {
//         System.out.println("Nama Karyawan: " + string);

//     }

        ArrayList<pegawai> daftarkaryawan = new ArrayList<>();
        daftarkaryawan.add(new manager("gio"));

        manager mgr = new manager ("gio");
        daftarkaryawan.add(mgr);

        for(pegawai daftar : daftarkaryawan) {
            daftar.bekerja();
        }
}

}
