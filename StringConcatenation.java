import java.util.*;

public class first 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name n last name :");
        String first = sc.next();
        String last = sc.next();

        String full = first +" " + last;

        if(full.length()>20)
        {
            System.out.print("Invalid length !");
        }
        else
        {
            System.out.println("Response recorded as : " + full);
        }

    }    
}
