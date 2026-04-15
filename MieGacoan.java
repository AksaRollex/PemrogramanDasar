import java.util.Scanner;

public class MieGacoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama_pemesan, no_meja = "", jenis_pesanan = "";
        int total = 0, harga = 0, jumlah = 0;

        System.out.print("Nama Pemesan : ");
        nama_pemesan = scanner.nextLine();

        System.out.println("--- Menu Gacoan ---");
        System.out.println("1. Mie Gacoan");
        System.out.println("2. Mie Hompimpa");
        System.out.println("3. Mie Suit");
        System.out.println("4. Dimsum");
        System.out.println("5. Minuman");
        System.out.print("Pilihan Menu : ");
        int pilih = scanner.nextInt();

        scanner.nextLine(); // untuk setelah enter pada setelah pilih menu

        if (pilih == 1 || pilih == 2) {
            System.out.print("Pilih Level (1-8) : ");
            int level = scanner.nextInt();
            scanner.nextLine();
            harga = 13000;
            System.out.print("Jumlah Pesanan : ");
            jumlah = scanner.nextInt();
            scanner.nextLine();
            total = harga * jumlah;
        } else if (pilih == 3) {
            harga = 10000;
            System.out.print("Jumlah Pesanan : ");
            jumlah = scanner.nextInt();
            scanner.nextLine();
            total = harga * jumlah;
        } else if (pilih == 4) {
            System.out.println("Pilih Menu Dimsum : \n 1. Dimsum Ayam \n 2. Dimsum Udang \n 3. Dimsum Cumi");
            System.out.print("Pilihan Dimsum: ");
            String dimsum = scanner.nextLine();
            harga = 11000;
            System.out.print("Jumlah Pesanan : ");
            jumlah = scanner.nextInt();
            scanner.nextLine();
            total = harga * jumlah;
        } else if (pilih == 5) {
            System.out.println("Pilih Menu Minuman : \n 1. Es Teh \n 2. Es Jeruk \n 3. Es Milo");
            System.out.print("Pilihan Minuman: ");
            String minuman = scanner.nextLine();
            harga = 7000;
            System.out.print("Jumlah Pesanan : ");
            jumlah = scanner.nextInt();
            scanner.nextLine();
            total = harga * jumlah;
        } else {
            System.out.println("Menu tidak valid.");
            return; // stop disaat salah
        }

        System.out.print("Jenis Pesanan : \n 1. Dine in \n 2. Take Away \n Pilihan Anda (1/2) : ");
        jenis_pesanan = scanner.nextLine();

        if (jenis_pesanan.equals("1")) {
            System.out.print("No Meja : ");
            no_meja = scanner.nextLine();
        } else if (jenis_pesanan.equals("2")) {
            no_meja = "Tidak ada";
            total += 2000;
        } else {
            System.out.println("Jenis pesanan tidak valid.");
            no_meja = "Invalid";
        }

        System.out.println("\n--- Struk Pembelian ---");
        System.out.println("Nama Pemesan : " + nama_pemesan);
        System.out.println("No Meja      : " + no_meja);
        // System.out.println("Pesanan      : " + pilih);
        System.out.println("Total Harga  : Rp" + total);

        scanner.close();
    }
}
