package ErigoStoreMalang;

import java.util.Scanner;

public class ErigoStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("\t\t\t  SELAMAT DATANG\n");
        System.out.printf("\t\t~~~~~Erigo Store Malang~~~~~\n\n");

        System.out.println("Daftar koleksi baju Erigo Store:");
        System.out.printf("1. Baju A: Rp100.000.\n" +
                "2. Baju B: Rp125.000.\n" +
                "3. Baju C: Rp175.000.\n\n");
        System.out.printf("Jika anda berbelanja lebih dari 100 baju,"
                + "\nmaka akan ada diskon untuk setiap bajunya."
                + "\nMulai dari Rp5.000 hingga Rp15.000.\n\n");

        System.out.println("Pilih jenis baju yang akan ada beli: ");
        String jenisBaju = input.nextLine();
        System.out.println("Masukkan jumlah baju yang akan anda beli: ");
        int jmlBaju = input.nextInt();

        Baju bayar = new Baju();
        bayar.totalHarga(jenisBaju, jmlBaju);

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.printf("\t\t\tTERIMA KASIH\n");
        System.out.printf("\t\tATAS KUNJUNGAN ANDA\n");
    }
}
