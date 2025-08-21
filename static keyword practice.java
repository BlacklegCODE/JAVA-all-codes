public class Main
{
    public static void main(String[] args)
    {
         Friends friend1 = new Friends("Harsh");
         Friends friend2= new Friends("Bro");
        Friends friend3 = new Friends("Blackleg");
        Friends friend4 = new Friends("Zoro");
        Friends friend5 = new Friends("Luffy");


         System.out.println(Friends.num);


         Friends.showfrnds();

         Math.round(4.99);
        System.out.println(Math.round(43.5));
    }
}

//below is the Friends class

public class Friends
{
    static int num;
    String name;

    Friends(String name)
    {
        this.name = name;
        num++;
    }

    static void showfrnds()
    {
        System.out.println("You have "+ num+ " total friends !");
    }
}
