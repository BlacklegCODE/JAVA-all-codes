public class Harsh
{
    public static void main(String[] args)
    {
        // method = a block of reusable code that is executed when called ();


//        String name = "Harsh";
//
//        int age = 22;
//
//        System.out.println(square(4));
//        System.out.println(cube(4));

//        String getit = fullname("Harsh","Raundal");
//        System.out.println("getit");

        int age = 22;

        if(agecheck(age))
        {
            System.out.println("You can sign up !");
        }
        else
        {
            System.out.println("Cannot sign up !");
        }

    }
    static void Helpme(String name, int age)
    {
        System.out.printf("Somebody save %s\n",name);
        System.out.println("Me from my self");
        System.out.printf("Has been so long %d\n",age);
        System.out.println("Living in here");

    }

    static double square(double number)
    {
        return number * number;
    }

    static double cube(double number)
    {
        return number * number * number;
    }

    static String fullname(String first, String last)
{
    return first +" " + last;
}

    static boolean agecheck(int age)
    {
        if(age>= 18)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
