import java.util.*;
public class first 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings to compare :");
        String first = sc.next();
        String last = sc.next();

        String full = first +" " + last;

        if(first.compareTo(last) == 0)
        {
            System.out.print("Strings are same !");
        }
        else if(first.compareTo(last) < 0)
        {
            System.out.println("First one is smaller than second !");
        }
        else
        {
            System.out.print("Second one is smaller than first !");
        }

    }    
}
