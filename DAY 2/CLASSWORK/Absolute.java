import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int odd = 0;
        int even = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                even = even + digit;
            } else {
                odd = odd + digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);

        int abs;

        if (odd > even) {
            abs = odd - even;
        } else {
            abs = even - odd;
        }

        System.out.println("Absolute difference: " + abs);

        sc.close();
    }
}