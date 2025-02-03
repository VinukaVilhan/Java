
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}


public class Main {

    public static void checkAge(int age) throws AgeException{
        if(age < 18)
        {
            throw new AgeException("Access denied - You must be at least 18 years old.");
        }
        else
        {
            System.out.println("Access granted - You are old enough!");
        }        
    }
    public static void main(String args[])
    {
        try {
            checkAge(15); 
        } catch (AgeException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
