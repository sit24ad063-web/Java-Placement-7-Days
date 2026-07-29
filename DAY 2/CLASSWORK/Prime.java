import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=2; i*i<=n;i++){
            if(n%i==0){
                System.out.println(i+ "," + n/i);
                count++;
            }
        }
        if(count==0){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
