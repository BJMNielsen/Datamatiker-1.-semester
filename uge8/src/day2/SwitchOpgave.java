package day2;

import java.util.Scanner;

public class SwitchOpgave {

    public int userInput() {
        System.out.println("Enter day of the week: 1-7");
        Scanner in = new Scanner(System.in);
        int inputNumber = in.nextInt();
        return inputNumber;
    }

    public void switchDay() {
        String day;
        boolean keepGoing = true;

        while (keepGoing) {
            switch (userInput()) {
                case 1 -> day = "Monday";
                case 2 -> day = "Tuesday";
                case 3 -> day = "Wednesday";
                case 4 -> day = "Thursday";
                case 5 -> day = "Friday";
                case 6 -> day = "Saturday";
                case 7 -> day = "Sunday";
                default -> {
                    day = "Unknown day";
                    keepGoing = false;
                }
            }
            System.out.println("I call that " + day);

        }
    }

    public static void main(String[] args) {
        new SwitchOpgave().switchDay();

    }
}

