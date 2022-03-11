package day2;

public class HelloMethodParameters {

    // Her er vores metode printOut. Jeg har specificeret at den skal have 1 parameter som er en String,
    // ..og den kaldes HelloString
    public void printOut (String HelloString) {
        System.out.println(HelloString);
    }

    public static void main(String[] args) {
        // Der er 2 måder at lave et nyt objekt og kalde en metode på det:
        //
        // Første måde: Vi laver objektet og kalder metoden og giver parametre i samme linje.
        new HelloMethodParameters().printOut("sup world");

        // Anden måde: Vi laver vores objekt først, og kalder metoden efterfølgende på objektet med parametre.
        HelloMethodParameters HelloWorld = new HelloMethodParameters();
        HelloWorld.printOut("sup world 2");
    }
}
