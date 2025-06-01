//variable arguments aka varargs



public class Harsh
{
    public static void main(String[] args)
    {
        // Varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible
        //System.out.println(add(1,2,3,4,5,6,7,8,9,0));
        System.out.println(average());
    }
//    //static int add(int... numbers) {
//        int sum = 0;
//
//        for(int number :numbers)
//        {
//            sum += number;
//        }
//        return sum;


    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0)
        {
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
