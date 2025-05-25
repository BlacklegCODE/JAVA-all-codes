import java.util.Scanner;

public class Harsh{
    public static void main(String[] args)
    {
        System.out.println("This will be the code to learn how to accept user input");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scanner.nextLine();


        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        System.out.println("What ia your gpa ?");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student ?(true/false)");
        boolean stud = scanner.nextBoolean();

        System.out.println("Hi " + name+" Your age is "+age+" Your gpa is "+gpa);

        if(stud)
        {
            System.out.println("You are a student !");
        }
        else
        {
            System.out.println("You are not a student ! Try to enroll asap !");
        }

        scanner.close();
    }
}
