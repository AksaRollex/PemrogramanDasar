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
                // compare apakah nilai array kedua[i/1] lebih besar dari nilai max (nilai array
                // pertama[0])
                // jika arr[i] lebih besar dari max maka nilai max akan diubah menjadi arr[i]
                max = arr[i];
            }
        }
        return max; // even arr[i] tidak lebih besar dari max, maka nilai array max tetap akan
                    // direturn sbg nilai terbesar
    }

}