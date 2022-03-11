package day1;

// Skriv et program, der kan anlysere en sætning, som brugeren indtaster og ud fra denne  indikere om om han/hun er i godt humør.
//
//
//
//Flg. ord er indikatorer for godt humør:  latter, solskin, dejlig
//
//Flg. ord er indikatorer for at humøret ikke er godt: regn, trist, sur

import java.util.Scanner;

public class TekstAnalyse {

    String sætning;
    boolean godtHumær;

    public static void main(String[] args) {
        TekstAnalyse analyse = new TekstAnalyse();
        analyse.indlæsSætning();
        analyse.humørIndikator();
        analyse.udskrivHumør();

    }

    // Metode 1: indlæse en sætning fra bruger
    public void indlæsSætning() {
        Scanner input = new Scanner(System.in);
        sætning = input.nextLine();


    }

    // metode 2: undersøge sætning for humørindikator
    public void humørIndikator() {

        if (sætning.contains("latter") || sætning.contains("solskin") || sætning.contains("dejlig")) {
            godtHumær = true;
        }

        if (sætning.contains("regn") || sætning.contains("trist") || sætning.contains("sur")) {
            godtHumær = false;
        }
    }


    //metode 3 : udskrive humøret
    public void udskrivHumør() {
        if (godtHumær) {
            System.out.println("Humøret er vidst godt i dag");
        } else if (!godtHumær) {
            System.out.println("Humøret er vidst ikke godt i dag");
        }

    }

}

