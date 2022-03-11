package day3;

import java.util.Scanner;

public class SmallestValue {

    public double calculateValue () {
        Scanner input = new Scanner(System.in);
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        double result = Math.min(Math.min(value1, value2), value3);
        return result; // vi har nu returnet result, dvs metoden calculateValue har værdien fra "result".

    }

    public void printResult () {
        // nu kan vi lave en metode der egentlig bare println metoden calculateValue, da metoden er tilegnet en værdi
        // pga vores "return result".
        System.out.println(calculateValue());
    }

    public static void main(String[] args) {
        SmallestValue value = new SmallestValue(); // vi laver en objekt at bruge metoderne på.
        value.printResult(); // vi kalder metoden printResult på objektet "value".
    }
}
