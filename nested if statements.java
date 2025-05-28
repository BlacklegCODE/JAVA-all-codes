public class Harsh
{
    public static void main(String[] args)
    {
        boolean isStud = true;
        boolean isSenior = false;
        double price = 9.99;


        if(isSenior)
        {
           if(isStud)
           {
               System.out.println("You get a studne and senior discount !");
               price *= 0.9;
           }
           else
           {
               System.out.println("You only get senior discount !");
               price *= 0.3;
           }
        }

        else
        {
            System.out.println("You get a student discount !");
            price *= 0.5;
        }
        System.out.printf("The price of your ticket is :%.2f\n ",price);
    }
}
