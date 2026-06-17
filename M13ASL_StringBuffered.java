public class M13ASL_StringBuffered {
    public static void main(String[] args) {
        // StringBuffer sb1 = new StringBuffer();
        // StringBuffer sb2 = new StringBuffer(100);
        // StringBuffer sb3 = new StringBuffer("Halo");

        // System.out.println("sb1 : " + sb1 + ", length : " + sb1.length() + ",
        // capacity : " + sb1.capacity());
        // System.out.println("sb2 : " + sb2 + ", length : " + sb2.length() + ",
        // capacity : " + sb2.capacity());
        // System.out.println("sb3 : " + sb3 + ", length : " + sb3.length() + ",
        // capacity : " + sb3.capacity());

        // StringBuffer teks = new StringBuffer();
        // for (int i = 0; i <5; i++) {
        // teks.append("abc ");
        // }
        // System.out.println(teks);

        // StringBuffer sb1 = new StringBuffer(); // kapasitas awal = 16
        // sb1.append("Halo");
        // System.out.println(sb1 + "Length : " + sb1.length() + ", Capacity : " +
        // sb1.capacity());
        // Output: Halo, Length : 4, Capacity : 16

        // StringBuffer sb2 = new StringBuffer("Halo");
        // System.out.println(sb2 + "Length : " + sb2.length() + ", Capacity : " +
        // sb2.capacity());
        // // Output: Halo, Length : 4, Capacity : 20

        // Rumus ×2 + 2 hanya dipakai saat length melebihi capacity yang tersedia, bukan
        // saat capacity lebih besar dari 16.

        String teksAwal = "Halo";
        StringBuffer sb = new StringBuffer(teksAwal);
        String teksAkhir = sb.toString();

        System.out.println("String Awal  : " + teksAwal);
        System.out.println("String Akhir : " + teksAkhir);
        System.out.println("Identik? " + teksAwal.equals(teksAkhir));
    }
}