package day2;

import java.util.Scanner;

public class DaysOfMonth {
    boolean isRunning = true;
    Scanner input = new Scanner(System.in);
    String day = null;
    int monthNumber;

    public void introMessage() {
        System.out.println("Please enter the number of a month (e.g. 1-12), and i will tell you how many days it has");
    }

    public void daysInMonth() {
        monthNumber = input.nextInt();
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> day = "31 days";
            case 4, 6, 9, 11 -> day = "30 days";
            case 2 -> {
                System.out.println("Which year?");
                monthNumber = input.nextInt();
                if (monthNumber / 4 == 0) {
                    System.out.println("29 days");
                } else
                    System.out.println("28 days");
            }
            default -> {
                day = "That's not a month!";
                isRunning = false;
            }
        }
    }

    public void output() {
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Number of month (1-12): " + monthNumber);
            System.out.println("That month has " + day);
        } else {
            isRunning = false;
        }
    }

    public void runProgram() {
        while (isRunning) {
            introMessage();
            daysInMonth();
            output();
        }
    }

    public static void main(String[] args) {
        DaysOfMonth gimmeDays = new DaysOfMonth();
        gimmeDays.runProgram();
    }
}


