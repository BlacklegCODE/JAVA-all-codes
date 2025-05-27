import java.util.Scanner;

public class  Harsh
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circ;
        double area;
        double volume;

        System.out.print("Enter radius :");
        radius = scanner.nextDouble();

        circ = 2*Math.PI*radius;

        area = Math.PI * radius * Math.pow(radius,2);

        volume = 4/3*Math.PI*Math.pow(radius,3);


        System.out.printf("The area is : %.1f cm²\n",area);
        System.out.println("The circumference is :"+circ+"cm²\n");
        System.out.println("The Volume is :"+volume+"cm³\n");



        scanner.close();
    }
}
