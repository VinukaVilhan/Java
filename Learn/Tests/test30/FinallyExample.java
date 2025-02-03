public class FinallyExample {
    public static void main(String args[])
    {
        try {
            int result = 10 / 0;  
          } catch (ArithmeticException e) {
            System.out.println("caught exception: " +e.getMessage());
          }finally{
            System.out.println("finally block is always executed");
          }
    }
}
