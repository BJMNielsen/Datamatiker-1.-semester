package day2;

public class MethodsParameters {

    public void execute(String str) {   //
        System.out.println("i got: " + str);
    }

    public void addTwoNumbers (int num1, int num2) {
        System.out.println(num1 + num2);
    }


    public static void main(String[] args) {
        new MethodsParameters().execute("this string");
        new MethodsParameters().addTwoNumbers(1,2);
    }
}
