import java.util.*;
//Return sum of all odd numbers from 1 to n
class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();
        System.out.println("Enter value of n :");
        int n1 = sc.nextInt();

        System.out.println(sum(n,n1));
    }

    static int sum(int num, int num1)
    {
        if(num > num1)
        {
            return num;
        }
        else return num1;
    }
}
