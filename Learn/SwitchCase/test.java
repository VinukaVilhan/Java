package Learn.SwitchCase;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // initialize new scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the number corresponding to the operation you want to perform");
        System.out.println(" 1.Summation\n 2.Substraction\n 3.Division\n 4.Multiplication\n");
        System.out.println("Enter the input");
        
        // scanner object to read input
        int operation = scanner.nextInt();

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        //switch operation
        switch(operation)
        {
            case 1 -> {
                System.out.println("You selected Summation");
                double sum = num1 + num2;
                System.out.println("The sum is " + sum);
            }
            case 2 -> {
                System.out.println("You selected Substraction");
                double dif = num1 - num2;
                System.out.println("The difference is "+ dif);
            }
            case 3 -> {
                System.out.println("You selected Divison");
                double quotient = num1 / num2;
                System.out.println("The quotient is "+ quotient);
            }
            case 4 -> {
                System.out.println("You selected Multiplication");
                double multiplication  = num1 * num2;
                System.out.println("The multiplication is "+ multiplication);
            }
            default -> System.out.println("Invalid selection");
        }
        scanner.close();
    }
}
