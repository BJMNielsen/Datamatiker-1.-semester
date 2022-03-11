package day2;

import java.util.Scanner;

public class Calculator {

    double brugerTal1, brugerTal2;
    String sætning;
    double result;

    public void getUserInput () {
        Scanner input = new Scanner(System.in);
        brugerTal1 = input.nextDouble();
        input.nextLine();
        sætning = input.nextLine();
        brugerTal2 = input.nextDouble();
    }

    public void operator () {
        switch (sætning) {
            case "+":
                new Calculator().calculatePlus(brugerTal1, brugerTal2);
                break;
            case "-":
                new Calculator().calculateMinus(brugerTal1, brugerTal2);
                break;
            case "*":
                new Calculator().calculateMulti(brugerTal1, brugerTal2);
                break;
            case "/":
                new Calculator().calculateDivision(brugerTal1, brugerTal2);
                break;

        }
    }

    public void calculatePlus(double brugerTal1, double brugerTal2) {
        result = brugerTal1 + brugerTal2;
        System.out.println(result);
    }

    public void calculateMinus(double brugerTal1, double brugerTal2) {
        result = brugerTal1 - brugerTal2;
        System.out.println(result);
    }

    public void calculateMulti(double brugerTal1, double brugerTal2) {
        result = brugerTal1 * brugerTal2;
        System.out.println(result);
    }

    public void calculateDivision(double brugerTal1, double brugerTal2) {
        result = brugerTal1 / brugerTal2;
        System.out.println(result);
    }

    public void mPlus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to press M+, which is to add the current result to the last result?");
        String answer = input.nextLine();
        if (answer == "yes" || answer == "Yes") {

        }

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getUserInput();
        calculator.operator();
        calculator.mPlus();
    }
}
