//do while loop practice
import java.util.Scanner;
 public class Harsh
 {
     public static void main(String[] args)
     {
         Scanner scanner = new Scanner(System.in);

         int age = 0;

         System.out.print("Enter your age :");

         age = scanner.nextInt();

         do
         {
             System.out.println("Invalid age !");
             System.out.print("Enter your age again :");

             age = scanner.nextInt();
         }while(age<0);

         System.out.println("You age "+age+" years old !");

         scanner.close();
     }
 }

