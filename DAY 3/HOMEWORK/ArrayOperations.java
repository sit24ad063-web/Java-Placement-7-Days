import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter elements:");

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int min = arr[0];
            int max = arr[0];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] < min)
                    min = arr[i];

                if (arr[i] > max)
                    max = arr[i];

                sum += arr[i];
            }

            double avg = (double) sum / n;

            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);
        }
    }
}
