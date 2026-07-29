import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}