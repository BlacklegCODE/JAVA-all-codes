//searchind through an array using java, string type array

import java.util.Scanner;

public class Harsh {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"Apple","Orange","Banana"};

        System.out.print("Enter a fruit to find :");

        String target = scanner.nextLine();

        boolean isFound = false;

        for(int i = 0;i<fruits.length;i++)
        {
            if(fruits[i].equals(target))
            {
                System.out.println("Target found at index :"+i);
                isFound = true;
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("Element was not found !");
        }


        scanner.close();
    }
}
