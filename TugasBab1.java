// public class TugasBab1 {

//     public static void main(String[] args) {
//         // Scanner input = new Scanner(System.in);
//         // System.out.print("Masukkan jumlah bintang: ");
//         // int n = input.nextInt();
//         // cetakBintang(n);

//     }

//     // public static void cetakBintang(int n) {
//     //     if (n <= 0) {
//     //         return;
//     //     }

//     //     System.out.println("*");
//     //     cetakBintang(n - 1);
//     // }

// }

import java.util.Scanner;

public class TugasBab1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.println("Hasil cetak naik:");
        cetakNaik(n);
    }

    public static void cetakNaik(int n) {
        if (n <= 0) {
            return;
        }

        cetakNaik(n - 1);
        System.out.println(n);
    }

}