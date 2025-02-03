class Check{
    public boolean checkOddOrEven(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even");
            return true;
        }
        else
        {
            System.out.println("Odd");
            return false;
        }
    }

}
public class Main {
    public static void main(String[] args){
        Check c = new Check();
        System.out.println(c.checkOddOrEven(10));
    } 
}
