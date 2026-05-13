import java.util.Scanner;

class FungsiISGanjil {
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("--- Menghitung Modulus ---");
            System.out.print("Masukkan Bilangan : ");
            int bilangan = input.nextInt();

            isGanjil(bilangan);
            // System.out.println("Apakah " + bilangan + " adalah bilangan ganjil ? " + hasil);
        }

        static int isGanjil (int bil) {
            if (bil % 2 == 1) {
                System.out.println("Bilangan tersebut adalah bilangan ganjil");
                return 1;
            } else {
                System.out.println("Bilangan tersebut adalah bilangan genap");
                return 0;
            }
        }
}
