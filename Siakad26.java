import java.util.Scanner;

public class Siakad26 {

    public static void main(String[] args) {
        // deklarasi variable
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        // membuat scanner baru
        Scanner sc = new Scanner(System.in);

        // Tampilan output ke user
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}