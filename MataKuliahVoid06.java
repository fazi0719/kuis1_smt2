import java.util.Scanner;
public class MataKuliahVoid06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jml = sc.nextInt();

        MataKuliah06[] arrayOfMatakuliah = new MataKuliah06[jml];

         for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah06(); // Instansiasi objek
             arrayOfMatakuliah[i].tambahData(sc); // Panggil method tambahData
            System.out.println("---------------------------");
        }
        
        // fungsi perulangan 
        System.out.println("\n=== Hasil Input Data Matakuliah ===");
         for (int i = 0; i < jml; i++) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        arrayOfMatakuliah[i].tampilkanInfo();

        System.out.println("=== Ubah Data Matakuliah ===");

        System.out.print("Masukkan nama MK baru: ");
        String namaBaru = sc.nextLine();
        arrayOfMatakuliah[i].ubahNamaMK(namaBaru);

        System.out.print("Masukkan SKS baru: ");
        int sksBaru = sc.nextInt();
         sc.nextLine(); // kenapa menggunakan sc.nextLine() setelah nextInt()? karena untuk menghapus sisa enter dari input angka, 
         // agar input teks berikutnya bisa dibaca dengan benar dan tidak terlewati
        arrayOfMatakuliah[i].ubahSKS(sksBaru);

        System.out.print("Masukkan jumlah jam baru: ");
        int jamBaru = sc.nextInt();
         sc.nextLine(); 
        arrayOfMatakuliah[i].ubahJumlahJam(jamBaru);

        System.out.println("=== Setelah diubah ===");
        arrayOfMatakuliah[i].tampilkanInfo();
}
    }   
}
