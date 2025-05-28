import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your email here :");
        String email = scanner.nextLine();




        if(email.contains("@"))
        {
            String username = email.substring(0,email.indexOf("@"));

            String domain = email.substring(email.indexOf("@")+1);
            System.out.println("The email is valid !");
            System.out.println(domain);
            System.out.println(username);
        }
        else
        {
            System.out.println("Invalid email");
        }


    }
}
