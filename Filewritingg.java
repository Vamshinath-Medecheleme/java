import java.io.FileWriter;
import java.io.IOException;

public class Filewritingg {
    public static void main(String[] args) {
        try (FileWriter wr = new FileWriter("hellol.txt")) {

            wr.write("hello this is file writing for second tym ");
            wr.append("\n this is appending for first tym ");
            wr.close();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
