import java.util.*;

public class Factors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i*i < n; i++) {

            if(n % i == 0) {

                System.out.println(i);
                sum += i;

                if(i != n / i) {
                    System.out.println(n / i);
                    sum += n / i;
                }

            }

        }
        if(sum - n == n) {
            System.out.println("The number is perfect");
        } else {
            if(sum - n > n) {
                System.out.println("The number is abundant");
            } else {
                System.out.println("The number is deficient");
            }
            
        }
        System.out.println("Sum of factors: " + (sum - n));

    }
}