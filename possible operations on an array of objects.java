public class Main
{
    public static void main(String[] args)
    {
//        Car car1 = new Car("Ferrari","Red");
//        Car car2 = new Car("Lamborghini","Cyan");
//
//        Car[] cars = { car1, car2};
//
//        for(int i = 0;i<cars.length;i++)
//        {
//            cars[i].drive();
//        }
//
//        // to get same output but with enhanced for loop
//
//

        //anonymous objects below

        Car[] cars = {new Car("Lambo","Cyan"),
                        new Car("Honda","Stinky"),
                        new Car("Tata","Indigo")
        };

        for(Car car : cars)
        {
            car.color = "Black";
        }

        for(Car car : cars)
        {
            car.drive();
        }
    }
}

//with class Cars below

 public class Car
{
    String model;
    String color;

    Car(String model, String color)
    {
        this.model = model;
        this.color = color;
    }

    void drive()
    {
        System.out.println("You drive a "+model+" which is of "+color+" color");
    }
}
