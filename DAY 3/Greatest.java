import java.util.*;

public class Greatest {
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
        System.out.println(" ");
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(temp < arr[i]){
                temp=arr[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + temp);
        sc.close();
    }
}
