import java.util.Random;


public class Harsh {
    public static void main(String[] args)
    {
        Random random = new Random();

        int num;
        int num2;
        int num3;


         num2 = random.nextInt(1,7);
         num = random.nextInt(1,7);
        num3 = random.nextInt(1,7);

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num);

        double num4;
        num4 = random.nextDouble(1.1,5.9);
        System.out.println(num4);

        boolean head;

        head = random.nextBoolean();

        System.out.println(head);
    }

}
