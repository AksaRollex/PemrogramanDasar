import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menu;
        int jumlahData = 0;
        String[] kategori = null;
        int[] harga = null;
        int total = 0;

        do {
            System.out.println("\n--- Pemesanan Tiket SurabayaZoo ---");
            System.out.println("(1). Input Kategori & Harga");
            System.out.println("(2). Input Jumlah Beli");
            System.out.println("(3). Lihat Total Bayar");
            System.out.println("(4). Keluar Program");
            System.out.print("Masukkan Pilihan : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Berapa Jumlah Data ? ");
                    jumlahData = input.nextInt();

                    kategori = new String[jumlahData];
                    harga = new int[jumlahData];

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Input Kategori " + (i + 1) + " : ");
                        kategori[i] = input.next();
                        System.out.print("Input Harga : ");
                        harga[i] = input.nextInt();
                    }
                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Data belum diinput!");
                        break;
                    }

                    total = 0;

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Jumlah tiket untuk " + kategori[i] + " : ");
                        int jumlahBeli = input.nextInt();
                        total += jumlahBeli * harga[i];
                    }
                    break;

                case 3:
                    System.out.println("Total Bayar : Rp " + total);
                    break;

                case 4:
                    System.out.println("Keluar Program Berhasil");
                    break;

                default:
                    System.out.println("Pilihan Salah");
            }

        } while (menu != 4);

        input.close();
    }
}