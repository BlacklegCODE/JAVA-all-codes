import java.util.*;

class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit 1 :");
        int dig1 = sc.nextInt();

        System.out.println(fact(dig1));

    }
    static int fact(int num1)
    {
        int f = 1;
        for(int i = 1;i<=num1;i++)
        {
            f = f * i;
        }
        return f;
    }
}
