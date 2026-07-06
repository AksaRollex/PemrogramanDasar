
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
            System.out.print("pilih menu (1-5) : ");
            menu = sc.nextInt();
            System.out.println("=========================");

            switch (menu) {
                case 1:
                    System.out.print("masukkan jumlah tamu : ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("masukkan nama tamu ke-" + (i + 1) + " : ");
                        String nama = sc.nextLine();

                        System.out.print("masukkan nomor kamar tamu ke-" + (i + 1) + " : ");
                        int nomorkamar = sc.nextInt();

                        System.out.print("masukkan lama menginap (hari) tamu ke-" + (i + 1) + " : ");
                        int durasi = sc.nextInt();

                        listName.add(nama);
                        listRoomNumber.add(nomorkamar);
                        listDuration.add(durasi);

                        System.out.println("data tamu berhasi diinput");
                        System.out.println("=========================");
                    }
                    break;

                case 2:
                    if (listName.isEmpty()) {
                        System.out.println("tamu tidak ditemukan");
                        break;
                    }

                    System.out.println("update lama menginap tamu");
                    System.out.println("berikut ini adalah daftar tamunya :");
                    System.out.println("=========================");

                    for (int i = 0; i < listName.size(); i++) {
                        System.out.print((i + 1) + ". " + listName.get(i) + " | ");
                        System.out.print("nomor kamar = " + listRoomNumber.get(i) + " | ");
                        System.out.print("durasi = " + listDuration.get(i) + " hari");
                    }
                    System.out.println();
                    System.out.println("=========================");

                    System.out.print("pilih data keberapa : ");
                    int pilihan = sc.nextInt();
                    if (pilihan >= 1 && pilihan <= listName.size()) {
                        int index = pilihan - 1;

                        System.out.print("update menjadi berapa hari? : ");
                        int newDays = sc.nextInt();

                        listRoomNumber.set(index, newDays);

                        System.out.println("data berhasil di update");
                        System.out.println("=========================");
                    } else {
                        System.out.println("nomor tamu tidak ada !");
                    }
                    break;

                case 3:
                    if (listName.isEmpty()) {
                        System.out.println("tamu tidak ditemukan");
                        break;
                    }
                    System.out.println("checkout tamu");

                    System.out.println("berikut ini adalah daftar tamunya :");

                    System.out.println("=========================");
                    for (int i = 0; i < listName.size(); i++) {
                        System.out.print((i + 1) + ". " + listName.get(i) + " | ");
                        System.out.print("nomor kamar = " + listRoomNumber.get(i) + " | ");
                        System.out.print(listDuration.get(i) + " hari");
                    }
                    System.out.println();
                    System.out.println("=========================");

                    System.out.print("pilih data keberapa yang dihapus : ");
                    int pilihanremove = sc.nextInt();
                    if (pilihanremove >= 1 && pilihanremove <= listName.size()) {
                        int index = pilihanremove - 1;

                        System.out.println((index + 1) + ". " + listName.get(index) + " | ");
                        System.out.println("nomor kamar = " + listRoomNumber.get(index) + " | ");
                        System.out.println(listDuration.get(index));

                        System.out.println("data " + listName.get(index) + " berhasil di hapus");
                        listName.remove(index);
                        listDuration.remove(index);
                        listRoomNumber.remove(index);

                        System.out.println("=========================");
                    } else {
                        System.out.println("nomor tamu tidak ada !");
                    }
                    break;

                case 4:
                    if (listName.isEmpty()) {
                        System.out.println("daftar tamu kosong");
                        break;
                    }

                    System.out.println("berikut ini adalah seluruh data tamu : ");
                    System.out.println("=========================");
                    for (int i = 0; i < listName.size(); i++) {
                        System.out.println((i + 1) + ". " +     listName.get(i) + " | " + "nomor kamar : " + listRoomNumber.get(i)
                                + " | " + "durasi : "
                                + listDuration.get(i));
                    }
                    System.out.println("=========================");
                    break;

                case 5:
                    System.out.println("terimakasih");
                    break;

                default:
                    System.out.println("menu tidak tersedia !");
            }
        } while (menu != 5);
    }
}
