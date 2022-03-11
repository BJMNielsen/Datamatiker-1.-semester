package day1;

import java.util.Scanner;

public class LoopUntil992 {

    public void askNumber() {
        boolean isRunning = true;
        int numberReply;
        Scanner input = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\nEnter number (99 to quit)");
            numberReply = input.nextInt();
            System.out.println("You entered " + numberReply);
            if (numberReply == 99)
                isRunning = false;
        }
    }


    public static void main(String[] args) {
        LoopUntil992 loop = new LoopUntil992();
        loop.askNumber();
    }
}
