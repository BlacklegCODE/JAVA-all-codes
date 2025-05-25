import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) {

        int age = 10;
        double point = 10.4;
        double gpa = 7.9;
        int year = 2025;

//        System.out.println(point);
//        System.out.println(age);
//        System.out.println("I want it in year " + year);
//        System.out.println("My GPA is " + gpa);


        char grade = 'A';
        char symbol = '!';

//        System.out.println(grade);
//        System.out.println(symbol);

        boolean isStudent = true;
        boolean isForsale = false;
        boolean isOnline = true;

//        System.out.println(isStudent);
//        System.out.println(isForsale);
//        System.out.println(isOnline);


//        if (isStudent == true) {
//            System.out.println("You are a student !");
//        } else {
//            System.out.println("You are not a student !");
//        }


        String name = "BlacklegSanji";
        String food = "Paneer";

//        System.out.println("Your favourite food is " + food);
//        System.out.println("This is my name " + name);

        System.out.println("I want a " +food +" in year"+" "+year +" for my birthday !");

        String car = "Lamborghinni ";

        if(isForsale)
        {
            System.out.println("There is a "+" "+car+"For sale only is your gpa is above"+gpa+"Got it?");
        }
    }
}
