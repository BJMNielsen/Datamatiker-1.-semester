package day1;

import java.util.Scanner;

public class YouMustAnswer2 {

    public void answer() {
        boolean keepGoing = true;
        Scanner in = new Scanner(System.in);
        String name;

        do {
            System.out.print("Please enter your name: ");
            name = in.nextLine();
            if (name.length() == 0)
                System.out.println("You MUST enter your name.\n");
            else
                keepGoing = false;
        } while (keepGoing);

        System.out.println("Thank you, " + name + ".");
    }


    public static void main(String[] args) {
        new YouMustAnswer2().answer();
    }
}


