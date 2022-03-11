package day4.enums.daysToXmas;

public class daysToXmas {
    public static void main(String[] args) {
        int daysToXmas = 5;
        for (int i = daysToXmas; i >= 0; i--) {
            System.out.println("Der er " + i +
                    (i == 1 ? " dag " : " dage ") +
                    "til jul.");
        }
    }
}
