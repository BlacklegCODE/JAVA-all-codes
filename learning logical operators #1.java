//learning usage of logical operators in java
// weather advice in java
public class Harsh
{
    public static void main(String[] args)
    {
        //learning conditional operators :

        double temp = 40;
        Boolean weather = true;

//      usnig and + or
        if(temp <= 30 || temp >= 35 && weather)
        {
            System.out.println("Weather is good 😎");
        }
        else
        {
            System.out.println("Dont go outside !");
        }

        // using not operator

        if(!weather)
        {
            System.out.println("Weather is boring 😭");
        }
        else
        {
            System.out.println("Lets go out for a dinner");
        }
    }
}
