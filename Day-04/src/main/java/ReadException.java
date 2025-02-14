import java.io.*;

public class ReadException {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            String charData;
            while((charData=br.readLine())!=null){
                System.out.println(charData);
            }
        }catch(IOException e){
            System.out.println("File not found");
        }

    }
}
