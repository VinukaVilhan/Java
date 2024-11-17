package Learn.Arrays;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        // char vowels[] = new char[5];

        char vowels[] = {'u','o','i','e','a'};

        // refernced type
        char copyVowels[] = vowels;

        // proper copy
        char properCopyVowels[] = Arrays.copyOf(vowels, vowels.length);

        // larger space arrangement
        char largerCopyVowels[] = Arrays.copyOf(vowels, 10);

        // copy specified range of values
        char rangeCopyVowels[] = Arrays.copyOfRange(vowels, 0 , 2);

        // -------- declaring values -------------

        // vowels[1]= 'z';

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        // print by pos
        // System.out.println(vowels[0]);

        System.out.println(vowels.length);
        System.out.println(Arrays.toString(vowels));
        
        
        // can sort arrays of dif data types
        // sort whole array
        Arrays.sort(vowels);

        // ----------------------- sorting -------------------------------
        
        // sort with additional parametes

        // range based sorting
        // Arrays.sort(vowels, 0 , 3);


        // -------------------------- binary search ----------------------------
        // return the index of the key
        // int index = Arrays.binarySearch(vowels, 'u');

        // negative value indicated that value is not found and gives the value of the position to be inserted if present

        // int index = Arrays.binarySearch(vowels, 0, 3, 'z');

        // only works correctly on sorted arryay
        int index = Arrays.binarySearch(vowels,'a');
        System.out.println("The key is: " + index);

        // ---------------------------- array formating -------------------------
        // filling the array with a value
        Arrays.fill(vowels, 0 , 2, 'x');

        // filling the array with value [additional parameters]
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(copyVowels));
        System.out.println(Arrays.toString(properCopyVowels));
        System.out.println(Arrays.toString(largerCopyVowels));
        System.out.println("The range of Array: " + Arrays.toString(rangeCopyVowels));

        // check if the reference and proper copy comparison result
        // true
        System.out.println("Reference copy result: " + (vowels == copyVowels));

        // false
        System.out.println("Real Copy result: " + (vowels == properCopyVowels));

        // true
        System.out.println("Real Copy result proper comparison: " + Arrays.equals(vowels, copyVowels));
    }
}


// arrays in java are reference types. When an assigment operator is used it just creates a new variable and points the olod variable to the new array

// when takign an range the starting number is inclusive but the ending number is exclusive.

// to copy array properly Arrays.copyOf