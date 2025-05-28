import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        //weight converstion program

        System.out.println("Weight conversion program here !");
        System.out.println("1. Covert kg to grams :");
        System.out.println("2. Convert kg to lbs ");

        System.out.printf("Enter a choice :");
        choice = scanner.nextInt();

        if(choice == 1)
        {
            System.out.println("Enter weight in kg :");
            weight = scanner.nextDouble();
            newWeight = weight/1000;
            System.out.println(newWeight);
        }
        else if(choice == 2)
        {
            System.out.println("Enter in kg :");
            weight = scanner.nextDouble();
            newWeight  = weight * 2.20462;
            System.out.printf("New weight is : %.2f",newWeight);
        }
        else
        {
            System.out.println("Invalid choice !!4");
        }
        
        scanner.close();

    }
}
