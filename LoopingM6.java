
import java.util.Scanner;

public class LoopingM6 {
    public static void main(String[] args) {
        /*
         * membuat program untuk menghitung sskm berdasarkan kegiatan dan poin sskm dari
         * kegiatan yang diinputkan. kegiatan bisa diinput hingga 5 data
         * 
         * output :
         * bimbingan karir - 5 poin
         * seminar ai - 3 poin
         * total : 8 poin
         */

        Scanner input = new Scanner(System.in);

        // input inisialisasi variabel dan nilai default
        String namaKegiatan = "";
        int poinSSKM = 0, total = 0;

        // pengulangan input data sebanyak 5 kali

        // for -> shortcut -> fori + enter
        for (int i = 0; i < 5; i++) {
            // logika isi perulangan
            System.out.print("Masukkan nama kegiatan : ");
            namaKegiatan = input.nextLine();

            System.out.print("Masukkan poin SSKM : ");
            poinSSKM = input.nextInt();

            input.nextLine(); // membersihkan buffer input
            total += poinSSKM;
            /*
             * total = 0 + poinSSKM -> lalu ditambahkan berdasarkan berapa kali perulangan
             */

            System.out.println(namaKegiatan + " - " + poinSSKM + " poin");

        }

        System.out.println("Total : " + total + " poin");
        input.close();
    }
}
