import java.util.*;

class first
{//Take an array of integers and print it
    public static void main(String[] args)
    {
        int pos = 0,neg = 0;
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0;i<10;i++)
        {
            nums[i] = sc.nextInt();
            if(nums[i]>0)
            {
                pos++;
            }
            else if(nums[i]<0)
            {
                neg++;
            }
        }
        

        System.out.println("All 10 elements with count :");

        for(int i = 0;i<10;i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("Total positive :" + pos);
        System.out.println("Total negative :" + neg);
    }
}
