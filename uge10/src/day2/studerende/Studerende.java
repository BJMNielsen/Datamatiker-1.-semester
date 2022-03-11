package day2.studerende;

import java.util.Arrays;
import java.util.Scanner;

public class Studerende {
    Scanner input = new Scanner(System.in);
    String name;
    String studieLinje;
    int studieNr;
    int årgang;
    int[] grades = new int[7];

    Studerende(String nameInput, String studieLinjeInput, int studieNrInput, int årgangInput) {
        name = nameInput;
        studieLinje = studieLinjeInput;
        studieNr = studieNrInput;
        årgang = årgangInput;
    }

    public void addGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Hej. Indtast venlig din " + (i + 1) + " karakter");
            int karakter = input.nextInt();
            grades[i] = karakter;
        }
        System.out.println(Arrays.toString(grades));
    }

}
