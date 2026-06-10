import java.util.Scanner;

public class Procedure {
    // blok class
    // membuat procedure / function, serta variable class-level

    // variabel class-level : static
    static Scanner input = new Scanner(System.in);    
    
    // procedure input >> ada scanner
    static void inputData() {
        // nilai tugas, uts & uas
        System.out.print("masukkan nilai tugas : ");
        int nTugas = input.nextInt();
        System.out.print("masukkan nilai uts : ");
        int nUTS = input.nextInt();
        System.out.print("masukkan nilai uas : ");
        int nUAS = input.nextInt();

        // panggil func
        nilaiAkhir(nTugas, nUTS, nUAS);
    }

    // procedure output
    // public static void Garis() {
    // System.out.println("Halo! Selamat datang di program Java.");
    // }

    // procedure input
    // public static void InputPerhitungan() {

    // System.out.print("Masukkan angka pertama : ");
    // int angka1 = input.nextInt();
    // System.out.print("Masukkan angka kedua : ");
    // int angka2 = input.nextInt();
    // int hasil = angka1 + angka2;
    // System.out.println("Hasil penjumlahan : " + hasil);

    // }

    // function
    static int nilaiAkhir(int td, int uts, int uas) {
        // na = 30%*tugas + 30%*uts + 40%*uas
        int na = (td * 30 / 100) + (uts * 30 / 100) + (uas * 40 / 100);
        System.out.println("Nilai Akhir : " + na);
        return na;
    }

    public static void main(String[] args) {

        // perbedaan signifikan antara procedure & function

        /*
         * 1. procedure : void, function : tipe data & return
         * 2. procedure tidak return value, function return value
         * 
         */

        // memanggil procedure
        // Garis();
        // InputPerhitungan();
        inputData();
        
    }
}
