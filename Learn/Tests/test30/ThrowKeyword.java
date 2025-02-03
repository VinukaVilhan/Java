public class ThrowKeyword {
    static void checkNumber(int number){
        if(number < 0){
            throw new IllegalArgumentException("Number is negative"  + number);
        }else {
            System.out.println("Number is positive " + number);
        }
    }

    public static void main(String[] args){
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        checkNumber(10);
    }
}
