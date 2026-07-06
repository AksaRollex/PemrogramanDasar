import java.util.*;

public class UAS_Perbankan {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> saldo = new ArrayList<>();
    static ArrayList<Integer> nik = new ArrayList<>();
    static ArrayList<String> nama = new ArrayList<>();
    
    public static void main(String[] args) {
        int opsi;

        do {
            System.out.println("Selamat Datang di Perbankan XYZ");
            System.out.println("Silahkan untuk memilih menu yang tersedia : ");
            System.out.println("1. Tambah nasabah");
            System.out.println("2. Update saldo nasabah");
            System.out.println("3. Blokir akun nasabah");
            System.out.println("4. Tampilkan seluruh data nasabah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5) : ");
            opsi = sc.nextInt();
            System.out.println("==================");

            switch (opsi) {
                case 1:
                    inputNasabah();
                    break;

                case 2:
                    updateSaldo();
                    break;

                case 3:
                    blokir();
                    break;

                case 4:
                    showAll();
                    break;

                case 5:
                    out();

                    break;

                default:
                    System.out.println("Menu tidak tersedia !");
            }

        } while (opsi !=5);
    }

    public static void inputNasabah() {
        System.out.print("Masukkan jumlah nasabah : ");
        int nasabah = sc.nextInt();

        for (int i = 0; i < nasabah; i++) {
            System.out.print("Masukkan nama nasabah ke-" + (i + 1) + " : ");
            sc.nextLine();
            String n = sc.nextLine();

            System.out.print("Masukkan NIK nasabah ke-" + (i + 1) + " : ");
            int nk = sc.nextInt();

            System.out.print("Masukkan saldo awal nasabah ke-" + (i + 1) + " : ");
            int s = sc.nextInt();

            nama.add(n);
            nik.add(nk);
            saldo.add(s);

        }
        System.out.println("Nasabah baru berhasil ditambahkan !");
        System.out.println("==================");
    }

    public static void updateSaldo() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada nasabah ");
        }

        System.out.println("Daftar nasabah, nik, dan saldonya ");
        for (int i = 0; i < nama.size(); i++) {
            System.out.print((i + 1) + ". " + nama.get(i) + " | ");
            System.out.print(nik.get(i) + " | ");
            System.out.println(saldo.get(i));
        }
        System.out.println("==================");

        System.out.print("Pilih nomor nasabah : ");
        int pilih = sc.nextInt();

        if (pilih >= 1 && pilih <= nama.size()) {
            int index = pilih - 1;

            System.out.print("nama : " + nama.get(index) + " | ");
            System.out.print("nik : " + nik.get(index) + " | ");
            System.out.println("saldo : " + saldo.get(index));

            System.out.print("masukkan saldo baru : ");
            int saldobaru = sc.nextInt();

            saldo.set(index, saldobaru);

            System.out.println("saldo nasabah telah diperbarui");
        } else {
            System.out.println("nomor nasabah tidak valid ! ");
        }
        System.out.println("==================");
    }

    public static void blokir() {
        if (nama.isEmpty()) {
            System.out.println("nasabah tidak ditemukan");
        }

        System.out.println("Daftar nasabah ");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println((i + 1) + ". " + nama.get(i));
        }
        System.out.println("==================");

        System.out.print("Pilih nasabah yang diblokir : ");
        int blokir = sc.nextInt();

        if (blokir >= 1 && blokir <= nama.size()) {

            int idx = blokir - 1;

            System.out.println("nasabah " + nama.get(idx) + " berhasil di blokir");

            nama.remove(idx);
            saldo.remove(idx);
        }

        else {
            System.out.println("nasabah tidak ditemukan");
        }
        System.out.println("==================");

    }

    public static void showAll() {
        if (nama.isEmpty()) {
            System.out.println("data nasabah kosong");
        } else {
            System.out.println("daftar data nasabah : ");

            for (int i = 0; i < nama.size(); i++) {
                System.out.print((i + 1) + ". " + nama.get(i) + " | ");
                System.out.print(nik.get(i) + " | ");
                System.out.println(saldo.get(i));
            }
        }
        System.out.println("==================");

    }

    public static void out() {
        System.out.println("Terimakasih !");
    }
}
