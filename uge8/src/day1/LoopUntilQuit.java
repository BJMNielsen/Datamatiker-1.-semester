package day1;

import java.util.Locale;
import java.util.Scanner;

public class LoopUntilQuit {

    public void untilQuit() {
        String answer;
        boolean isQuit = true;
        Scanner input = new Scanner(System.in);

        while (isQuit) {
            System.out.println("Enter text (\"quit\" to quit)");
            answer = input.nextLine();
            System.out.println("You entered " + answer);
            if (answer.equalsIgnoreCase("quit")) {
                isQuit = false;
            }

        }
    }

    public static void main(String[] args) {
        LoopUntilQuit luq = new LoopUntilQuit();
        luq.untilQuit();
    }
}
