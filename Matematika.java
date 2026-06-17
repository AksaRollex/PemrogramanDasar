
public class Matematika {
    public static void main(String[] args) {
        // luasLingkaran();
        // hipotunesaSegitiga();
        diagonalPersegiPanjang();

    }

    // fungsi hitung luas lingkaran dengan 2 angka dibelakang koma
    static double luasLingkaran() {
        // menghitung hitung luas lingkaran dengan jari-jari 7 cm
        // dan hasilnya dibulatkan 2 angka di belakang koma

        // rumus = phi x r x r

        double jari = 7;
        double luas = Math.PI * Math.pow(jari, 2);
        double hasil = Math.round(luas);
        double hasil2 = Math.round(luas * 100.0) / 100.0;

        System.out.println("Luas : " + luas);
        System.out.println("Hasil : " + hasil);
        System.out.println("Hasil 2 angka dibelakang koma : " + hasil2 + " cm^2");

        return hasil2;
    }

    // fungsi menghitung panjang sisi miring (hipotenusa) segitiga siku-siku
    static double hipotunesaSegitiga() {
        /*
         * sisi a = 6 cm, sisi b = 8 cm
         * rumus = akar (a kudrat + b kuadrat)
         */

        double sisiA = 6;
        double sisiB = 8;
        double hipotenusa = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        System.out.println("Panjang sisi miring (hipotenusa) segitiga siku-siku dengan sisi a = " + sisiA
                + " cm dan sisi b = " + sisiB + " cm adalah " + hipotenusa + " cm");

        return hipotenusa;
    }

    // hitung panjang diagonal persegi panjang
    /*
     * panjang = 5 cm, lebar = 3 cm
     * rumus = akar (panjang kuadrat + lebar kuadrat)
     */

    static double diagonalPersegiPanjang() { // fungsi 
        double panjang = 5;
        double lebar = 3;
        double diagonal = Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
        double diagonal2 = Math.round(diagonal * 10.0) / 10.0;
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("Diagonal : " + diagonal);
        System.out.println("Diagonal Pembulatan : " + diagonal2);
        return diagonal2;
    }
}
