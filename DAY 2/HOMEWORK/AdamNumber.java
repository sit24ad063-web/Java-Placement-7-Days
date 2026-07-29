import java.util.Scanner;

public class AdamNumber {

    static int reverse(int n) {

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square1 = n * n;
        int square2 = reverse(n) * reverse(n);

        if (reverse(square1) == square2)
            System.out.println("Adam Number");
        else
            System.out.println("Not an Adam Number");
    }
}