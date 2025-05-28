//tenary operator code
import java.util.Scanner;
public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int score;
        System.out.print("Enter score :");
        score = scanner.nextInt();


        String pof = (score >= 60) ? "Pass" : " Fail";

        System.out.println(pof);
    }
}
