import java.util.Scanner;

public class BetrothedPair {

    static int sumOfProperDivisors(int n) {
        int sum = 1;

        if (n == 1)
            return 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i)
                    sum += n / i;
            }
        }
        return sum;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (sumOfProperDivisors(a) == b + 1 &&
            sumOfProperDivisors(b) == a + 1) {
            System.out.println("Betrothed Pair");
        } else {
            System.out.println("Not a Betrothed Pair");
        }

        sc.close();
    }
}
