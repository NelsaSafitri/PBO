// Superclass
class Kendaraan {
    protected String merk;
    protected int tahunProduksi;

    // Constructor
    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Method yang akan dioverride
    public void info() {
        System.out.println("Kendaraan Merk: " + merk + ", Tahun: " + tahunProduksi);
    }

    // Method overloading
    public void start() {
        System.out.println("Kendaraan dinyalakan secara default.");
    }

    public void start(String mode) {
        System.out.println("Kendaraan dinyalakan dalam mode: " + mode);
    }
}

// Subclass 1
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    // Overriding method info
    @Override
    public void info() {
        System.out.println("Mobil Merk: " + merk + ", Tahun: " + tahunProduksi + ", Pintu: " + jumlahPintu);
    }
}

// Subclass 2
class Motor extends Kendaraan {
    private boolean memilikiBox;

    public Motor(String merk, int tahunProduksi, boolean memilikiBox) {
        super(merk, tahunProduksi);
        this.memilikiBox = memilikiBox;
    }

    // Overriding method info
    @Override
    public void info() {
        System.out.println("Motor Merk: " + merk + ", Tahun: " + tahunProduksi + ", Memiliki Box: " + (memilikiBox ? "Ya" : "Tidak"));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Generic", 2020);
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        Motor motor = new Motor("Honda", 2021, true);

        // Demonstrasi inheritance dan overriding
        System.out.println("=== Informasi Kendaraan ===");
        kendaraan.info();
        mobil.info();
        motor.info();

        // Demonstrasi method overloading
        System.out.println("\n=== Demonstrasi Overloading ===");
        kendaraan.start();
        kendaraan.start("Sport Mode");
    }
}
