import java.util.Scanner;
public class Harsh
{
    public static void main(String[] args)
    {
        //mad libs game creation !

        Scanner scanner = new Scanner(System.in);

        String adj;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        System.out.println("Enter an adjective :");
        adj = scanner.nextLine();
        System.out.println("Enter a noun :");
        noun1 = scanner.nextLine();
        System.out.println("Enter another adjectice :");
        adj2 = scanner.nextLine();
        System.out.println("Enter a verb ends with ing ! :");
        verb1 = scanner.nextLine();
        System.out.println("Another adjective :");
        adj3 = scanner.nextLine();

        System.out.println("Today i went to a "+ adj +" zoo.");
        System.out.println("In an exhibit i saw a "+noun1+".");
        System.out.println(noun1+" was "+adj2+" and "+verb1+ " !");
        System.out.println("I was "+ adj3+" !");

        scanner.close();
    }
}
