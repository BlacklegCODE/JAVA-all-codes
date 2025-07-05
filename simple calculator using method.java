import java.util.Scanner;

public class Main
{
    public static void main(String[] vars)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number :");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number :");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation :");
        String opn = scanner.next();

        int result = calculate(num1, num2, opn);
        System.out.println(result);
    }
   static int calculate(int num1, int num2, String opn)
    {
        int ans;
        System.out.print("Enter operation :");
        Scanner scanner = new Scanner(System.in);

        return switch(opn)
        {
            case "+" -> ans =  num1 + num2;
            case "-" -> ans = num1 - num2;
            case "*" -> ans = (num1*num2);
            case "/" -> ans = num2 != 0 ? num1/num2 :0 ;
            default -> {
                System.out.println("Enter valid operator");
                yield 0;
            }
        };
    }
}
