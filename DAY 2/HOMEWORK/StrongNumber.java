import java.util.Scanner;

public class StrongNumber {

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + fact(digit);
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}