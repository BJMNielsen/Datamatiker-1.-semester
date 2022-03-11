package afleveringer;

import java.util.Scanner;

public class Lønberegner2 {
    final double timeLøn = 150;
    double ugeTimer;
    double overarbejdeSats;
    double trækProcent = 0.36;

    double bruttoLøn;
    double nettoLøn;
    double amBidrag;
    double aSkat;

    // Indlæsning af brugerinput for Brutto beregning.
    public void userInputBrutto() {
        Scanner bruttoScanner = new Scanner(System.in);
        System.out.println("Velkommen til bruttolønberegneren. \nIndtast ugentligt timeforbrug");
        ugeTimer = bruttoScanner.nextDouble();
    }

    // Indlæsning af brugerinput for Netto beregning.
    public void userInputNetto() {
        Scanner nettoScanner = new Scanner(System.in);
        System.out.println("Velkommen til nettolønberegneren. \nIndtast ugentligt timeforbrug");
        ugeTimer = nettoScanner.nextDouble();
    }

    // Beregning af bruttoløn
    public double bruttoBeregner() {
        bruttoLøn = ugeTimer * timeLøn;
        return bruttoLøn;
    }

    // Beregning af nettoløn
    public double nettoBeregner() {
        amBidrag = bruttoLøn * 0.92;
        aSkat = amBidrag - (amBidrag * trækProcent);
        nettoLøn = aSkat;
        return nettoLøn;
    }

    // Udskrivning af bruttoløn
    public void printBrutto() {
        System.out.println("Din bruttoløn er " + bruttoBeregner());
    }

    // Uskrivning af nettoløn
    public void printNetto() {
        System.out.println("Din nettoløn er " + nettoBeregner());
    }

    public static void main(String[] args) {
        Lønberegner2 Løn = new Lønberegner2();
        Løn.userInputBrutto();
        Løn.bruttoBeregner();
        Løn.printBrutto();
        Løn.userInputNetto();
        Løn.nettoBeregner();
        Løn.printNetto();
    }
}



