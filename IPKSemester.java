import java.util.Scanner;

public class IPKSemester {
    public static void main(String[] args) {

        // alur berdasarkan pdf
        // input nilai untuk setiap matkul
        // nilai setiap matkul di konversi ke bobot (ex : 100 -> 4.0)
        // bobot setiap matkul di kalikan dengan sks (ex : 4.0 * 2) lalu ditambah dengan matkul lain
        // total bobot semua matkul di bagi dengan total sks semua matkul
        // ditambahkan keterangan nilai dan predikat berdasarkan nilai

        Scanner input = new Scanner(System.in);

        // deklarasi array matkul
        String[] matkul = {
                "Bahasa Indonesia",
                "Sistem Informasi Manajemen",
                "Desain Antar Muka",
                "Matematika Bisnis",
                "Basis Data",
                "Pemrograman Dasar",
                "SI Sumber Daya Manusia",
                "Pemasaran Digital"
        };

        // deklarasi array sks
        int[] sks = { 2, 2, 3, 3, 3, 3, 2, 2 };

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("--- Menghitung IP Semester ---");

        for (int i = 0; i < matkul.length; i++) { // loop untuk setiap mata kuliah
            System.out.print("Nilai " + matkul[i] + " : ");
            int nilai = input.nextInt(); // input nilai untuk mata kuliah ke-i (urut dari 0 - bhs indo)
 
            double bobot = konversiNilai(nilai); // konversi nilai ke bobot (ex : 85 -> 4.0, dst)
            totalBobot += bobot * sks[i]; // total bobot untuk semua mata kuliah (ex : 4.0 * 2 + ... dst)
            totalSKS += sks[i]; // total sks untuk semua mata kuliah (ex : 2 + ... dst)
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\nTotal SKS: " + totalSKS);
        System.out.println("IP Semester: " + String.format("%.2f", ip));
        System.out.println("Predikat   : " + keteranganIP(ip)); 
        
        input.close();
    }


    public static double konversiNilai(int nilai) {
        if (nilai >= 85) return 4.0;      // A
        else if (nilai >= 75) return 3.5; // B+ 
        else if (nilai >= 70) return 3.0; // B
        else if (nilai >= 60) return 2.5; // C+
        else if (nilai >= 55) return 2.0; // C
        else if (nilai >= 40) return 1.0; // D
        else return 0.0;                  // E
    }

    public static String keteranganIP(double ip) {
        if (ip >= 3.5) return "Istimewa";
        else if (ip >= 3.0) return "Memuaskan";
        else if (ip >= 2.5) return "Baik";
        else if (ip >= 2.0) return "Cukup";
        else if (ip >= 1.0) return "Kurang";
        else return "Gagal";
    }
}