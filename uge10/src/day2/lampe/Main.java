package day2.lampe;

public class Main {
    public static void main(String[] args) {
        Lampe sengelampe = new Lampe("on");
        System.out.println();
        sengelampe.trykPåKontakt();
        System.out.println();
        Lampe bordLampe = new Lampe();
        bordLampe.trykPåKontakt();

    }
}
