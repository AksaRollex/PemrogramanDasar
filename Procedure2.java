import java.util.Scanner;

public class Procedure2 {

    static Scanner input = new Scanner(System.in);

    static String namaBarang;

    static void inputData() {
        System.out.print("Masukkan Nama Barang : ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan Jumlah Barang : ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = input.nextInt();

        outputData(namaBarang, jumlahBarang, hargaBarang );
        hitungTotal(hargaBarang, jumlahBarang);
    }

    static void outputData(String namabarung, int jumlahBarang, int hargaBarang) {
        System.out.println("Nama Barang : " + namabarung);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        int total = hitungTotal(hargaBarang, jumlahBarang);
        System.out.println("Total Pembayaran : " + total);
    }

    static int hitungTotal(int harga, int jumlah) {
        int total = harga * jumlah;
        return total;
    }

    public static void main(String[] args) {
        inputData();

        /*
         * 1. procedure input data penjualan dengan varabel namaBarang, jumlahBarang,
         * hargaBaranwg
         * 2. function hitungTotal dengan parameter harga dan jumlah bertipe int
         * 3. total pembayaran diproses pada procedure input
         * 4. procedure outputData untuk menampilkan data barang dan total pembayaran
         */
    }
}
