import java.util.Scanner;

public class IPKSemesterC2Simpel {
    public static void main(String[] args) {

        // alur berdasarkan ke
        // input nilai untuk setiap matkul
        // nilai setiap matkul di konversi ke bobot (ex : 100 -> 4.0)
        // bobot setiap matkul di kalikan dengan sks (ex : 4.0 * 2) lalu ditambah dengan matkul lain
        // total bobot semua matkul di bagi dengan total sks semua matkul (ex : total bobot seluruh matkul = 80 / sks (20) = 4.0)
        // ditambahkan keterangan nilai dan predikat berdasarkan nilai

        Scanner input = new Scanner(System.in);

        double Bind, SIM, DA, MB, BD, PD, SDM, PMD, totalBobot;
        int totalSKS;

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

        if (Bind >= 85) {
            Bind = 4.0;
        } else if (Bind >= 80) {
            Bind = 3.5;
        } else if (Bind >= 75) {
            Bind = 3.0;
        } else if (Bind >= 70) {
            Bind = 2.5;
        } else if (Bind >= 65) {
            Bind = 2.0;
        } else if (Bind >= 60) {
            Bind = 1.5;
        } else if (Bind >= 55) {
            Bind = 1.0;
        } else {
            Bind = 0.0;
        }

        if (SIM >= 85) {
            SIM = 4.0;
        } else if (SIM >= 80) {
            SIM = 3.5;
        } else if (SIM >= 75) {
            SIM = 3.0;
        } else if (SIM >= 70) {
            SIM = 2.5;
        } else if (SIM >= 65) {
            SIM = 2.0;
        } else if (SIM >= 60) {
            SIM = 1.5;
        } else if (SIM >= 55) {
            SIM = 1.0;
        } else {
            SIM = 0.0;
        }

        if (DA >= 85) {
            DA = 4.0;
        } else if (DA >= 80) {
            DA = 3.5;
        } else if (DA >= 75) {
            DA = 3.0;
        } else if (DA >= 70) {
            DA = 2.5;
        } else if (DA >= 65) {
            DA = 2.0;
        } else if (DA >= 60) {
            DA = 1.5;
        } else if (DA >= 55) {
            DA = 1.0;
        } else {
            DA = 0.0;
        }

        if (MB >= 85) {
            MB = 4.0;
        } else if (MB >= 80) {
            MB = 3.5;
        } else if (MB >= 75) {
            MB = 3.0;
        } else if (MB >= 70) {
            MB = 2.5;
        } else if (MB >= 65) {
            MB = 2.0;
        } else if (MB >= 60) {
            MB = 1.5;
        } else if (MB >= 55) {
            MB = 1.0;
        } else {
            MB = 0.0;
        }

        if (BD >= 85) {
            BD = 4.0;
        } else if (BD >= 80) {
            BD = 3.5;
        } else if (BD >= 75) {
            BD = 3.0;
        } else if (BD >= 70) {
            BD = 2.5;
        } else if (BD >= 65) {
            BD = 2.0;
        } else if (BD >= 60) {
            BD = 1.5;
        } else if (BD >= 55) {
            BD = 1.0;
        } else {
            BD = 0.0;
        }

        if (PD >= 85) {
            PD = 4.0;
        } else if (PD >= 80) {
            PD = 3.5;
        } else if (PD >= 75) {
            PD = 3.0;
        } else if (PD >= 70) {
            PD = 2.5;
        } else if (PD >= 65) {
            PD = 2.0;
        } else if (PD >= 60) {
            PD = 1.5;
        } else if (PD >= 55) {
            PD = 1.0;
        } else {
            PD = 0.0;
        }

        if (SDM >= 85) {
            SDM = 4.0;
        } else if (SDM >= 80) {
            SDM = 3.5;
        } else if (SDM >= 75) {
            SDM = 3.0;
        } else if (SDM >= 70) {
            SDM = 2.5;
        } else if (SDM >= 65) {
            SDM = 2.0;
        } else if (SDM >= 60) {
            SDM = 1.5;
        } else if (SDM >= 55) {
            SDM = 1.0;
        } else {
            SDM = 0.0;
        }

        if (PMD >= 85) {
            PMD = 4.0;
        } else if (PMD >= 80) {
            PMD = 3.5;
        } else if (PMD >= 75) {
            PMD = 3.0;
        } else if (PMD >= 70) {
            PMD = 2.5;
        } else if (PMD >= 65) {
            PMD = 2.0;
        } else if (PMD >= 60) {
            PMD = 1.5;
        } else if (PMD >= 55) {
            PMD = 1.0;
        } else {
            PMD = 0.0;
        }
        
        totalBobot = Bind * 2 + SIM * 2 + DA * 3 + MB * 3 + BD * 3 + PD * 3 + SDM * 2 + PMD * 2;
        
        double ip = totalBobot / totalSKS;

        int ipsSemesterDepan = 0;

        if (ip >= 3.5) {
            ipsSemesterDepan = 24;
        } else if (ip >= 3.0 && ip < 3.5) {
            ipsSemesterDepan = 22;
        } else if (ip >= 2.0 && ip < 3.0) {
            ipsSemesterDepan = 20;
        } else if ( ip < 2.0) {
            ipsSemesterDepan = 18;
        }

        // manual if else
        if ( ip >= 3.5) {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); // format untuk menampilkan 2 angka di belakang koma
            System.out.println("Keterangan :  Istimewa");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        } else if (ip >= 3.0) {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); 
            System.out.println("Keterangan : " + "Memuaskan");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        } else if (ip >= 2.5) {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); 
            System.out.println("Keterangan : " + "Baik");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        } else if (ip >= 2.0) {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); 
            System.out.println("Keterangan : " + "Cukup");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        } else if (ip >= 1.0) {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); 
            System.out.println("Keterangan : " + "Kurang");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        } else {
            System.out.println("\nIP Semester : " + String.format("%.2f", ip)); 
            System.out.println("Keterangan : " + "Gagal");
            System.out.println("Beban SKS Maksimal Semester Depan : " + ipsSemesterDepan);
        }
        
        input.close();
    }

}