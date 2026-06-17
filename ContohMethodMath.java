public class ContohMethodMath {
    public static void main(String[] args) {

        // Math.sqrt(x)
        // Fungsi: Menghitung akar kuadrat dari suatu bilangan
        double akar = Math.sqrt(25);
        System.out.println("Math.sqrt(25) = " + akar);

        // Math.pow(x, y)
        // Fungsi: Menghitung perpangkatan (x pangkat y)
        double pangkat = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3) = " + pangkat);

        // Math.abs(x)
        // Fungsi: Mengubah nilai menjadi positif (nilai mutlak)
        int mutlak = Math.abs(-7);
        System.out.println("Math.abs(-7) = " + mutlak);

        // Math.max(a, b)
        // Fungsi: Mencari nilai terbesar dari dua bilangan
        int terbesar = Math.max(4, 9);
        System.out.println("Math.max(4, 9) = " + terbesar);

        // Math.min(a, b)
        // Fungsi: Mencari nilai terkecil dari dua bilangan
        int terkecil = Math.min(4, 9);
        System.out.println("Math.min(4, 9) = " + terkecil);

        // Math.round(x)
        // Fungsi: Membulatkan ke bilangan bulat terdekat
        long bulat = Math.round(4.6);
        System.out.println("Math.round(4.6) = " + bulat);

        // Math.ceil(x)
        // Fungsi: Membulatkan ke atas
        double atas = Math.ceil(4.1);
        System.out.println("Math.ceil(4.1) = " + atas);

        // Math.floor(x)
        // Fungsi: Membulatkan ke bawah
        double bawah = Math.floor(4.9);
        System.out.println("Math.floor(4.9) = " + bawah);

        // Math.random()
        // Fungsi: Menghasilkan bilangan acak antara 0.0 sampai kurang dari 1.0
        double acak = Math.random();
        System.out.println("Math.random() = " + acak);
    }
}