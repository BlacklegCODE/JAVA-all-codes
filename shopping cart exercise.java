import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        //SHOPPING CART PROGRAM 
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        System.out.print("What would you like to buy ? :");
        item = scanner.nextLine();

        System.out.println("What is the price for each ? :");
        price = scanner.nextDouble();

        System.out.println("Enter the quantity here :");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("This is the total : "+total+ " for "+quantity+" of "+item);
        scanner.close();
    }
}
