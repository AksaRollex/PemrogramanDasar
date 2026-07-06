
import java.util.*;

public class UAS_ReservasiHotel {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> listName = new ArrayList<>();
    static ArrayList<Integer> listRoomNumber = new ArrayList<>();
    static ArrayList<Integer> listDuration = new ArrayList<>();

    public static void main(String[] args) {

        int menu;

        do {
            System.out.println("--- Selamat datang di APK E-Wallet ---");
            System.out.println("1. tambah tamu");
            System.out.println("2. update lama menginap");
            System.out.println("3. checkout tamu");
            System.out.println("4. tampilkan tamu");
            System.out.println("5. keluar");
            System.out.println("pilih menu (1-5) : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("masukkan jumlah tamu : ");
                    int jumlah = sc.nextInt();

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("masukkan nama : ");
                        String nm = sc.nextLine();

                        System.out.println("masaukkan nomor kamar ");
                        int nmr = sc.nextInt();

                        System.out.println("masukkan lama menginap (hari) : ");
                        int durasi = sc.nextInt();

                        listName.add(nm);
                        listRoomNumber.add(nmr);
                        listDuration.add(durasi);

                        System.out.println("data tamu berhasi diinput");
                    }

                case 2:
                    System.out.println("update lama menginap tamu");
                    System.out.println("berikut ini adalah daftar tamunya :");

                    for (int i = 0; i < listName.size(); i++) {
                        System.out.println("=================");
                        System.out.println((i + 1) + ". " + listName.get(i) + " | ");
                        System.out.println("nomor kamar = " + listRoomNumber.get(i) + " | ");
                        System.out.println(listDuration.get(i));
                    }

                    System.out.println("pilih data keberapa : ");
                    int pilihan = sc.nextInt();
                    if (pilihan >= 1 && pilihan <= listName.size()) {
                        int pilihans = pilihan - 1;

                        System.out.println((pilihans + 1) + ". " + listName.get(pilihans) + " | ");
                        System.out.println("nomor kamar = " + listRoomNumber.get(pilihans) + " | ");
                        System.out.println(listDuration.get(pilihans));

                        System.out.println("update menjadi berapa hari? : ");
                        int newDays = sc.nextInt();

                        listRoomNumber.set(pilihans, newDays);

                        System.out.println("data berhasil di update");
                    }

                case 3:
                case 4:
                case 5:
                default:
                    System.out.println("menu tidak tersedia !");
            }
        } while (menu != 5);
    }
}
