package day3arrays;

public class CalculateAverageOfArray {
    public static void main(String[] args) {
        new CalculateAverageOfArray().calculateAverage();
    }

    int[] array1 = {2, 4, 4, 10, 1, 9};
    int sum = 0;
    
    public void calculateAverage() {

        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];

            double average = sum / array1.length;
            System.out.println("Average value of the array elements is" + average);
        }
    }
}
