package day1;

import java.util.Scanner;

public class LoopUntil99 {

    public void Loop99() {
        int number = 0;
        Scanner input = new Scanner(System.in);

        // while ((number = input.nextInt()) != 99) DEN HER VIRKER

        while (number != 99) { // VIRKER IKKE ER ET INFINITE LOOP
            System.out.println("Enter number (99 to quit)");
            number = input.nextInt();
            System.out.println("you entered " + number);
        }
    }

    public static void main(String[] args) {
        LoopUntil99 loop = new LoopUntil99();
        loop.Loop99();

    }
}


