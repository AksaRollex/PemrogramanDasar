import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Nilai : ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        int hasil = getNilaiMax(nilai);

        System.out.println("Nilai Terbesar Adalah : " + hasil);

        input.close();
    }

    // fungsi max
    static int getNilaiMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}