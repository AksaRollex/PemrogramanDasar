import java.util.Scanner;

public class IPKSemesterC2Kompleks {
    public static void main(String[] args) {

        // alur berdasarkan ke
        // input nilai untuk setiap matkul
        // nilai setiap matkul di konversi ke bobot (ex : 100 -> 4.0)
        // bobot setiap matkul di kalikan dengan sks (ex : 4.0 * 2) lalu ditambah dengan matkul lain
        // total bobot semua matkul di bagi dengan total sks semua matkul (ex : total bobot seluruh matkul = 80 / sks (20) = 4.0)
        // ditambahkan keterangan nilai dan predikat berdasarkan nilai

        Scanner input = new Scanner(System.in);

        int Bind, SIM, DA, MB, BD, PD, SDM, PMD;
        int totalSKS;
        double totalBobot;

        System.out.println("--- Menghitung IP Semester ---");

        System.out.print("Nilai Bahasa Indonesia : ");
        Bind = input.nextInt();

        System.out.print("Nilai Sistem Informasi Manajemen : ");
        SIM = input.nextInt();

        System.out.print("Nilai Desain Antar Muka : ");
        DA = input.nextInt();

        System.out.print("Nilai Matematika Bisnis : ");
        MB = input.nextInt();

        System.out.print("Nilai Basis Data : ");
        BD = input.nextInt();

        System.out.print("Nilai Pemrograman Dasar : ");
        PD = input.nextInt();

        System.out.print("Nilai Sistem Informasi SDM : ");
        SDM = input.nextInt();

        System.out.print("Nilai Pemasaran Digital : ");
        PMD = input.nextInt();

        totalSKS = 2 + 2 + 3 + 3 + 3 + 3 + 2 + 2;

        // semua nilai per mata kuliah di simpan di function konversiNilai
        totalBobot = (konversiNilai(Bind) * 2) + 
                (konversiNilai(SIM) * 2) +
                (konversiNilai(DA) * 3) +
                (konversiNilai(MB) * 3) +
                (konversiNilai(BD) * 3) +
                (konversiNilai(PD) * 3) +
                (konversiNilai(SDM) * 2) +
                (konversiNilai(PMD) * 2);
    
        double ip = totalBobot / totalSKS;

        System.out.println("\nIP Semester : " + String.format("%.2f", ip)); // format untuk menampilkan 2 angka di belakang koma
        System.out.println("Keterangan : " + keteranganIP(ip));
        System.out.println("Beban SKS Maksimal Semester Depan : " + bebanSKS(ip));
        input.close();
    }

    
    // fc - konversi nilai ke bobot
    public static double konversiNilai(int nilai) { 
        if (nilai >= 85)
            return 4.0;
        else if (nilai >= 75)
            return 3.5;
        else if (nilai >= 70)
            return 3.0;
        else if (nilai >= 60)
            return 2.5;
        else if (nilai >= 55)
            return 2.0;
        else if (nilai >= 40)
            return 1.0;
        else
            return 0.0;
    }
    
    // fc - keterangan predikat berdasarkan IPS
    public static String keteranganIP(double ip) { 
        if (ip >= 3.5)
            return "Istimewa";
        else if (ip >= 3.0)
            return "Memuaskan";
        else if (ip >= 2.5)
            return "Baik";
        else if (ip >= 2.0)
            return "Cukup";
        else if (ip >= 1.0)
            return "Kurang";
        else
            return "Gagal";
    }

    // fc - beban sks maksimal untuk semester depan
    public static int bebanSKS(double ip) { 
        if (ip >= 3.5)
            return 24;
        else if (ip >= 3.0)
            return 22;
        else if (ip >= 2.0)
            return 20;
        else
            return 18;
    }
}