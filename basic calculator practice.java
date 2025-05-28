//basic calculator in java

import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0.0;
        System.out.print("Enter first number here :");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number :");
        num2 = scanner.nextDouble();

        System.out.println("Enter the operation you want to perform here :");
        operator = scanner.next().charAt(0);

        boolean valid = true;

        switch(operator)
        {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero !");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.println("Invalid operator !");
                valid = false;
            }
        }

        if(valid)
        {
            System.out.println(result);
        }


        scanner.close();
    }
}
