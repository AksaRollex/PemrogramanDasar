public class NilaiTertinggiDariArray {
    // buatlah fungsi getnilaimax() yang menerima array int dan mengembalikan nilai
    // terbesar di dalamnya. gunakan loop untuk membandingkan setiap elemen
    // hint : simpan nilai sementara int max = ar[0];

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int max = getNilaiMax(ar);
        System.out.println("Nilai tertinggi dari array adalah : " + max);
    }

    public static int getNilaiMax(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }
}
