public class Main {
    public static void main(String[] args)
    {
        // implicit casting
        int number = 100;
        long l1 = number;

        // explicit casting
        long l2 = 100;
        int number1 = (int)l2;

        System.out.println(number1 -= number);

        // bitwise operators
        int a = 5;
        int b = 7;
        // bitwise AND
        System.out.println(a & b);

        // bitwise OR
        System.out.println(a | b);

        // bitwise XOR
        System.out.println(a ^ b);

        // bitwise NOT
        System.out.println(~a);
        System.out.println(~b);

        // left shift
        System.out.println(a << 1);

        // right shift
        System.out.println(b >> 2);

        int min = (a < b) ?a:b;

        System.out.println(min);
    }
}
