package Learn.UserInputs;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name");
            
            String name = scanner.nextLine();
            
            System.out.println(name);

            scanner.close();
        }

    }
}
