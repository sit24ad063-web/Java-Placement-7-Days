import java.util.*;

public class SlidingR {
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
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println("Array after right rotation:");
        for (int ele:arr) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
