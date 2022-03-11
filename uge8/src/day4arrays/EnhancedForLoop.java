package day4arrays;

public class EnhancedForLoop {

    public static void main(String[] args) {
        // også kaldet for each loop
        // kan kun bruges til at køre arrays (eller andre "lister") igennem én gang fra ende til anden

        System.out.println("Enhanced for loop: ");

        int[] myArray = {17, 3, -2, 10, 4};

        for (int j : myArray) {
            System.out.println(j); // j i stedet for myArray[j]
        }
    }
}

