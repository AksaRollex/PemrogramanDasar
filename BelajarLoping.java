import java.util.Scanner;

public class BelajarLoping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // for

        // 1. menampilkan 1-10
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // 2. menampilkan bilangan genap 2-20
        // for (int i = 1; i <= 20; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // 3. menampilkan bilangan ganjil 1-15
        // for ( int i = 1 ; i <= 15; i++) {
        // if (i % 2 != 0) {
        // System.out.println(i);
        // }
        // }

        // 4. menghitung jumlah total 1-10
        // int total = 0;
        // for (int i = 1; i <= 10; i++) {
        // total += i;
        // }
        // System.out.println(total);

        // while

        // 1. menampilkan 1-10
        int i = 1;

        while (i <= 10) {
            System.out.println("Angka: " + i);
            i++;
        }
        // logika perulangan while akan terus berjalan selama kondisi bernilai true

        // do while

        // 1. menampilkan 1-10
        int j = 1;

        do {
            System.out.println("Angka: " + j);
            j++;
        } while (j <= 10);
    }
}