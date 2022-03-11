package day4.enums;

import java.util.Random;
import java.util.Scanner;

public class LineBattle {
    // 2 ints, 1 for spiller og 1 for fjende. Hver int skal have en rækkevidde fra -10 - 10 for at vise hvor de er på feltet.
    // Scanner med terning input bestemmer start placeringen(altså int playerPosition/enemyPosition værdi).
    // først player og så enemy
    // Vi skal have en true boolean og koden skal laves i et while loop (hvis fjenden ikke er død eller jeg er død så kør videre)

    // vi skal bruge ne scanner der bestemmer om man vil rykke frem, tilbage eller angribe.

    // troppen(spejder) kan kigge 2 felter frem, men 3 tilbage
    // skal oplyse hvor fjenden er

    int playerPosition = 1;
    int enemyPosition = 1;

    int playerSoldiers = 25;
    int enemySoldiers = 25;

    int playerAmmo = 2500;
    int enemyAmmo = 2500;

    public void startGame() {
        Scanner start = new Scanner(System.in);
        System.out.println("Hello! Would you like to start playing?");
        String answer = start.nextLine();

        if (answer.toLowerCase().equals("yes")) {
            System.out.println("Spillet foregår på en endimensional spilleplade (felten) med 21 felter. Det er reelt bare en række med 21 felternummereret fra -10 til 10. \n" +
                    "Feltet i den venstre ende er felt nr. -10 (spillerens lejr). Feltet i den højre ende er +10, som er fjendens lejr.\nVed spillets start slår spilleren og fjenden med en terning én gang hver og rykker antallet af øjne ind i felten, altså 1-6 felter ind mod felt nr. 0. \n");

            System.out.println("Først slår spilleren:");
            Random startSlag = new Random();
            int playerStartSlag = startSlag.nextInt(6) + 1;
            System.out.println("Du slog " + playerStartSlag);
            playerPosition = playerStartSlag + (-10);
            System.out.println("Dvs din position nu er " + playerPosition);

            System.out.println("Nu er det fjendens (computerens) tur.");
            int enemyStartslag = startSlag.nextInt(6) + 1;
            System.out.println("Computeren slog " + enemyStartslag);
            enemyPosition = 10 - enemyStartslag;
            System.out.println("Dvs computerens position nu er " + enemyPosition);
        }
    }

    public void scoutPosition() {
        if ((playerPosition - enemyPosition) <= 2 && (playerPosition - enemyPosition) > 0) {
            System.out.println("You can see the enemy in front of you!");
        } else if ((enemyPosition - playerPosition) <= -3 && (enemyPosition - playerPosition <= 0)) {
            System.out.println("The enemy is behind you");
        } else if (playerPosition == enemyPosition) {
            System.out.println("The enemy is next to you!");
        } else
            System.out.println("No enemy in sight!");
    }

    public static void main(String[] args) {
        LineBattle lineBattle = new LineBattle();
        // boolean isPlaying = true;
        // while (isPlaying == true) {

        lineBattle.startGame();
        lineBattle.scoutPosition();


    }


}
