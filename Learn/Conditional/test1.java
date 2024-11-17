package Learn.Conditional;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("What operation do you want to prefer? ");
            String operation = scanner.nextLine();
            
            
            if(operation.equals("sum"))
            {
                System.out.printf("%f + %f = %f", number1, number2, number1+number2);
            }
            else if(operation.equals("sub"))
            {
                System.out.printf("%f - %f = %f", number1, number2, number1-number2);
            }
            else if(operation.equals("mul"))
            {
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
            }
            else if (operation.equals("div"))
            {
                if(number2 == 0)
                {
                    System.out.println("The number is not divisible by 0");
                }
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
            else
            {
                System.out.printf("%s is not supported", operation);
            } 

            scanner.close();
    
        }

    }
}
