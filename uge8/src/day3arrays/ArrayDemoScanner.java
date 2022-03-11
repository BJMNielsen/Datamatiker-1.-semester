package day3arrays;

import java.util.Scanner;

public class ArrayDemoScanner {

    private static Scanner input = new Scanner(System.in);

    // create method that accepts 5 inputs integers and stores them in an Array called myIntegers

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        return values;
    }

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
    }


}


