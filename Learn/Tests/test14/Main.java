public class Main {

    public static int classVariable = 20;

    public static void main(String[] args) {

        // static variable
        final int max = 100;
        Example example = new Example();
        System.out.println(example.instanceVariable);
        myMethod();
        System.out.println(max);
        System.out.println(classVariable);
        System.out.println(Example.classVariable);
        System.out.println("Long data type: "+ example.l);
        System.out.println("Float data type: "+ example.f1);
    }
    
    public static void myMethod() {
        // local variable
        int local = 10;
        System.out.println(local);
    }

}

class Example{
    int instanceVariable = 5; 

    static int classVariable = 80;
    // smallest integer type
    byte b1 = 10;
    // larger than byte, useful when memory savings are needed but range requirements are larger
    short s = 100;
    int number = 1000;
    // larger than int
    long l = 10000L;
    // single precison flaot number
    float f1= 19.5f;
    // stores decimal values
    double d = 20.5;
    // stores single character
    char letter = 'A';
    // stores true or false
    boolean flag = true;

    String name = "Java";
    int[] arr = {1, 2, 3, 4, 5};
 }
