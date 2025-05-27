//First ever java project !

import java.util.Scanner;
public class Harsh
{
    public static void main(String[] args)
    {
        //Compound interest calculator project
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCoumpounded;
        int year;
        double amount;

        System.out.println("Enter the principal amount :");
        principal = scanner.nextDouble();

        System.out.print("Enter interest rate :");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter no. of times coumpounded per year :");
        timesCoumpounded = scanner.nextInt();

        System.out.print("Enter number of years :");
        year = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCoumpounded, timesCoumpounded * year);

        System.out.println("The amount after "+year+" is "+ amount);


        scanner.close();
    }
}
