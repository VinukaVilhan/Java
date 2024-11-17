import java.util.Scanner;

class Calculator {
    public double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public double substract(double num1 , double num2)
    {
        return num1 - num2;
    }

    public double multiply(double num1, double num2)
    {
        return num1 * num2;
    }

    public double divide(double num1, double num2)
    {
        return num1 / num2;
    }
}

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hey. It's the calculator!!!!!!!!!!!!");

        // initialize the new scanner
        Scanner scanner = new Scanner(System.in);
        // create new calculator object
        Calculator calculator = new Calculator();

        System.out.println("Enter the first number: ");
        // take the next available input and store it
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // opertaor'
        System.out.println("Enter the operator: + - * / ");

        char operator = scanner.next().charAt(0);

        double result;

        switch (operator)
        {
            case '+':
                result = calculator.add(num1, num2);
                System.out.println("The resutlt is "  + result);
                break;
            case '-':
                result =  calculator.substract(num1, num2);
                System.out.println("The result is: " + result);
                break;
            case '*':
                result =  calculator.multiply(num1, num2);
                System.out.println("The result is: "+ result);
                break;
            case '/':
                result =  calculator.divide(num1, num2);
                System.out.println("The result is: "+ result);
                break;
        }

        scanner.close();

    }
}