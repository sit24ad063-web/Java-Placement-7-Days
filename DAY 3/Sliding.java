import java.util.*;

public class Sliding {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Array after rotation:");
        for (int ele:arr) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}