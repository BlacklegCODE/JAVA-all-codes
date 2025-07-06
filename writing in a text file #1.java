import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        try
        {
            Scanner scanner = new Scanner(System.in);

            FileWriter writer = new FileWriter("journal.txt");

            System.out.print("Enter todays entry ");
            String input = scanner.nextLine();

            writer.write(input);
            writer.close();
            System.out.println("Writing complete 😊");
        }
        catch(IOException e)
        {
            System.out.println("Error :" + e.getMessage());
        }
    }


    public void writing(Scanner scanner)
    {

    }
}
