class Calculator{
    static int add(int a, int b){
        return a + b;
    }

    static int substract(int a, int b){
        return a - b;
    }
}

public class Main {
    public static void main(String args[])
    {
        // no need of instance to call static methods
        System.out.println(Calculator.add(10, 20));
        System.out.println(Calculator.substract(20, 10)); 
    }    
}
