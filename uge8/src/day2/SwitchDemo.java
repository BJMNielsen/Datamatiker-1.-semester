package day2;

import java.util.Scanner;

public class SwitchDemo {

    public void demoSwitch() {
        Scanner in = new Scanner(System.in);
        int number;
        String text;

        System.out.println("Enter number: ");
        number = in.nextInt();

        // bruger skal skrive et tal fra som vi udskriver som text

        switch (number) {
            case 1:
                text = "one";
                break;
            case 2:
                text = "two";
                break;
            case 3:
                text = "three";
                break;
            case 4, 5, 6:  // kan også skrives sådan her hvis man har flere cases med samme output
                text = "somewhere between four and six";
                break;
            case 7: // eller sådan her
            case 8:
            case 9:
                text = "between seven and nine";
                break;
            default:
                text = "unknown number";
        }
        System.out.println("you entered " + text);

        // Switches kan også skrives med lambda således
        /* text = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4, 5, 6 -> "somewhere between four and six";
            case 7, 8, 9 -> "between seven and nine";
            default -> "unknown number";
            /*

    /* her laver vi det med if else statements

        System.out.println("Enter number: ");
        number = in.nextInt();

        if (number == 1)
            text = "one";
        else if (number == 2)
            text = "two";
        else if (number == 3)
            text = "three";
        else
            text = "unknown number";

        System.out.println("You entered " + text);
        */

    }

    public static void main(String[] args) {
        new SwitchDemo().demoSwitch();
    }
}
