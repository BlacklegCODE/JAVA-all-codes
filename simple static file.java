Main.java
public class Main
{
    public static void main(String[] args)
    {
        //Static - This makes a variable or method belong to the clas
        //          rather than to any specific object.
        //          It is commonly user for utility methods or shared resources.

        Friend friend1 = new Friend("Jarvis");
        Friend friend2 = new Friend("Hanuman");
        Friend friend3 = new Friend("Maruti");
        Friend friend4 = new Friend("Sanji");
        Friend friend5 = new Friend("Zoro");


        Math.round(3.98);



        System.out.println(Friend.numoffriends);

        Friend.showfriends();
    }
}


//Friend.java is below here

public class Friend {


    static int numoffriends;


    String name;

    Friend(String name)
    {
        this.name = name;
        numoffriends++;
    }

    static void showfriends()
    {
        System.out.println("You have "+numoffriends+" friends !");
    }
}
