import java.util.Scanner;

public class MahasiswaVoid06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine(); //fungsi sc.nexline digunakan untuk ntuk menghapus sisa enter dari input angka, 
         // agar input teks berikutnya bisa dibaca dengan benar dan tidak terlewati

        Mahasiswa06[] arrayOfMahasiswa = new Mahasiswa06[jml];

       
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i] = new Mahasiswa06(); // instansiasi objek adalah proses pembuatan objek dari sebuah class
            arrayOfMahasiswa[i].tambahData(sc); // panggil method tambahData
            System.out.println("---------------------------");
        }

        
        System.out.println("\n=== Hasil Input Data Mahasiswa ===");
        for (int i = 0; i < jml; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].tampilkanInfo();

            // tambah mata kuliah
            System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
            int jmlMK = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < jmlMK; j++) {
                System.out.println("Masukkan Data Mata Kuliah ke-" + (j + 1));
                MataKuliah06 mk = new MataKuliah06();
                mk.tambahData(sc);
                arrayOfMahasiswa[i].tambahMataKuliah(mk);
                System.out.println("---------------------------");
            }

            // hitung total SKS
            arrayOfMahasiswa[i].hitungTotalSKS();

            // ubah jurusan
            System.out.println("=== Ubah Data Mahasiswa ===");
            System.out.print("Masukkan jurusan baru: ");
            String jurusanBaru = sc.nextLine();
            arrayOfMahasiswa[i].ubahJurusan(jurusanBaru);

            // tampilan setelah diubah
            System.out.println("=== Setelah diubah ===");
            arrayOfMahasiswa[i].tampilkanInfo();
            arrayOfMahasiswa[i].hitungTotalSKS();

           
        }
    }
}
