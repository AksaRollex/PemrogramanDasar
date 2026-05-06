import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {

        // variabel 5 barang
        // input nama barang dan harga barang menggunakan array 1d

        // decision diskon
        // total belanja >= 100.000, diskon 10%
        // total belanja >= 50.000, diskon 5%
        // total belanja <= 50.000, tidak mendapatkan diskon

        Scanner input = new Scanner(System.in);

        int menu;
        int jumlahData = 0;
        String[] barang = null;
        int[] harga = null;
        double total = 0;
        String textDiskon = "";
        double totalSebelumDiskon = 0;

        do {
            System.out.print("-------------------------------------");
            System.out.println("\n--- Selamat Datang di Aksa Store ---");
            System.out.println("--- Silahkan Untuk Memilih Menu ! ---");
            System.out.println("-------------------------------------");
            System.out.println("(1). Input Nama Barang & Harga"); // berapa barang (minimal 5 barang, jika dibawah 5
                                                                  // barang maka tidak bisa dan looping)
            System.out.println("(2). Lihat Menu");
            System.out.println("(3). Input Jumlah Beli");
            System.out.println("(4). Lihat Total Bayar");
            System.out.println("(5). Keluar Program");
            System.out.println("-------------------------------------");
            System.out.print("Masukkan Pilihan : ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Berapa Jumlah Data ? ");
                    jumlahData = input.nextInt();
                    input.nextLine();

                    if (jumlahData >= 5) {
                        barang = new String[jumlahData];
                        harga = new int[jumlahData];

                        for (int i = 0; i < jumlahData; i++) {
                            System.out.print("Input Barang " + (i + 1) + " : ");
                            barang[i] = input.next();
                            input.nextLine();
                            System.out.print("Input Harga " + (i + 1) + " : ");
                            harga[i] = input.nextInt();
                            input.nextLine();
                        }
                    } else {
                        System.out.println("!! Minimal Penginputan Data Barang Adalah 5 Barang !!");
                    }

                    break;

                case 2:
                    if (jumlahData == 0) {
                        System.out.println("Data belum diinput!");
                        break;
                    }

                    System.out.println("--- Menu Aksa Store ----");
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.println((i + 1) + ". " + barang[i] + " - Rp " + harga[i]);
                    }
                    break;

                case 3:
                    if (jumlahData == 0) {
                        System.out.println("Data belum diinput!");
                        break;
                    }

                    total = 0;

                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Jumlah Beli untuk " + barang[i] + " : ");
                        int jumlahBeli = input.nextInt();
                        input.nextLine();
                        total += jumlahBeli * harga[i];
                    }

                    totalSebelumDiskon = total;

                    if (total >= 100000) {
                        total -= total * 0.1;
                        textDiskon = "Kamu Belanja >= 100.000, Maka kamu Mendapatkan Diskon 10%";
                    } else if (total >= 50000) {
                        total -= total * 0.05;
                        textDiskon = "Kamu Belaja >= 50.000, Maka kamu Mendapatkan Diskon 5%";
                    } else if (total <= 50000) {
                        total = total;
                        textDiskon = "Kamu Belanja <= 50.000, Maka Kamu Tidak Mendapatkan Diskon";
                    } else {
                        System.out.println("Data belum diinput!");
                    }

                    break;

                case 4:
                    System.out.printf("Total Bayar Sebelum Diskon : Rp %.0f\n", totalSebelumDiskon);
                    System.out.printf("Total Bayar Setelah Diskon: Rp %.0f\n", total);
                    System.out.println(textDiskon);
                    break;

                case 5:
                    System.out.println("Keluar Program Berhasil");
                    break;

                default:
                    System.out.println("Pilihan Salah");
            }

        } while (menu != 5);

        input.close();
    }
}