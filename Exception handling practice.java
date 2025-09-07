import java.util.Scanner;
import java.util.*;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter a number :");
            int a = scanner.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("You entered something thats not a number ! 😑�");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dont divide by zero !!");
        }
        finally
                {
                    System.out.println("This block always executes !");
                }
        
    }
}
