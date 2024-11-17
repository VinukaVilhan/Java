package Learn.Loops;

public class forLoop {
    public static void main(String[] args)
    {
        int numbers[] = {1,2,3,4,5,6,7};

        for(int number = 1; number <= 10; number++)
        {
            System.out.printf("The number is %d\n", number);
        }
        
        for (int idx = 0; idx < numbers.length; idx++) {
            System.out.printf("The %d element is: %d\n", idx, numbers[idx]);      
        }

        // shortcut
        for(int n : numbers)
        {
            System.out.println(n);
        }
    }
}
