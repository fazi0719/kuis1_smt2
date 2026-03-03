import java.util.Scanner;
public class MataKuliah06 {
    // atribut
    public String kodeMK;
    public String namaMK;
    public int sks;
    public int jumlahJam;
    public int semester;

    //konstruktor tanpa parameter
    // kenapa harus ada konstruktor tanpa parameter? agar objek dapat dibuat tanpa harus mengisi data
    public MataKuliah06() {
    }

    // konstruktor berparameter
    // kenapa menggunakan this? karena this digunakan untuk menunjuk ke atribut milik objek 
    // (class itu sendiri), supaya tidak tertukar dengan parameter yang namanya sama
    public MataKuliah06(String kodeMK, String namaMK, int sks, int jumlahJam, int semester) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        this.semester = semester;
    }
    // method untuk menambah data
    public void tambahData(Scanner sc) {
        System.out.print("Masukkan Kode MK: ");
        kodeMK = sc.nextLine();
        System.out.print("Masukkan Nama MK: ");
        namaMK = sc.nextLine();
        System.out.print("Masukkan SKS: ");
        sks = sc.nextInt();
        System.out.print("Masukkan Jumlah Jam: ");
        jumlahJam = sc.nextInt();
        System.out.print("Masukkan Semester: ");
        semester = sc.nextInt();
            sc.nextLine();
    }
    // menampilkan info
    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("Semester: " + semester);
    }
    //ubah namaMK
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    //ubahSKS
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }
    //ubah jumlahJam
    public void ubahJumlahJam(int jumlahJamBaru) {
        this.jumlahJam = jumlahJamBaru;
    }
}
