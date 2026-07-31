import java.util.Scanner;

public class AdjacentDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] diff = new int[n];

        for (int i = 0; i < n - 1; i++) {
            diff[i] = arr[i + 1] - arr[i];
        }

        diff[n - 1] = 0;

        for (int x : diff)
            System.out.print(x + " ");
    }
}