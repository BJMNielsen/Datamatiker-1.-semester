package day3arrays;

public class SumValuesArray {
    public static void main(String[] args) {
        new SumValuesArray().sumValues();
    }

    int[] values = {99, 2, 6, 9, 2, 55, 2};
    int sum = 0;

    public void sumValues() {
        for (int i : values)
            sum = sum + i;
        // kan også skrives som
        // for (int i = 0; i < values.length; i = +1) {
        //      sum = sum + values[i];}
        System.out.println("The sum of the Array called Values is: " + sum);
    }
}
