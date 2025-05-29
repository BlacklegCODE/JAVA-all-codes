import java.util.Scanner;

public class Harsh {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sscanner = new Scanner(System.in);

        System.out.println("How many second to count down from ");
        int start = sscanner.nextInt();

        for(int i = start;i> 0;i--)
        {
            System.out.println(i);
            //this time delay technique was for intermediate java, but bro told me ill learn it eventually so i tried it here
            Thread.sleep(1000);
        }
        System.out.println("Happy new year !");
    }

}
