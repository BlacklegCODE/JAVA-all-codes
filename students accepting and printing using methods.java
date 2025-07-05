//this is revision/practice of methods to keep my skills sharp

import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students :");
        int students = scanner.nextInt();

        String[] name = namer(scanner, students);

        printer(name,students);

    }

    static String[] namer(Scanner scanner, int students) {
        
        String[] names = new String[students];

        for (int i = 0; i < students; i++)
        {

            System.out.println("Enter name of student " + (i + 1) + " :");
            names[i] = scanner.next();

        }
        return names;
    }

    static void printer(String[] name, int students)
    {
        for(int i = 0;i<students;i++)
        {
            System.out.println(name[i]);
        }
    }
}
