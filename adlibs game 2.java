import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //creating the infamous madlibs game

        String name1;
        String name2;
        String place1;
        String place2;
        String adj1;
        String adj2;
        String emotion;

        System.out.println("Enter name of first friend :");
        name1 = scanner.nextLine();
        System.out.println("Enter name of second friend :");
        name2 = scanner.nextLine();
        System.out.println("Enter name of first place :");
        place1 = scanner.nextLine();
        System.out.println("Enter name of second place :");
        place2 = scanner.nextLine();
        System.out.println("Enter any adjective for first name (describe them in one word, shy/happy/scared/afraid)");
        adj1 = scanner.nextLine();
        System.out.println("Enter adjective for second name :");
        adj2 = scanner.nextLine();
        System.out.println("Enter any emotion ( happy/sad/joy/bored/etc) :");
        emotion = scanner.nextLine();

        //main story !

        System.out.println(name1+" "+name2+" were two best friends !");
        System.out.println(name1+" wanted to go to "+place1+" with "+name2);
        System.out.println("But "+name2+" Wanted to go to "+place2+"!");
        System.out.println("Hence they decided to go "+place1+" and "+place2+" together !");
        System.out.println("However, while going "+name1+" was a bit "+adj1+" but "+name2+" was very "+adj2);
        System.out.println("Still they were both very "+emotion);


    }
}
