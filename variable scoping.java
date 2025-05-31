
//variable scoping in java

public class Harsh
{

    static int x = 3; //class

    public static void main(String[] args)
    {

        System.out.println(x); // this is a local scope
        dosometn();

        
    }

    static void dosometn()
    {

        System.out.println(x);
    }
}
