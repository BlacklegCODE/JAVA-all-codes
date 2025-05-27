import java.util.Scanner;


public class Harsh
{
    public static void main(String[] args)
    {
        //Hypotenuse c = Math.sqrt(a square + b square )

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypo is c :"+c);

        scanner.close();
    }
}
