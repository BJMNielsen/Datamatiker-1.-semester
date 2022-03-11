package day1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MetodeDemo2 {

    int point = 100; // hvis vi skal dele data mellem metoder, skal de sættes udenfor metoderne og main inde i klassen.

    public static void main(String[] args) {
        MetodeDemo2 demo = new MetodeDemo2();
        demo.DoubleUpIfMonday();
        demo.displayPoint();
    }

    public void DoubleUpIfMonday () {
        System.out.println("MONDAY");
        System.out.println(point);
        LocalDate today = LocalDate.now(); // Vi bruger metoden LocalDate til at lave en ny variabel "today" der viser
        // tiden nu vha. LocalDate.now().
        System.out.println(today.getDayOfWeek());

        if (today.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
            point = point * 2;

        }
    }
    public void displayPoint () {
        System.out.println(point);
    }

}

