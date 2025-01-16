public class Main {
    public static void main(String[] args){
        try {
            int num = 10;
            int result = num / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Artihmetic Exception: " + e.getMessage());
        }
    }
}
