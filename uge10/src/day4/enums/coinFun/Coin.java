package day4.enums.coinFun;

import java.util.Random;

public class Coin {
    private CoinValue value;

    public Coin() {
        flip();
    }

    public CoinValue getValue() {
        return value;
    }

    public void flip() {
        Random myRandom = new Random();
        boolean value = myRandom.nextBoolean();

        // smartass måden
        //               (if)      ?     (true)            (false)
        this.value = value == true ? CoinValue.HEADS : CoinValue.TAILS;

        // normal måde
//        if (value == true)
//            this.value = CoinValue.HEADS;
//        else
//            this.value = CoinValue.TAILS;
    }
}
