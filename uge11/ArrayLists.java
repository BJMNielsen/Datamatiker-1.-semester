package uge11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {

        // et array af primitive datatype INT
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // ArrayLister kan KUN indeholde objekter. Ikke primitive datatyper som Ints f.eks.
        ArrayList<Integer> numbers2 = new ArrayList<>();

        // Nedenunder tager vi en int, som er en primitiv datatype, og laver den om til et Integer objekt.
        int number = 7;
        Integer box = Integer.valueOf(number);
        numbers2.add(box);
        Integer number2 = numbers2.get(0);
        System.out.println(numbers2);
    }
}

