import java.util.Scanner;

class luas {
    // variabel class level : variabel yg bisa digunakan di semua blok kode
    static int pj, lb;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // memanggil fungsi
        System.out.print("Masukkan Panjang (cm) : ");
        // tipe data harus sama
        // int panjang = input.nextInt();
        pj = input.nextInt();
        System.out.print("Masukkan Lebar (cm) : ");
        // int lebar = input.nextInt();
        lb = input.nextInt();
        // tidak menggunakan variabel parameter dari func hitung luas dikarenakan
        // variabel parameter hanya digunakan didalam fungsi saja, jadi kita buat
        // variabel baru untuk menampung inputan user

        // menampung inputan user ke variabel class level
        // int hasil = hitungluas(panjang, lebar);

        int hasil = hitungluas();
        System.out.println("Luas Persegi Panjang : " + hasil + " cm");
    }

    // ----------------------------------------------------------------

    // --- fungsi dengan parameter ---

    // tipe data pada parameter sama dengan tipe data pada fungsi
    // rumus = panjang * lebar
    // static int hitungluas(int p, int l) {
    // int luas = p * l;
    // // hasil dari rumus akan dihitung sesuai angka dari user

    // return luas;
    // // hasil luas akan terus dikembalikan nilainya
    // }

    // ----------------------------------------------------------------

    // --- fungsi hitung luas tanpa parameter ---

    // overloading function : pembuatan fungsi dengan nama yang sama tapi dengan
    // jumlah parameter yang berbeda
    static int hitungluas() {
        // variabel global >> class level
        int luas = pj * lb;

        return luas;
    }
}