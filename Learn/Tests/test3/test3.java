package Learn.Tests.test3;

public class test3 {
    public static void main (String[] args)
    {
        int num1 = 12;
        int num2 = 10, num3 = 12;

        System.out.println("Addition: "+ (num1 + num2));
        System.out.println("Subtracted: "+ (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2) );
        System.out.println("Division: "+ ((double)num1/num2));
        System.out.println("Modulo: "+ (num1%num2));
        System.out.println("Assignment: "+(num1 == num2));
        System.out.println("Assignment: "+(num1 == num3));
        System.out.println("Assignment: "+(num1 > num2));
    }
}
