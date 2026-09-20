import java.util.*;
//Return sum of all odd numbers from 1 to n
class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

    static int sum(int num)
    {
        int t = 0;
        for(int i = 0;i<=num;i++)
        {
            if(i%2!=0)
            {
                t += i;
            }
        }
        return t;
    }
}
