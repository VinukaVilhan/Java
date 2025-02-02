public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2};
            System.out.println(numbers[10]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+ e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception: "+ e.getMessage());
        }  
    }
}
