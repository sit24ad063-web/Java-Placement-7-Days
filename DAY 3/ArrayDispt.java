import java.util.Scanner;

public class ArrayDispt {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        sc.close();
    }
}