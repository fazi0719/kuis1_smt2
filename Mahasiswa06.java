import java.util.Scanner;
public class Mahasiswa06 {
    //atribut
    public String nim;
    public String nama;
    public int tahunMasuk;
    public String jurusan;
    public MataKuliah06[] mataKuliahDiambil;
    public int jumlahMataKuliah;

    public Mahasiswa06() {
         mataKuliahDiambil = new MataKuliah06[8]; // maksimal 8 MK
        jumlahMataKuliah = 0;
    } // kenapa menggunakan mataKuliahDiambil? agar bisa menyimpan data mata kuliah yang diambil

    public Mahasiswa06(String nim, String nama, int tahunMasuk, String jurusan, MataKuliah06[] mataKuliahDiambil, int jumlahMataKuliah) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jurusan = jurusan;
        this.mataKuliahDiambil = new MataKuliah06[8]; // maksimal 8 mata kuliah
        this.jumlahMataKuliah = 0;
    }
    public void tambahData(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Tahun Masuk: ");
        tahunMasuk = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Masukkan Jurusan: ");
        jurusan = sc.nextLine();
    }
     public void tambahMataKuliah(MataKuliah06 mk) {
        if (jumlahMataKuliah < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMataKuliah] = mk;
            jumlahMataKuliah++;
        } else {
            System.out.println("Tidak bisa menambah mata kuliah, sudah mencapai batas maksimal!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Mata Kuliah yang Diambil:");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("- " + mataKuliahDiambil[i].namaMK);
        }
    }
    
   
    public void hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += mataKuliahDiambil[i].sks;
        }
        System.out.println("Total SKS yang diambil: " + totalSKS);
    }
    public void ubahJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }
}
