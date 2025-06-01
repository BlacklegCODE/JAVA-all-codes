//Learning 2D array

public class Harsh
{
    public static void main(String[] args)
    {
        //2D array = an array where each element is an array
        //           useful in storing matrix of data


        String[][] foods = {{"Apple","Banana","Pear"},
                            {"Potato","Cabbage","Chilli"}};

        foods[0][0] = "Sapparchand";

        for(String[] food : foods)
        {
            for(String fooda : food)
            {
                System.out.print(fooda + " ");
            }
            System.out.println();
        }
    }
}
