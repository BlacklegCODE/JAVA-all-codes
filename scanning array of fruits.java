//checking if target exists in the array

import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {2,9,4,7,3,8,1,5,6};

        System.out.print("Enter a target (1-9) :");

        int target = scanner.nextInt();

        boolean isFound = false;

        for(int i = 0;i<numbers.length ; i++)
        {
            if(target == numbers[i])
            {
                System.out.println("Element found at index : "+i);
                isFound = true;
                break;
            }
            else
            {
                System.out.println("Target was not found !");
                break;
            }
        }
    }
} 
