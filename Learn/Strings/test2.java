public class test2{
    public static void main(String[] args){
        String name ="vinuka fernandopulle";
        String name1 ="vinuka fernandopulle";

        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = "abc";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(name.equals(name1));

        String country = "Sri Lanka";

        String replacing = "This is you";

        int age = 30;

        double salary = 4500000.000;

        char percentSign = '%';

        boolean isTrue = true;

        System.out.println("Hello, I am "+ name +" and Im from "+country+" by the way I am "+ age + " years old.");

        String formattedString = String.format("My name is %s with a salary %.2f, I'm %d years old and I'm from %s. I have attended 100%c of my university classes", name, salary, age, country, percentSign);

        System.out.println(formattedString);

        System.out.println(String.format("Is your attendance really 100%c and it is not %b", percentSign, isTrue ));
        
        System.out.println(country.length());

        System.err.println(country.isEmpty());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(replacing.replace("you", "me"));
        System.out.println(replacing);

        System.out.println(replacing.contains("is"));

    }
}