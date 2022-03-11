package day3;

public class ReturnValues {

    public void printString(String str) {
        System.out.println(str);
    }

    public int sum (int i1, int i2) {
        int result = i1 + i2;
        return result;
    }

    public void execute () {
       // ReturnValues.printString("Hi");
        int myResult;
        myResult = sum(4, 9);
        printString("" + myResult);
    }

    public static void main(String[] args) {
        new ReturnValues().execute();

    }
}
