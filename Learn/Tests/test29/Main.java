import java.io.*;

public class Main {
    public static void main(String args[]) {
        try {
            FileReader file = new FileReader("test.txt");
            int ch;
            
            // Read the file character by character
            while ((ch = file.read()) != -1) { // -1 indicates EOF (End of File)
                System.out.print((char) ch); // Convert int to char and print
            }
            
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
