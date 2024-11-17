package Learn.UserInputs;

import java.util.Scanner;

public class formatInput {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("What is your name? ");
            String name = scanner.nextLine();

            System.out.printf("Hello how old are you %s?", name);
            int age = Integer.parseInt(scanner.nextLine());

            System.out.printf("What is the GPA ?");
            double gpa = Double.parseDouble(scanner.nextLine());

            // cleans the input buffer
            // scanner.nextLine();
            
            System.out.printf("Hello %s. How are you?\n", name);
            System.out.printf("%d year olds are drafted for army", age);
            System.out.printf("Having a GPA of %d is great", gpa);
            scanner.close();
        }
    }
    
}
