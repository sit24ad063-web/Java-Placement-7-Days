import java.util.*;
public class IntervalPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between " + start +"and " + end + " are: ");
        for(int i=start; i<=end; i++){
            int count=0;
            for(int j=2; j*j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0 && i>1){
                System.out.print(i + " ");
            }
        }
    }
}
