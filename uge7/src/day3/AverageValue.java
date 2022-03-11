package day3;

import java.util.Scanner;

public class AverageValue {

    public double averageNumber () {
        Scanner input = new Scanner(System.in);
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        double result = (value1 + value2 + value3) / 3;
        return result; // vi har nu returnet result, dvs metoden averageNumber har værdien fra "result".
    }

    public void printResult () {
        // nu kan vi lave en metode der egentlig bare println metoden averageNumber, da metoden er tilegnet en værdi
        // pga vores "return result".
        System.out.println(averageNumber());
    }

    public static void main(String[] args) {
        AverageValue value = new AverageValue(); // vi laver en objekt at bruge metoderne på.
        value.printResult(); // vi kalder metoden printResult på objektet "value".
    }
}
