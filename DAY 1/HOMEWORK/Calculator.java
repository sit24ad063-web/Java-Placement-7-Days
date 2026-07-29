import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+' -> System.out.println("Result = " + (a + b));

            case '-' -> System.out.println("Result = " + (a - b));

            case '*' -> System.out.println("Result = " + (a * b));

            case '/' -> {
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero not possible");
            }

            case '%' -> System.out.println("Result = " + (a % b));

            default -> System.out.println("Invalid Operator");
        }
    }
}