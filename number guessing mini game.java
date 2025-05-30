import java.util.Scanner;
import java.util.Random;

import static java.lang.Math.random;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter minimum value :");
        int min = scanner.nextInt();

        System.out.println("Enter a maximum value :");
        int max = scanner.nextInt();

        int guess;

        int rand = random.nextInt(min,max);

        System.out.println("Enter a guess :");

        int attempts = 0;


        do
        {
            guess = scanner.nextInt();


            if(guess>rand)
            {
                System.out.println("Too high 🤦‍♂️ ! Try again :");
            }
            else if(guess<rand)
            {
                System.out.println("Too low 🙅‍♂️🤏! Try again :");
            }
            else
            {
                System.out.println("You win !! Finally 😎");
            }

            attempts++;

        }while(rand != guess);


        System.out.println("You finally won, but you took "+attempts+" 🥹");

        scanner.close();

    }
}
