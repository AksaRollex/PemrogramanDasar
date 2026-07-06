import java.util.ArrayList;
import java.util.Scanner;

public class UAS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nik = new ArrayList<>();
        ArrayList<Integer> saldo = new ArrayList<>();

        int menu;

        do {
            System.out.println("\n===== MENU BANK XYZ =====");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Update Saldo Nasabah");
            System.out.println("3. Blokir Akun Nasabah");
            System.out.println("4. Tampilkan Seluruh Data Nasabah");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {

                case 1:
                    System.out.print("Masukkan jumlah nasabah: ");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nData Nasabah Ke-" + (i + 1));

                        System.out.print("Nama  : ");
                        String n = input.nextLine();

                        System.out.print("NIK   : ");
                        String k = input.nextLine();

                        System.out.print("Saldo : ");
                        int s = input.nextInt();
                        input.nextLine();

                        nama.add(n);
                        nik.add(k);
                        saldo.add(s);
                    }

                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    if (nama.size() == 0) {
                        System.out.println("Belum ada data nasabah.");
                    } else {

                        System.out.println("\n===== DATA NASABAH =====");
                        for (int i = 0; i < nama.size(); i++) {
                            System.out.println((i + 1) + ". " + nama.get(i)
                                    + " | Saldo : " + saldo.get(i));
                        } 

                        System.out.print("Pilih nomor nasabah: ");
                        int index = input.nextInt() - 1; // dikurangin 1 karena array

                        if (index >= 0 && index < saldo.size()) { 
                            System.out.print("Masukkan saldo baru: ");
                            int saldoBaru = input.nextInt();

                            saldo.set(index, saldoBaru);

                            System.out.println("Saldo berhasil diupdate.");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    }
                    break;

                case 3:
                    if (nama.size() == 0) {
                        System.out.println("Belum ada data nasabah.");
                    } else {

                        System.out.println("\n===== DATA NASABAH =====");
                        for (int i = 0; i < nama.size(); i++) {
                            System.out.println((i + 1) + ". " + nama.get(i));
                        }

                        System.out.print("Pilih nomor nasabah yang diblokir: ");
                        int hapus = input.nextInt() - 1; // dikurangin 1 karena array

                        if (hapus >= 0 && hapus < nama.size()) {
                            nama.remove(hapus);
                            nik.remove(hapus);
                            saldo.remove(hapus);

                            System.out.println("Akun berhasil diblokir.");
                        } else {
                            System.out.println("Data tidak ditemukan.");
                        }
                    }
                    break;

                case 4:
                    if (nama.size() == 0) {
                        System.out.println("Belum ada data nasabah.");
                    } else {

                        System.out.println("\n===== DATA NASABAH =====");

                        for (int i = 0; i < nama.size(); i++) {
                            System.out.println("Nasabah Ke-" + (i + 1));
                            System.out.println("Nama  : " + nama.get(i));
                            System.out.println("NIK   : " + nik.get(i));
                            System.out.println("Saldo : Rp " + saldo.get(i));
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (menu != 5);

        input.close();
    }
}