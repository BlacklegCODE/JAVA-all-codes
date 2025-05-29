import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        //learning nested loops

//        for(int j = 1;j<6;j++)
//        {
//            for(int i = 1;i<=7;i++)
//            {
//                System.out.print(i +" ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter no. of rows ");
        rows = scanner.nextInt();

        System.out.print("Enter for columns :");
        columns = scanner.nextInt();

        System.out.print("Enter symbol :");
        symbol = scanner.next().charAt(0);

        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<columns;j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }



    }
}
