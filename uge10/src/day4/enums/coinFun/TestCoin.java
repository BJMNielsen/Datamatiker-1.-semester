package day4.enums.coinFun;

public class TestCoin {
    public static void main(String[] args) {
        int headsCount = 0, tailsCount = 0;
        for (int i = 0; i < 100; i++) {
            Coin myCoin = new Coin();
            System.out.println(myCoin.getValue());

            if (myCoin.getValue() == CoinValue.HEADS)
                headsCount++;
            else tailsCount++;

        }
        System.out.println("\nTOTAL:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
    }
}
