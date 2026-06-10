import java.util.Scanner;

public class RekursifBab4 {

    static Scanner input = new Scanner(System.in);

    // Soal nomer 1 - Permutasi
    public static long permutasi(int n, int k) {
        if (k == 0)
            return 1;
        return n * permutasi(n - 1, k - 1);
    }

    // Soal nomer 2 - Deret harmonik
    public static double harmonik(int n) {
        if (n == 1)
            return 1.0;
        return harmonik(n - 1) + (1.0 / n);
    }

    // Soal nomer 3 - Pangkat rekursif
    public static long pangkat(int x, int n) {
        if (x == 0 && n == 0)
            throw new ArithmeticException("0^0 tidak terdefinisi");

        if (n == 0)
            return 1;

        return x * pangkat(x, n - 1);
    }

    // Soal nomer 4 - Jumlah pangkat genap
    public static long jumlahPangkatGenap(int x, int n) {
        if (n == 1)
            return pangkat(x, 2);

        return jumlahPangkatGenap(x, n - 1) + pangkat(x, 2 * n);
    }

    // Soal nomer 5 - Pangkat 3
    public static boolean pangkatTiga(int n) {
        if (n == 1)
            return true;

        if (n <= 0 || n % 3 != 0)
            return false;

        return pangkatTiga(n / 3);
    }

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("---- MENU SOAL REKURSIF ----");
            System.out.println("1. Permutasi P(n,k)");
            System.out.println("2. Deret Harmonik");
            System.out.println("3. Jumlah x² + x⁴ + ... + x^(2n)");
            System.out.println("4. Pangkat Rekursif");
            System.out.println("5. Cek Pangkat 3");
            System.out.println("6. Membalik Digit Bilangan");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan n: ");
                    int n = input.nextInt();

                    System.out.print("Masukkan k: ");
                    int k = input.nextInt();

                    System.out.println("P(" + n + "," + k + ") = "
                            + permutasi(n, k));
                    break;

                case 2:
                    System.out.print("Masukkan n: ");
                    n = input.nextInt();

                    System.out.println("Hasil deret harmonik = "
                            + harmonik(n));
                    break;

                case 3:
                    System.out.print("Masukkan x: ");
                    int x = input.nextInt();

                    System.out.print("Masukkan n: ");
                    n = input.nextInt();

                    System.out.println("Hasil = "
                            + jumlahPangkatGenap(x, n));
                    break;

                case 4:
                    try {
                        System.out.print("Masukkan x: ");
                        x = input.nextInt();

                        System.out.print("Masukkan n: ");
                        n = input.nextInt();

                        System.out.println(x + "^" + n + " = "
                                + pangkat(x, n));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Masukkan bilangan: ");
                    n = input.nextInt();

                    if (pangkatTiga(n))
                        System.out.println(n + " adalah pangkat 3");
                    else
                        System.out.println(n + " bukan pangkat 3");
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}