import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner dengan nama variabel input
        Scanner input = new Scanner(System.in);

        //Deklarasi tipe data dengan data yang sesuai
        int kwh;
        double harga = 1500.0, totalTagihan;

        System.out.print("Masukkan jumlah kWh yang anda gunakan: ");
        kwh = input.nextInt();
        input.close();

        if (kwh > 500) {
            System.out.println("Penggunaan kWh anda telah melebihi 500 kWh");
              }

        totalTagihan = (kwh * harga);

        System.out.println("Total tagihan Rp " + totalTagihan);
    }
}
