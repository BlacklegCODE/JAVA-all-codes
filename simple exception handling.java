import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("journal.txt");

        try
        {
            int ch;

            while((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);
            }
        }
        catch (IOException e)
        {
            System.out.println("This is ERROR :" + e.getMessage());
        }
    }
}
