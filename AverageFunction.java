import java.util.*;
//Take 3 numbers and return their average
class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit 1 :");
        int dig1 = sc.nextInt();
        System.out.print("Enter digit 2 :");
        int dig2 = sc.nextInt();
        System.out.print("Enter digit 3 :");
        int dig3 = sc.nextInt();

        System.out.println(fact(dig1,dig2,dig3));

    }
    static float fact(int num1, int num2, int num3)
    {
        int f = 1;
        f = num1+num2+num3;
        float x = f/3;
        return x;
    }
}
