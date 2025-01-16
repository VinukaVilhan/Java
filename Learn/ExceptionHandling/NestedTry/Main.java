public class Main {
    public static void main(String[] args) {
        try {
            int [] numbers = {1, 2, 3};
            try {
                System.out.println(numbers[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch, Array Index Out Of Bounds Exception: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("Outer catch, general exception");
        }
    }
}
