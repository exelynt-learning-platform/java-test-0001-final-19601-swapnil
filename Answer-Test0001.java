Answer to Java test 001


public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        // Top half
        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // middle spaces + last star
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
