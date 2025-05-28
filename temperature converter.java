//temperature conversion code using tenary operator in java
//code to convert degree to celcius and vis a vis
import java.util.Scanner;


public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature :");
        temp = scanner.nextDouble();

        System.out.print("Convert to celcius or farenheit (C or F)?");
        unit = scanner.next().toUpperCase();

       newtemp = (unit.equals("C")) ? (temp -32)*5/9 : (temp *5/9)+32;


        System.out.printf("%.1f  °%s",newtemp,unit);

        scanner.close();
    }
}
