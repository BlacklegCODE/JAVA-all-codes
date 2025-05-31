//overloaded methods = methods that share the same name, but different parameters
//signature = name + parameters

public class Harsh {
    public static void main(String[] args)
    {
//    {
//
//        System.out.println(add(1,2));
//    }
//    static double add(double a, double b)
//    {
//        return a + b;
//    }
//    static double add(double a, double b, double c)
//    {
//        return a + b+c;
//    }


    String pizza = bake("Flat bread","Spicy");
        System.out.println(pizza);

}

    static String bake(String bread)
    {
        return bread + " pizza";
    }

    static String bake(String bread,String cheese)
    {
        return cheese +" " + bread + " pizza";
    }
}
