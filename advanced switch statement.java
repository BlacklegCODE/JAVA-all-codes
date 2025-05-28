//advanced switch statement in java ( feature of java14)
import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day :");
        String day = scanner.nextLine();

        switch(day)
        {
            case "Monday" ,"Tuesday","Wednesday","Thursday","Friday","Saturday" -> System.out.println("Weekday");

            case "Sunday" -> System.out.println("Its holiday 😎");

            default -> System.out.println(day +" Is not a day !");
        }
    }
}
