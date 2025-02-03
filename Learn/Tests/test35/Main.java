// method overloading

class Calculation{
    int add(int a, int b){
        return a+b;
    }

    int add (int a, int b, int c )
    {
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    int substract(int a, int b){
        return a-b;
    }

    double substract(double a, double b){
        return a-b;
    }
}

public class Main {
    public static void main(String[] args){
        Calculation cal1 = new Calculation();
        System.out.println(cal1.add(10, 20));
        System.out.println(cal1.add(10.5, 20.5));
        System.out.println(cal1.substract(10, 20));
        System.out.println(cal1.substract(10.5, 20.5));
    }
}
