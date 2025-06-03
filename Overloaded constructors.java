//Main.java below

( 
  
  public class Main
{
    public static void main(String[] args)
    {
        // Overloaded constructors = Allow a class to have multiple constructors
        //                           with different parameter lists
        //                           Enable objects to be initialized in various ways.


        Users user1 = new Users ("Blackleg");
        Users user2 = new Users("Zoro","imlost@#gmail.com");



        System.out.println(user1.username);
        System.out.println(user1.email);

        System.out.println(user2.username);
        System.out.println(user2.email);

    }
}

)

//users.java below

public class Users
 {

    String username;
    String email;
    int age;



     Users(String username)
     {
         this.username = username;
         this.email = "Not pro ";
         this.age = '0';
     }

     Users(String username, String email)
     {
         this.username = username;
         this.email = "Not pro ";
         this.age = '0';
     }

     Users(String username, String email, int age)
     {
         this.username = username;
         this.email = "Not pro ";
         this.age = age;
     }

 }
