package afleveringer;

import java.util.Scanner;

public class Lønberegner {

    final double timeLøn = 150;
    double ugeTimer;
    double overarbejdeSats;
    double trækProcent = 0.36;

    double bruttoLøn;
    double nettoLøn;
    double amBidrag;
    double aSkat;

    public void bruttoBeregner() {

        Scanner bruttoScanner = new Scanner(System.in);
        System.out.println("Velkommen til bruttolønberegneren. \nIndtast ugentligt timeforbrug");
        ugeTimer = bruttoScanner.nextDouble();
        bruttoLøn = ugeTimer * timeLøn;
        System.out.println("din bruttoløn er " + bruttoLøn);

    }

    public void nettoBeregner() {
        Scanner nettoScanner = new Scanner(System.in);
        System.out.println("Velkommen til nettolønberegneren. \nIndtast ugentligt timeforbrug");
        ugeTimer = nettoScanner.nextDouble();
        amBidrag = bruttoLøn * 0.92;
        aSkat = amBidrag - (amBidrag * trækProcent);
        nettoLøn = aSkat;
        System.out.println("din nettoløn er " + nettoLøn);

    }

    public static void main(String[] args) {
        Lønberegner Løn = new Lønberegner();
        Løn.bruttoBeregner();
        Løn.nettoBeregner();

    }
}
