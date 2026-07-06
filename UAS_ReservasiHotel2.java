import java.util.*;

public class UAS_ReservasiHotel2 {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> listName = new ArrayList<>();
    static ArrayList<Integer> listRoomNumber = new ArrayList<>();
    static ArrayList<Integer> listDuration = new ArrayList<>();

    public static void main(String[] args) {
        int menu;

        do {
            System.out.println("selamat datang di e-wallet");
            System.out.println("1. tambah tamu");
            System.out.println("2. update durasi menginap");
            System.out.println("3. checkout tamu");
            System.out.println("4. lihat semua data");
            System.out.println("5. keluar");
            System.out.print("pilih menu (1-5) : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: // tambah tamu
                    addTamu();
                    break;

                case 2: // update durasi menginap tamu
                    updateDurasiTamu();
                    break;

                case 3: // checkout
                    checkout();
                    break;

                case 4: // lihat semua data
                    allData();
                    break;

                case 5: // keluar
                    out();
                    break;
            }
        } while (menu != 5);
    }

    public static void addTamu() {
        System.out.println("menu tambah tamu");
        System.out.print("berapa jumlah tamu : ");
        int jumlahAdd = sc.nextInt();
        
        for (int i = 0; i < jumlahAdd; i++) {
            System.out.print("masukkan nama tamu ke-" + (i + 1) + " : ");
            sc.nextLine();
            String nama = sc.nextLine();

            System.out.print("masukkan nomor kamar tamu ke-" + (i + 1) + " : ");
            int nokamar = sc.nextInt();

            System.out.print("masukkan durasi menginap (hari) ke-" + (i + 1) + " : ");
            int durasi = sc.nextInt();

            listName.add(nama);
            listRoomNumber.add(nokamar);
            listDuration.add(durasi);
        }

        System.out.println("data tamu berhasi ditambahkan ! ");
        System.out.println("==============================");
    }

    public static void updateDurasiTamu() {
        
        if (listName.isEmpty()) {
            System.out.println("data tamu tidak ditemukan");
        } else {
            System.out.println("menu update durasi menginap tamu");
            System.out.println("berikut ini adalah data tamu : ");
            for (int i = 0; i < listName.size(); i++) {
                System.out.println((i + 1) + ". " + listName.get(i) + " | " + "nomor kamar : "
                        + listRoomNumber.get(i) + " | " + listDuration.get(i) + " hari");
            }

            System.out.print("pilih nomor tamu :");
            int pilih = sc.nextInt();

            if (pilih >= 1 && pilih <= listName.size()) {
                int index = pilih - 1;

                System.out.print("rubah menjadi berapa lama (hari) : ");
                int newDays = sc.nextInt();

                listDuration.set(index, newDays);

                System.out.println(
                        "durasi menginap tamu " + listName.get(index) + " berhasil diperbarui");
            } else {
                System.out.println("nomor tamu tidak tersedia");
            }
        }
        System.out.println("==============================");
    }

    public static void checkout() {
        System.out.println("menu checkout");

        if (listName.isEmpty()) {
            System.out.println("data tamu tidak ditemukan");
        } else {
            System.out.println("berikut ini adalah data tamu : ");
            for (int i = 0; i < listName.size(); i++) {
                System.out.println((i + 1) + ". " + listName.get(i) + " | " + "nomor kamar : "
                        + listRoomNumber.get(i) + " | " + listDuration.get(i) + " hari");
            }

            System.out.print("pilih nomor tamu :");
            int pilih = sc.nextInt();

            if (pilih >= 1 && pilih <= listName.size()) {
                int index = pilih - 1;

                System.out.println("tamu : " + listName.get(index) + " berhasil checkout");

                listName.remove(index);
                listRoomNumber.remove(index);
                listDuration.remove(index);
            } else {
                System.out.println("nomor tamu tidak tersedia");
            }
        }
        System.out.println("==============================");

    }

    public static void allData() {
        if (listName.isEmpty()) {
            System.out.println("data tamu tidak ditemukan");
        } else {

            System.out.println("lihat semua data tamu ");
            for (int i = 0; i < listName.size(); i++) {
                System.out.println((i + 1) + ". " + listName.get(i) + " | " + "nomor kamar : "
                        + listRoomNumber.get(i) + " | " + listDuration.get(i) + " hari");
            }
        }
        System.out.println("==============================");
    }

    public static void out() {
        System.out.println("keluar program berhasil !");
        System.out.println("terimakasih");
    }
}

// fucking done 35mins