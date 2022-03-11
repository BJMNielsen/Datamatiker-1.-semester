package day2.lampe;

public class Lampe {
    boolean on = true;

    Lampe(String onOrOff) {
        if (onOrOff.equalsIgnoreCase("on")) {
            on = true;
            System.out.println("Lights on!");
        } else if (onOrOff.equalsIgnoreCase("off")) {
            on = false;
            System.out.println("Lights off!");
        }
    }

    Lampe() {
        on = false;
        System.out.println("Lights off");
    }

    public void trykPåKontakt() {
        if (on == false) {
            on = true;
            System.out.println("light on!");
        } else {
            on = false;
            System.out.println("light off!");
        }
    }
}
