import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner dengan nama variabel input
        Scanner input = new Scanner(System.in);

        //Deklarasi tipe data dengan data yang sesuai
        int jam;
        double upah = 30000.0, gajiA, gajiB, gaji ;
        float bonus = 10/100f, pajak = 5/100f;

        System.out.print("Masukkan jumlah jam kerja: ");
        jam = input.nextInt();
        input.close();

        gajiA = jam * upah;
        gajiB = gajiA + (gajiA * bonus);
        gaji = gajiB - (gajiB * pajak);


        System.out.println("Gaji anda Rp " + gaji);
    }
}
