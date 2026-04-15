import java.util.Scanner;

public class MieWacoan {
    // bismillah menjadi programmer sukses, aamiin
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuMakanan = { "Mie Hambar", "Mie Kecap Lv 1", "Mie Kecap Lv 2", "Mie Kecap Lv 3",
                "Mie Lombok Lv 1", "Mie Lombok Lv 2", "Mie Lombok Lv 3" };
        int[] hargaMakanan = { 10000, 15000, 20000, 25000, 30000, 35000, 40000 };

        String[] menuDimsum = { "Dimsum Ayam", "Dimsum Udang" };
        int[] hargaDimsum = { 15000, 20000 };

        String[] menuMinuman = { "Es Teh", "Es Jeruk" };
        int[] hargaMinuman = { 5000, 7000 };

        String[] semuaMenu = { "Mie Hambar", "Mie Kecap Lv 1", "Mie Kecap Lv 2", "Mie Kecap Lv 3",
                "Mie Lombok Lv 1", "Mie Lombok Lv 2", "Mie Lombok Lv 3", "Dimsum Ayam", "Dimsum Udang", "Es Teh",
                "Es Jeruk" };
        int[] semuaHarga = { 10000, 15000, 20000, 25000, 30000, 35000, 40000, 15000, 20000, 5000, 7000 };

        int[] jumlahPesan = new int[11];

        // menu
        System.out.println("--- Menu Mie Wacoan ---");

        System.out.println("\n--- Daftar Menu Makanan ---");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i] + " - Rp " + hargaMakanan[i]);
        }

        System.out.println("\n--- Daftar Menu Dimsum ---");
        for (int i = 0; i < menuDimsum.length; i++) {
            System.out.println((i + 1 + menuMakanan.length) + ". " + menuDimsum[i] + " - Rp " + hargaDimsum[i]);
            // + menuMakanan.length // -> nomor melanjutkan dari jumlah array nya menu makanan
        }
        System.out.println("\n--- Daftar Menu Minuman ---");
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i + 1 + menuMakanan.length + menuDimsum.length) + ". " + menuMinuman[i] + " - Rp "
                    + hargaMinuman[i]);
            // + menuMakanan.length // -> nomor melanjutkan dari jumlah array nya menu makanan dan dimsum
        }

        // looping pesanan
        String beliLagi = "ya";

        while (beliLagi.equals("ya")) {
            System.out.print("\nPilih nomor menu: ");
            int pilihan = scanner.nextInt();

            if (pilihan < 1 || pilihan > 11) { // jika inputan nomor menu kurang dari 1 atau lebih dari 9 (jumlah semua menu) maka akan menampilkan pesan error
                System.out.println("Nomor menu tidak ada, silakan pilih ulang.");
            } else {
                int index = pilihan - 1; // array mulai dari 0
                System.out.print("Berapa jumlahnya? ");
                int jumlah = scanner.nextInt();
                jumlahPesan[index] = jumlahPesan[index] + jumlah;
                System.out.println(semuaMenu[index] + " x" + jumlah + " ditambahkan ke pesanan.");
            }

            System.out.print("Mau pesan lagi? (ya/tidak): "); // tidak -> keluar dari loop -> menjalankan perintah berikutnya
            beliLagi = scanner.next();
        }

        // total
        int total = 0;
        for (int i = 0; i < semuaMenu.length; i++) {
            total = total + (jumlahPesan[i] * semuaHarga[i]);
        }

        // metode pembayaran
        System.out.println("\n--- Metode Pembayaran ---");
        System.out.println("1. Cash");
        System.out.println("2. Debit");
        System.out.println("3. QRIS");

        String metodeBayar = "";
        boolean inputValid = false;

        while (inputValid == false) { // ketika inputValid masih false (tidak memilih 1-3), maka akan terus meminta
                                      // inputan metode pembayaran sampai benar
            System.out.print("Pilih metode (1/2/3): ");
            int pilihanBayar = scanner.nextInt();

            if (pilihanBayar == 1) {
                metodeBayar = "Cash";
                inputValid = true;
            } else if (pilihanBayar == 2) {
                metodeBayar = "Debit";
                inputValid = true;
            } else if (pilihanBayar == 3) {
                metodeBayar = "QRIS";
                inputValid = true;
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih ulang.");
            }
        }

        // kembalian
        System.out.print("Masukkan uang pembeli: Rp ");
        int uangPembeli = scanner.nextInt();

        int kembalian = uangPembeli - total;

        // invoice
        System.out.println("\n--- Struk Pembayaran ---");
        for (int i = 0; i < semuaMenu.length; i++) {
            if (jumlahPesan[i] > 0) {
                System.out.println(semuaMenu[i] + " x" + jumlahPesan[i] + " = Rp " + (jumlahPesan[i] * semuaHarga[i]));
            }
        }

        System.out.println("Total          : Rp " + total);
        System.out.println("Metode Bayar   : " + metodeBayar);
        System.out.println("Uang Pembeli   : Rp " + uangPembeli);
        System.out.println("Kembalian      : Rp " + kembalian);
        System.out.println("\nTerima kasih sudah makan di Mie Wacoan!");

        scanner.close();
    }
}