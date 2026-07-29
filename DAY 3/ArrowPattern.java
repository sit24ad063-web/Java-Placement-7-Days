public class ArrowPattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i < n; i++) {

            // Spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Middle row
        for (int j = 1; j <= 2 * n - 2; j++) {
            System.out.print("*");
        }
        System.out.println();

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}