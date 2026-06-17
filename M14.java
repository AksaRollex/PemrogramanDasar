import java.util.ArrayList;
import java.util.Scanner;

public class M14 {
    public static void main(String[] args) {
        latihanArraylist.procedureInput();
        latihanArraylist.procedureOutput();
    }

    public class latihanArraylist {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Double> nilai = new ArrayList<>(); // deklarasi array

        // procedure input
        static void procedureInput() {
            System.out.print("Input jumlah mhs : ");
            int jml = sc.nextInt();

            // for loop input arraylist
            for (int i = 0; i < jml; i++) {
                System.out.print("Masukkan nilai mhs ke-" + (i + 1) + " : ");
                // manambahkan isi elemen ->> add()

                // cara 1
                // double n = sc.nextDouble();
                // nilai.add(n);

                // cara 2
                nilai.add(sc.nextDouble());
            }
        }

        // fungsi 1 : hitung total
        static double hitungTotal() {
            // hitung total / sum
            double total = 0;
            // for each
            for (Double nilaiMhs : nilai) { // mengulang data array dari variabel nilai,
                                            // disimpan di nilaiMhs
                total += nilaiMhs;
            }

            // for (int i = 0; i < nilai.size(); i++) {
            //     total += nilai.get(i);
            // }

            return total;
        }

        // fungsi 2 : rata rata nilai
        static double rataNilai(){
            // rata rata =  total / jumlah data
            double rata = hitungTotal() / nilai.size();
            return rata;
        }


        // procedure output
        static void procedureOutput() {
            // cetak data arraylist(nilai) horizontal -> x, x, x, dst
            // cetak data vertikal : (foreach/fori)
            // 1. nilai = x dst
            System.out.println("Jumlah mhs : " + nilai.size());
            System.out.println("Daftar nilai mhs : " + nilai);
            System.out.println("Rata-rata nilai : " + rataNilai());
        }
    }

}
