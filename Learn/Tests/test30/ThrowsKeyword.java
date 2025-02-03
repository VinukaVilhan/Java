
import java.io.*;

public class ThrowsKeyword {
    public static void readFile() throws IOException{
        FileReader file = new FileReader("test.txt");
        file.close();
    }
    public static void main(String[] args){
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
