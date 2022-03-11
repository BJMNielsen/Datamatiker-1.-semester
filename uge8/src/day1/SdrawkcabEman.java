package day1;

import java.util.Locale;
import java.util.Scanner;

public class SdrawkcabEman {

    public static void main(String[] args) {
        SdrawkcabEman name = new SdrawkcabEman();
        name.nameBackwards();

    }

    public void nameBackwards() {
        String name;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter your name: ");
            name = input.nextLine().toUpperCase(Locale.ROOT);

        } while (name.length() == 0);
        System.out.print("I think i got your name backwards ");
        for (int i = name.length() - 1; i >= 0; i--)
            System.out.print(name.charAt(i));
        System.out.print(".");
    }
}



