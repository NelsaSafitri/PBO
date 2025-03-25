// Superclass: User
class User {
    protected String nama;
    protected String id;

    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
    }
}

// Subclass: Siswa
class Siswa extends User {
    public Siswa(String nama, String id) {
        super(nama, id);
    }

    // Overriding metode absen()
    public void absen() {
        System.out.println(nama + " telah melakukan absensi sebagai Siswa.");
    }
}

// Subclass: Guru
class Guru extends User {
    public Guru(String nama, String id) {
        super(nama, id);
    }

    // Overriding metode absen()
    public void absen() {
        System.out.println(nama + " telah melakukan absensi sebagai Guru.");
    }
}

// Subclass: Admin
class Admin extends User {
    public Admin(String nama, String id) {
        super(nama, id);
    }

    // Overloading metode buatIDCard()
    public void buatIDCard(Siswa siswa) {
        System.out.println("Admin membuat ID Card untuk Siswa: " + siswa.nama);
    }

    public void buatIDCard(Guru guru) {
        System.out.println("Admin membuat ID Card untuk Guru: " + guru.nama);
    }

    public void cetakLaporan(String tipeLaporan) {
        System.out.println("Admin mencetak laporan: " + tipeLaporan);
    }
}

// Class OrangTua
class OrangTua {
    private String namaAnak;

    public OrangTua(String namaAnak) {
        this.namaAnak = namaAnak;
    }

    public void terimaLaporan() {
        System.out.println("Orang tua dari " + namaAnak + " menerima laporan kehadiran.");
    }
}

// Class KepalaSekolah
class KepalaSekolah {
    public void terimaLaporan() {
        System.out.println("Kepala sekolah menerima laporan kehadiran guru.");
    }
}

// Main Program
public class SistemAbsensi {
    public static void main(String[] args) {
        // Membuat objek
        Siswa siswa1 = new Siswa("Budi", "S123");
        Guru guru1 = new Guru("Pak Rudi", "G456");
        Admin admin = new Admin("Admin1", "A789");
        OrangTua ortu = new OrangTua("Budi");
        KepalaSekolah kepalaSekolah = new KepalaSekolah();

        // Proses absensi
        siswa1.absen();
        guru1.absen();

        // Admin membuat ID Card
        admin.buatIDCard(siswa1);
        admin.buatIDCard(guru1);

        // Admin mencetak laporan
        admin.cetakLaporan("Absensi Siswa");
        admin.cetakLaporan("Absensi Guru");

        // Orang tua dan kepala sekolah menerima laporan
        ortu.terimaLaporan();
        kepalaSekolah.terimaLaporan();
    }
}
