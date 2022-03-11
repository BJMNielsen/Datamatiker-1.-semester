package day3;

public class OverloadingDemo {

    public double calculateAverage(double d1, double d2) {
        return (d1 + d2) / 2;
    }

    public int calculateAverage(int i1, int i2) {
        return (i1 + i2) / 2;
    }

    public void execute() {
        int i1 = 5;
        int i2 = 7;
        double d1 = 5.5;
        double d2 = 7.8;

        System.out.println(calculateAverage(i1, i2));
        System.out.println(calculateAverage(d1, d2));

    }

    public static void main(String[] args) {
        new OverloadingDemo().execute();
    }
}
