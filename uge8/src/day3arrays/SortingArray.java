package day3arrays;

import java.util.Arrays;

public class SortingArray {

    int[] myArray1 = {1, 5, 2, 55, 1232, 233, 2, 321321};

    String[] myArray2 = {"Calvin", "Kathrine", "Benjamin"};

    public void sortArray1() {
        System.out.println("Original numeric array: " + Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array: " + Arrays.toString(myArray1));
    }

    public void sortArray2() {
        System.out.println("Original String array: " + Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Sorted String array: " + Arrays.toString(myArray2));
    }

    public static void main(String[] args) {
        new SortingArray().sortArray1();
        new SortingArray().sortArray2();

    }
}
