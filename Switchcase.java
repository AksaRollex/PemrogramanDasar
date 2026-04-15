
public class Switchcase {

    public static void main(String[] args) {

        int saku = 20000;
        int makansiang = 25000;

        // if ( makansiang > saku ) {
        // System.out.println("Uang tidak cukup untuk makan siang");
        // } else if ( makansiang == saku ) {
        // System.out.println("Uang cukup untuk makan siang");
        // } else {
        // System.out.println("Uang lebih dari cukup untuk makan siang");
        // }

        // do {
        // System.out.println("Uang tidak cukup untuk makan siang: " + saku);
        // saku = saku + 1000;
        // } while (makansiang > saku);

        // Uang tidak cukup untuk makan siang: 21000
        // Uang tidak cukup untuk makan siang: 22000
        // Uang tidak cukup untuk makan siang: 23000
        // Uang tidak cukup untuk makan siang: 24000

        while (makansiang > saku) {
            System.out.println("Uang tidak cukup untuk makan siang : " + saku);
            saku = saku + 1000;
        }

        // Uang tidak cukup untuk makan siang : 21000
        // Uang tidak cukup untuk makan siang : 22000
        // Uang tidak cukup untuk makan siang : 23000
        // Uang tidak cukup untuk makan siang : 24000
    }
}