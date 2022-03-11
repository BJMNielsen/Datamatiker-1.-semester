package day2.personOpgave;

import java.util.Scanner;

public class Person {
    Scanner input = new Scanner(System.in);
    String name;
    int Age;

    Person() {
        System.out.println("Hello. Please enter your full name and your age");
        name = input.nextLine();
        Age = input.nextInt();
        System.out.println("Hello " + name + ", " + Age + ".");
    }

    public void hasBirthday() {
        Age += 1;
        System.out.println("Happy Birthday! You are now " + Age + " years old!");
    }
}
