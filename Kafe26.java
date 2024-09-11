import java.util.Scanner;
public class Kafe26 {
    public static void main(String[] args) {

        //Deklarasi Scanner dengan nama variabel input
        Scanner input = new Scanner(System.in);

        //Deklarasi tipe data dengan tipe yang sesuai
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        double totalHarga, nominalBayar;
        float diskon = 10/100f;

        //perintah untuk memasukkan keanggotaan, jmlKopi, jmlTeh, dan jmlRoti
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        //Menghitung total harga
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        //Menghitung nominal bayar
        nominalBayar = totalHarga - (diskon * totalHarga);

        //Tampilkan
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + "kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);





    }
}
