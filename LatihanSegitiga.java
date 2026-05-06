public class LatihanSegitiga {
    public static void main(String[] args) {

        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // logika = bergantung pada nilai i yang bertambah

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // logika = spasi hasil pengurangan dari jumlah var baris dikurangi 1
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // logika = membuat menjadi ganjil dengan kombinasi i * 2 - 1 (1 * 2 - 1 = 1)
            // (bintang 1)
            System.out.println();
        }

        for (int i=n; i >=1; i--) {
            (for int j=1; j<=n-1)
        }         
    }
}