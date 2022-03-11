import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        boolean isPlaying = true;
        int playerSum = 0;
        int dealerSum = 0;
        while (isPlaying) {

            // PLAYERS TURN
            System.out.println("Players turn");
            System.out.println("Players sum er " + playerSum + ", vil du stoppe?");

            Scanner player = new Scanner(System.in);
            Random random = new Random();

            String nytKortPlayer = player.nextLine();
            if (nytKortPlayer.equals("ja")) {
                isPlaying = false;
            } else {
                int playerDraw = random.nextInt(13) + 1;
                playerSum = playerSum + playerDraw;
                System.out.println("Player draws " + playerDraw);
                System.out.println("Your new sum is " + playerSum);
            }

            // DEALERS TUR
            System.out.println("Dealers turn");
            System.out.println("Dealers sum er " + dealerSum + ", vil du stoppe?");
            Scanner dealer = new Scanner(System.in);
            String nytKortDealer = player.nextLine();

            if (nytKortDealer.equals("ja")) {
                isPlaying = false;
            } else {
                int dealerDraw = random.nextInt(13) + 1;
                dealerSum = dealerSum + dealerDraw;
                System.out.println("Dealer draws " + dealerDraw);
                System.out.println("Your new sum is " + dealerSum);
            }

            // if player or dealer gets 21 or over 21, game is over
            if (playerSum >= 21 || dealerSum >= 21) {
                isPlaying = false;
                System.out.println("Player has " + playerSum + " and dealer has " + dealerSum + ". The game is over.");
            }

            // if both player and dealer gets 21, it's a draw.
            if (playerSum == 21 && dealerSum == 21) {
                isPlaying = false;
                System.out.println("Player and dealer has BLACKJACK, the game is tied!");
            }
        }
    }
}








