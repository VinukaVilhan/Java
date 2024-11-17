package Learn.dataTypes;

public class dataTypes 
{
    public static void main(String[] args) 
    {
        //integer types
        byte singleByte = 100; // -128 to 127
        short smallNumber = 20000; //-32,768 to 32,767
        int integer = 344212132; // -21477483648 to 21477483648
        long largeInteger = 823372036855477580L; // -92233720368554775808 to  92233720368554775808

        //decimal types
        double aDouble = 1.7893849; // 4.9E-324 to 1.7922342342343E9234
        float aFloat = 3.4028F; //1.4E-45 to 3.4028235E38

        //booleans
        boolean isTrue = false;
        boolean isWorkday = true;

        //characters
        char copyrightSymbol = '\u00A9';

        System.out.println("Byte: "+ singleByte);
        System.out.println("Small number: "+ smallNumber);
        System.out.println("Integer: "+ integer);
        System.out.println("Large Integer: " + largeInteger);
        System.out.println("Double value: "+ aDouble);
        System.out.println("Float: " + aFloat);
        System.out.println("True Boolean: "+ isTrue);
        System.out.println("False Boolean: " + isWorkday);
        System.out.println("This is the copyright symbol: "+ copyrightSymbol);
    }
}
