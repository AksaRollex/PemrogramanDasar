
public class LatihanStringBuffer {
    public static void main(String[] args) {
        // membuat objek stringbuffer
        // StringBuffer sb1 = new StringBuffer(30);
        // StringBuffer sb2 = new StringBuffer(50);
        // StringBuffer sb3 = new StringBuffer("Halo");

        // System.out.println("sb1: '" + sb1 + "', kapasitas: " + sb1.capacity());
        // System.out.println("sb2: '" + sb2 + "', kapasitas: " + sb2.capacity());
        // System.out.println("sb3: '" + sb3 + "', kapasitas: " + sb3.capacity());
        // System.out.println("sb3 panjang: " + sb3.length());

        // output
        // sb1: '', kapasitas: 16
        // sb2: '', kapasitas: 50
        // sb3: 'Halo', kapasitas: 20

        // contoh 2 menampilkan isi stringbuffer
        // StringBuffer sb = new StringBuffer("Java");
        // Cara 1: langsung di println
        // System.out.println(sb);
        // Cara 2: dengan toString eksplisit
        // System.out.println(sb.toString());
        // Cara 3: dengan concatenation
        // System.out.println("Isi buffer: " + sb);
        // Konversi ke String untuk diolah lebih lanjut
        // String teks = sb.toString();
        // System.out.println("Panjang: " + teks.length());

        // Output:
        // Java
        // Java
        // Isi buffer: Java
        // Panjang: 4

        StringBuffer ucapan = new StringBuffer(); // kapasitas awal = 16

        ucapan.append("Selamat datang, "); // total = 16 karakter
        ucapan.append("Andi Wijaya"); // total = 27 karakter
                                      // 27 > 16 → kapasitas: (16×2)+2 = 34

        ucapan.append("! Mahasiswa "); // total = 39 karakter
                                       // 39 > 34 → kapasitas: (34×2)+2 = 70

        ucapan.append("Sistem Informasi"); // total = 55 karakter

        ucapan.append(". Semoga sukses!"); // total = 71 karakter
                                           // 71 > 70 → kapasitas: (70×2)+2 = 142

        System.out.println(ucapan);

        System.out.println("Panjang teks: " + ucapan.length()); // 71
        System.out.println("Kapasitas   : " + ucapan.capacity()); // 142
    }
}
