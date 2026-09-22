import java.util.*;

public class first 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows number :");
        int rows = sc.nextInt();
        System.out.print("Enter column number :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                System.out.print("Enter " + i +" "+ j +"th element :");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search location :");
        int x = sc.nextInt();
        System.out.println("Searching....");

        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                if(arr[i][j] == x)
                {
                    System.out.println("Location of " + x + " is here : " + i + " " + j);
                }
            }
        }
    }    
}
