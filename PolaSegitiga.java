public class PolaSegitiga {
    public static void main(String[] args) {
        int n = 5;

        // 1. Segitiga Normal
        /*
         *
         **
         ***
         ****
         *****
        */
        System.out.println("1. Segitiga Normal");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Segitiga Terbalik
        /*
         *****
         ****
         ***
         **
         *
        */
        System.out.println("\n2. Segitiga Terbalik");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Segitiga Rata Kanan
        /*
             *
            **
           ***
          ****
         *****
        */
        System.out.println("\n3. Segitiga Rata Kanan");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. Segitiga Rata Kanan Terbalik
        /*
         *****
          ****
           ***
            **
             *
        */
        System.out.println("\n4. Segitiga Rata Kanan Terbalik");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Piramida
        /*
             *
            ***
           *****
          *******
         *********
        */
        System.out.println("\n5. Piramida");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6. Piramida Terbalik
        /*
         *********
          *******
           *****
            ***
             *
        */
        System.out.println("\n6. Piramida Terbalik");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}