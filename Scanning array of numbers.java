//Acception array size and manipulation of data using array

import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.println("How many fruits do you want ? :");

        int size = scanner.nextInt();

        scanner.nextLine();

        foods = new String[size];

        for(int i = 0;i<foods.length;i++)
        {
            System.out.print("Enter a food :");
            
            foods[i] = scanner.nextLine();
        }

        for(String food : foods)
        {
            System.out.println(food);
        }
        scanner.close();
    }
}
