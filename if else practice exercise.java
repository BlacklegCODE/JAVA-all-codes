import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean isStud;
        String name;


        System.out.print("Enter your age :");
        age = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter your name");
        name = scanner.nextLine();


        System.out.print("Are you a student ?(true/false)");
        isStud = scanner.nextBoolean();

        //Group 1

        if(name.isEmpty())
        {
            System.out.println("You didnt enter your name !😡");
        }
        else {
            System.out.println("Hello "+name+" 😎");
        }
        //Group 2
        if (age>=10)
        {
            System.out.println("You are an adult !");
        }
        else if(age >= 65)
        {
            System.out.println("You are a senior !");
        }
        else if(age < 0){
            System.out.println("You are not born yet !!");
        }
        else if(age == 0)
        {
            System.out.println("You are a baby !");
        }
        else {
            System.out.println("You are still a child !");
        }

        //Group 3

        if(isStud)
        {
            System.out.println("You are a student !");
        }
        else
        {
            System.out.println("You are not a student !!");
        }

        scanner.close();
    }
}
