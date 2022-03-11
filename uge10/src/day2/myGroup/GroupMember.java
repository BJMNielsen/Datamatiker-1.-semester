package day2.myGroup;

import java.util.Scanner;

public class GroupMember {
    Scanner inputStrings = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    String name;
    int tlfNummer;
    String emailAdr;


    // constructor
    GroupMember(String nameInput, int tlfNummerInput, String emailAdrInput) {
        name = nameInput;
        tlfNummer = tlfNummerInput;
        emailAdr = emailAdrInput;
    }

    GroupMember() {

    }

    public void memberInput() {
        name = inputStrings.nextLine();
        tlfNummer = inputInt.nextInt();
        emailAdr = inputStrings.nextLine();
    }

    public void printMembers() {

    }

    @Override
    public String toString() {
        return "GroupMember{" +
                "name = " + name +
                ", tlfNummer = " + tlfNummer +
                ", emailAdr = " + emailAdr +
                '}';
    }
}
