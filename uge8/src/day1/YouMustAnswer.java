package day1;

import java.util.Scanner;

public class YouMustAnswer {

    public void enterName() {
        String inputName;
        do {
            System.out.println("Please enter your name");
            Scanner name = new Scanner(System.in);
            inputName = name.nextLine();
            if (inputName.isEmpty()) {
                System.out.println("You MUST enter your name");
            } else
                System.out.println("Thank you " + inputName);

        } while (inputName.isEmpty());
    }

    public static void main(String[] args) {
        YouMustAnswer answer = new YouMustAnswer();
        answer.enterName();


    }
}
