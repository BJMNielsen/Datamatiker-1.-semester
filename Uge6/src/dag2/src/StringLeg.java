package dag2.src;

import java.util.Locale;
import java.util.Scanner;

public class StringLeg {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner in = new Scanner(System.in);

        System.out.println("Indtast din string 1");
        str1 = in.nextLine(); // assigner input string til str1
        System.out.println("Indtast din string 2");
        str2 = in.nextLine(); // assigner input string 2 til str2

        // First char in Str1
        System.out.println("First char of str1: " + str1.charAt(0));

        // Number of chars in str1
        System.out.println("Number of chars in str1: " + str1.length());

        // Last char of str1
        System.out.println("First char of str1: " + str1.charAt(str1.length()-1));

        // is str1 equal to str2?
        System.out.println(str1.equals(str2));

        // str1 compared to str2
        System.out.println(str1.compareTo(str2));

        // concatenation of str1 and str2:
        System.out.println(str1.concat(str2));

        // str1 contains str2:
        System.out.println(str1.contains(str2));

        // str1 as all-upper-case:
        System.out.println(str1.toUpperCase());

        // str1 as all-lower-case:
        System.out.println(str1.toLowerCase());

        // str1 without leading or trailing spaces:
        System.out.println(str1.trim());

        // str1 from character number 2 and onwards:
        System.out.println(str1.substring(2));

        // str1 from character number 2 to 3 (both included:
        System.out.println(str1.substring(2,4));


    }
}
