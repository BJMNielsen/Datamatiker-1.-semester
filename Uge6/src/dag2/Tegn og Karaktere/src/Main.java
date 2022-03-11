import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = input.nextLine();
        System.out.println("Your full name is " + name);

        // navn uden mellemrum
        System.out.println(name.replaceAll(" ",""));

        // Forbogstav og efternavn
        System.out.println(name.charAt(0) + "." + name.substring(name.indexOf(" ")));

        // Initialer
        System.out.println("" + name.charAt(0) + name.charAt(name.indexOf(" ") + 1));

        // FOr og efternavn pænt under hinanden
        System.out.println("Fornavn:        " + name.substring(name.indexOf(name.charAt(0)), name.indexOf(" ")));
        System.out.println("Efternavn:     " + name.substring(name.indexOf(" ")));

        // Efternavn, komma, fornavn: Spears, Britney
        System.out.println(name.substring(name.indexOf(" ")+1) + ", " + name.substring(0, name.indexOf(" ")));

        // FUlde navn i anførselstegn
        System.out.println('"' + name + '"');

        // Fulde navn mellem apostroffer: 'Britney Spears'
        System.out.println("'" + name + "'");

        // Fornavn uden første og sidste bogstav: ritney

        // Første og sidste bogstav i efternavn: Ss

    }
}