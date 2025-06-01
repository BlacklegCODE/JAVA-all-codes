//numpad using 2D array


public class Harsh
{
    public static void main(String[] args)
    {
        // phone number pad mini project

        char[][] telephone = {  {'1','2','3'},
                                {'4','5','6'},
                                {'7','8','8'},
                                {'*','0','#'}};

        for(char[] row : telephone)
        {
            for(char number : row)
            {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
