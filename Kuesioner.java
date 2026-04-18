import java.util.Scanner;
import java.util.Timer;

public class Kuesioner {
    public static void main(String[] args) {

        // -------------- analisis pribadi --------------
        /*
         * pertanyaan : program menargetkan 10 responden untuk mengisi kuesioner. setiap
         * responden
         * mengisi akan menambah jumlah data. namun, jika waktu survei selesai,
         * pengisian dihetikan walaupun belum mencapai target.
         * 
         * wajib ada percabangan dan looping
         * 
         * 
         * 
         * pov : di satu tempat terdapat 10 responden, ibarat 1 device ini digunakan
         * mengisi kuesioner oleh 10 responden, tetapi devicenya digunakan bergantian,
         * dan ketika mengisi setiap responden nanti terdapat waktu 15detik untuk
         * mengisi beberapa pertanyaan yang telah disediakan, jika tidak tidak
         * menyelesaikan pertanyaan yang telah disediakan, maka nanti akan terdapat
         * track berapa pertanyaan yang terjawab dari beberapa pertanyaan, lalu akan
         * melanjutkan ke responden berikutnya.
         * 
         * 
         * 
         * analisis :
         * - 10 responden
         * - variabel : no responden, nama, alamat, umur, nomor telepon, pendidikan,
         * waktu pengisian, jumlah pertanyaan yang terjawab, jumlah pertanyaan, status.
         * 1 responden = 15 detik * 10 responden = 150 detik = 2 menit 30 detik
         * waktu sela saya = 2 menit 30 detik
         * waktu selalu running meskipun dalam proses percabangan ke responden
         * berikutnya
         * 
         * 
         * output yang saya inginkan :
         * 
         * -----------------------------------
         * nama peneliti = aksa
         * -----------------------------------
         * pada kesempatan kali ini, kamu hanya ditargetkan untuk mengisi
         * 10 responden dengan waktu yang telah ditentukan
         * 
         * (clear terminal)
         * -----------------------------------
         * waktu pengisian pertanyaan tersisa : 7 detik tersisa
         * waktu peneliti tersisa : 2 menit 18 detik tersisa
         * -----------------------------------
         * nomor responden = 1
         * nama responden = budi
         * alamat = jakarta
         * umur = 20
         * nomor telepon = 08123456789
         * pendidikan = sma
         * jumlah pertanyaan yang terjawab = 3/5
         * status = selesai
         * 
         * percabangan : ingin melanjutkan ke responden berikutnya atau tidak, jika iya
         * maka akan melanjutkan ke responden berikutnya, jika tidak maka akan
         * menghentikan program dan menampilkan data yang telah diisi oleh responden
         * yang telah mengisi kuesioner
         * 
         * nomor responden = 10
         * nama responden = budi
         * alamat = jakarta
         * umur = 20
         * nomor telepon = 08123456789
         * pendidikan = sma
         * jumlah pertanyaan yang terjawab = 3/5
         * status = selesai
         * 
         * jumlah responden yang berhasil mengisi kuesioner dengan lengkap = 7 responden
         * jumlah responden yang tidak berhasil mengisi kuesioner dengan lengkap = 3
         * responden
         * 
         * }
         */

        // deklarasi variabel
        int
        total_responden, 
        no_responden,
        jumlah_pertanyaan,
        jumlah_terjawab,
        berhasil_tuntas = 0,
        tidak_berhasil_tuntas = 0;
        
        String
        nama_peneliti,
        status,
        pertanyaan1,
        pertanyaan2,
        pertanyaan3,
        pertanyaan4,
        pertanyaan5,
        nama_responden,
        alamat,
        umur,
        nomor_telepon,
        pendidikan;

        boolean lanjut_responden = true;
        Timer timer = new Timer();
        Scanner input = new Scanner(System.in);

        // input nama peneliti
        System.out.print("nama peneliti = ");
        nama_peneliti = input.nextLine();
        System.out.println("Hai " + nama_peneliti
                + ", pada kesempatan kali ini, kamu hanya ditargetkan untuk mengisi 10 responden dengan waktu yang telah ditentukan");
        System.out.println("-----------------------------------");

        total_responden = 10;
        no_responden = 1;
        jumlah_pertanyaan = 5;
        jumlah_terjawab = 0;
        nama_responden = "";
        alamat = "";
        umur = "";
        nomor_telepon = "";
        pertanyaan1 = "";
        pertanyaan2 = "";
        pertanyaan3 = "";
        pertanyaan4 = "";
        pertanyaan5 = "";
       

        // pengulangan untuk setiap responden
        do {

            System.out.println("no responden = " + no_responden);

            // biodata responden
            System.out.print("nama responden = ");
            nama_responden = input.nextLine();

            System.out.print("alamat = ");
            alamat = input.nextLine();

            System.out.print("umur = ");
            umur = input.nextLine();

            System.out.print("nomor telepon = ");
            nomor_telepon = input.nextLine();

            System.out.print("pendidikan (kuliah/sma)= ");
            pendidikan = input.nextLine();
            if (pendidikan.equalsIgnoreCase("kuliah") || pendidikan == "kuliah") {
                System.out.print("kuliah dimana = ");
                pendidikan = input.nextLine();
            } else if (pendidikan.equalsIgnoreCase("sma") || pendidikan == "sma") {
                System.out.print("sma dimana = ");
                pendidikan = input.nextLine();
            } else {
                System.out.print("input tidak valid");
            }

            // pertanyaan responden
            System.out.println("-----------------------------------");
            System.out.println("pertanyaan");
            System.out.println("waktu pengisian pertanyaan tersisa : 15 detik tersisa");
            System.out.println("-----------------------------------");
            System.out.print("1. Apa warna kesukaanmu? ");
            pertanyaan1 = input.nextLine();
            if (!pertanyaan1.isEmpty()) {
                jumlah_terjawab++;
            }
            System.out.print("2. Apa makanan favoritmu? ");
            pertanyaan2 = input.nextLine();
            if (!pertanyaan2.isEmpty()) {
                jumlah_terjawab++;
            }
            System.out.print("3. Apa hobi kamu? ");
            pertanyaan3 = input.nextLine();
            if (!pertanyaan3.isEmpty()) {
                jumlah_terjawab++;
            }
            System.out.print("4. Apa film favoritmu? ");
            pertanyaan4 = input.nextLine();
            if (!pertanyaan4.isEmpty()) {
                jumlah_terjawab++;
            }
            System.out.print("5. Apa tempat liburan favoritmu? ");
            pertanyaan5 = input.nextLine();
            if (!pertanyaan5.isEmpty()) {
                jumlah_terjawab++;
            }
            System.out.println("-----------------------------------");

            status = (jumlah_terjawab == jumlah_pertanyaan) ? "selesai" : "tidak selesai";
            if (status.equals("selesai")) {
                berhasil_tuntas++;
            } else {
                tidak_berhasil_tuntas++;
            }

            System.out.println("jumlah pertanyaan yang terjawab = " + jumlah_terjawab + "/" + jumlah_pertanyaan);
            System.out.println("status = " + status);
            System.out.println("-----------------------------------");

            String jawaban;

            // percabangan : ingin melanjutkan ke responden berikutnya atau tidak
            while (true) {
                System.out.print("ingin melanjutkan ke responden berikutnya? (ya/tidak) = ");
                jawaban = input.nextLine();

                if (jawaban.equalsIgnoreCase("ya")) {
                    lanjut_responden = true;
                    break;
                } else if (jawaban.equalsIgnoreCase("tidak")) {
                    lanjut_responden = false;

                    System.out.println("jumlah responden yang berhasil mengisi kuesioner dengan lengkap = "
                            + berhasil_tuntas + " responden");
                    System.out.println("jumlah responden yang tidak berhasil mengisi kuesioner dengan lengkap = "
                            + tidak_berhasil_tuntas + " responden");

                    no_responden = total_responden;
                    System.out.println("------- terima kasih telah menggunakan program ini -------");
                    break;
                } else {
                    System.out.println("input tidak valid! hanya boleh 'ya' atau 'tidak'");
                }
            }

            System.out.println("-----------------------------------");

            if (lanjut_responden == true) {
                no_responden++;
                jumlah_terjawab = 0;
            }

        } while (no_responden < total_responden);

        // menghitung jumlah responden yang gagal mengisi kuesioner karena waktu habis
        int gagal = 0;
        if (pertanyaan1.isEmpty() || pertanyaan2.isEmpty() || pertanyaan3.isEmpty() || pertanyaan4.isEmpty()
                || pertanyaan5.isEmpty()) {
            gagal++;
            System.out.println("waktu pengisian pertanyaan habis, lanjut ke responden berikutnya");
        }

        // final result
        if (no_responden == total_responden) {
            System.out.println("------- rekap data -------");
            System.out.println("jumlah responden yang berhasil mengisi kuesioner dengan lengkap = "
                    + berhasil_tuntas + " responden");
            System.out.println("jumlah responden yang tidak berhasil mengisi kuesioner dengan lengkap = "
                    + tidak_berhasil_tuntas + " responden");
            System.out.println("jumlah responden yang gagal mengisi kuesioner = " + gagal + " responden");
            System.out.println("------- terima kasih telah menggunakan program ini -------");
        }

        input.close();
    }
}