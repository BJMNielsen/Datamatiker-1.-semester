package day1;

import java.util.Scanner;

// Skriv et program, der modtager to tal via brugerinput og udskriver hvilket af tallene, som er størst.

public class FindStørsteTal {

    int tal1;
    int tal2;
    int largestNumber;

    public static void main(String[] args){
    FindStørsteTal størsteTal = new FindStørsteTal();
    størsteTal.getUserInput();
    størsteTal.findLargestNumber();
    størsteTal.displayLargestNumber();

    }
    public void getUserInput () {
    Scanner input = new Scanner(System.in);
    tal1 = input.nextInt();
    tal2 = input.nextInt();


    }
    public void findLargestNumber () {
        largestNumber = Math.max(tal1, tal2);


    }

    public void displayLargestNumber () {
        System.out.println(largestNumber);
    }
}
