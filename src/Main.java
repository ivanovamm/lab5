import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        File myfile = new File ("file.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(myfile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}