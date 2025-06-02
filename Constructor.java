
public class Harsh
{
    public static void main(String[] args)
    {
        //CONSTRUCTOR =  A special method to initialize objects
        //              you can pass arguments to a constructor
        //              and set up initial values

        students students = new students("Harshu",30,2.3);
        students student2 = new students("Harsha",50,4.5);
        students student3 = new students("Harshaa",22.2.2)


        System.out.println(students.name);
        System.out.println(students.age);
        System.out.println(students.gpa);
        System.out.println(students.isIn);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isIn);

        System.out.println();

        study

    }
}

//students file below

public class students {


    String name = "Harsh";
    int age;
    double gpa;
    boolean isIn;

    students(String name, int age, double gpa)
    {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

        this.isIn = true;
    }

    void study()
    {
        System.out.println(this.name +"is studying !");

    }
}
