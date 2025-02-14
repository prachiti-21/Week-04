import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line=br.readLine();
            if(line != null) {
                System.out.println(line);

            }

        } catch (IOException e){
            //System.out.println(e.getMessage());
            System.out.println("Error reading file");
            //.printStackTrace();
        }
    }
}
