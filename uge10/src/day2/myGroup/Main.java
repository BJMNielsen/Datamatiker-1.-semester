package day2.myGroup;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    boolean isRunning;
    int groupSize;

    public static void main(String[] args) {
        new Main().registerMembers();

    }

    public int setGroupSize() {
        System.out.println("Please enter the size of your group");
        groupSize = input.nextInt();
        return groupSize;
    }

    public void registerMembers() {
//        GroupMember Malik = new GroupMember("Malik", 31343538, "Malik@hotmail.com");
//        GroupMember Younes = new GroupMember("Younes Rafaty", 32546622, "Younes@hotmail.com");
//        GroupMember Michael = new GroupMember("Michael B", 32204422, "Michael@hotmail.com");
//        GroupMember Benjamin = new GroupMember("Benjamin N", 31316163, "bjmn93@live.dk");
        groupSize = setGroupSize();
        GroupMember[] members = new GroupMember[groupSize];

        for (int i = 0; i < members.length; i++) {
            System.out.println("Please enter the information of user: " + (i + 1));
            GroupMember user = new GroupMember();
            user.memberInput();
            members[i] = user;
        }
        System.out.println(Arrays.toString(members));


//        System.out.println("please enter information on group member one");
//        GroupMember User1 = new GroupMember();
//        User1.memberInput();
//        System.out.println(User1);
//        System.out.println("please enter information on group member two");
//        GroupMember User2 = new GroupMember();
//        User2.memberInput();
//        System.out.println(User2);
//        System.out.println("please enter information on group member three");
//        GroupMember User3 = new GroupMember();
//        User3.memberInput();
//        System.out.println(User3);
//        System.out.println("please enter information on group member four");
//        GroupMember User4 = new GroupMember();
//        User4.memberInput();
//        System.out.println(User4);


//        System.out.println(Malik + "\n" + Younes + "\n" + Michael + "\n" + Benjamin);
//        System.out.println("\n" +
//                "Your groups information is as follows: " +
//                "\n" + User1 + "\n" + User2 + "\n" + User3 + "\n" + User4);
    }
}
