import java.util.*;

public class Swap {
    @SuppressWarnings({"resource", "ConvertToTryWithResources"})
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter first position:");
        int pos1 = sc.nextInt();

        System.out.println("Enter second position:");
        int pos2 = sc.nextInt();

        if (pos1 < 0 || pos1 >= arr.length ||
            pos2 < 0 || pos2 >= arr.length) {

            System.out.println("Invalid Request!");
            return;
        }

        // Swap
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

        System.out.println("Array after swapping:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}