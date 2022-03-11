package day1;

import java.util.Scanner;

public class MetodeDemo {

    String name = " Tine"; // her laver vi en variabel liggende uden for main så den er delt på alle metoderne i classen.

    public static void main(String[] args) {
        // her kalder vi metoden i vores main

        Scanner input = new Scanner(System.in);

        MetodeDemo demo = new MetodeDemo(); // Vi "instanciere" eller skaber et nyt objekt af klassen: MetodeDemo.


        demo.m1(); // her bruger vi så metoden på vores nyligt skabt objekt: Objekt.metodenavn
        demo.m2(); // her kalder vi metoden m2
        demo.m3(); // her kalder vi metoden m3

        // her kalder vi vores nye metode callAll som indeholder alle de andre 3 metoder m1, m2, m3 for at gøre vores
        // main kode endnu kortere og simplere.
        demo.callAll();

    }
    // en metode som er void dvs vi ikke returnere nogle værdier
    public void m1() {
        System.out.println("hej");
    }
    // metode vi kalder m2
    public void m2() {
        System.out.println("med");
    }

    public void m3 () {
        System.out.println("dig" + name);
    }

    // her kalder vi alle de 3 andre metoder så vi egentlig bare kan bruge metoden callAll i main i stedet
    public void callAll () {
        m1();
        m2();
        m3();
    }
}
