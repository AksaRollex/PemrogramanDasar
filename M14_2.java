import java.util.ArrayList;
import java.util.Scanner;

public class M14_2 {
    public static void main(String[] args) {
        dendaPerpustakaan.procedureInput();
        dendaPerpustakaan.procedureOutput();
    }

    public class dendaPerpustakaan {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Integer> buku = new ArrayList<>();
        static ArrayList<Integer> telat = new ArrayList<>();

        static void procedureInput() {
            System.out.print("Masukkan jumlah buku : ");
            int jml_buku = sc.nextInt();

            for (int i = 0; i < jml_buku; i++) {
                System.out.print("Masukkan jumlah hari telat buku ke-" + (i + 1) + " : ");
                telat.add(sc.nextInt());
            }
        }

        static int hitungDenda() {
            int total = 0;
            for (int hari : telat) {
                total += hari * 1000;
            }
            return total;
        }

        static void procedureOutput() {
            System.out.println("Jumlah buku : " + telat.size());
            System.out.print("Telat : ");
            for (int i = 0; i < telat.size(); i++) {
                System.out.print(telat.get(i) + " hari, ");
            }
            System.out.println();
            System.out.println("Total denda : " + "Rp. " + hitungDenda());
        }

    }
}
