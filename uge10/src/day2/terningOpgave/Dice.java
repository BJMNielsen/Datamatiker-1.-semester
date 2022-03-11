package day2.terningOpgave;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dice {
    int faceValue;

    Dice() {

    }

    public int rollDice() {
        faceValue = (int) (Math.random() * 6) + 1;
        return faceValue;
    }

    public void hundredThrows() {
        int amountOfRolls = 100;
        int sumOfRolls = 0;
        int average;
        int[] arrayOfRolls = new int[amountOfRolls];

        for (int i = 0; i < amountOfRolls; i++) {
            arrayOfRolls[i] = rollDice();
        }
        System.out.println(Arrays.toString(arrayOfRolls));

    }
}

