import java.util.*;

public class DateValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        System.out.print("Enter Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Day : ");
        int day = sc.nextInt();

        if(day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {

            System.out.println("Invalid Date");

        }
        else if(month == 1 || month == 3 || month == 5 ||
                month == 7 || month == 8 ||
                month == 10 || month == 12) {

            System.out.println("Valid Date");

        }
        else if(month == 4 || month == 6 ||
                month == 9 || month == 11) {

            if(day <= 30)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");

        }
        else {

            if((year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0)) {

                if(day <= 29)
                    System.out.println("Valid Date");
                else
                    System.out.println("Invalid Date");

            }
            else {

                if(day <= 28)
                    System.out.println("Valid Date");
                else
                    System.out.println("Invalid Date");

            }

        }

    }
}
