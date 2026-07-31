import java.util.Scanner;

public class SubArraySize3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subarrays of size 3:");

        for (int i = 0; i <= n - 3; i++) {

            for (int j = i; j < i + 3; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }
    }
}
