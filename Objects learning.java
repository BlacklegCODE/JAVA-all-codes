
//Objects in java
import java.util.Random;
import java.util.Scanner;

public class Harsh
{
    public static void main(String[] args)
    {
        //Object = It is an entity that holds data ( attributes )
        //         and can perform actions ( methods ). it is known as reference data type


        Car car = new Car();

        car.isRunning = true;

        System.out.println(car.year);
        System.out.println(car.make);
        System.out.println(car.modes);
        System.out.println(car.isRunning);

        car.start();

        car.stop();

        car.drive();

        car.brake();;

        Car car1 = new Car();

        Car car2 = new Car();


        System.out.println(car1.make + " "+ car1.modes);
        System.out.println(car2.make +" " + car2.modes);
    }
}

//car.java
public class Car {

    String make = "Tata";
    String modes = " Indigo ";

    int year = 2025;

    double price = 58000.99;

    boolean isRunning = false;

    void start()
    {
        System.out.println("You start the engine");
    }
    void stop()
    {
        System.out.println("You stop the engine ");
    }

    void drive()
    {
        System.out.println("You drive the " + modes);
    }

    void brake()
    {
        System.out.println("You brake the "+modes);
    }
}
