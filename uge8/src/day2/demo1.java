/*
        package day2;

public class demo1 {
    package com.company;
import java.util.Scanner;

    public class Main {
        String text = null;
        Scanner input = new Scanner(System.in);
        boolean realYear = true;

        public static void main(String[] args) {
            Main main = new Main();
            main.execute();
        }
        void intro (){
            System.out.println("Give me a number of month,");
            System.out.println("and I will tell you how many days that number has.");
        }
        void inputMethod(){
            int userInput = input.nextInt();
            System.out.println("Number of month (1-12): " + userInput);
            switch (userInput){
                case 1,3,5,7,8,10,12 -> text = "That month has 31 days.";
                case 4,6,9,11 -> text = "That month has 30 days.";
                case 2 -> {
                    System.out.println("What year is it?");
                    userInput = input.nextInt();
                    if (userInput / 4 == 0 ) {
                        text = "That month has 29 days.";
                    } else {
                        text = "That month has 28 days.";
                    }
                }
                default -> {
                    text = "That month has 0 days because that month does not exist.";
                    realYear = false;
                }
            }
        }
        void output(){
            System.out.println(text + "\n");
        }
        void execute(){
            do {
                intro();
                inputMethod();
                output();
            } while (realYear);
        }
    }
}
*/