import java.util.Scanner;
public class Harsh
{
    public static void main(String[] args)
    {
        //for loop understanding
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to lop :");
        int max = scanner.nextInt();


        for(int i = 1; i < max + 1 ; i++)
        {
            System.out.println(i);
        }
    }
}
