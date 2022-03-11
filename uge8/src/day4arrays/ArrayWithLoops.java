package day4arrays;

public class ArrayWithLoops {

    public void go() {
        int[] myArray = {17, 3, -2, 11, 4};

//      Ændre 3 element til værdien 0
        myArray[2] = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    // udskriv alle elementer indtil aktuelle element = 10
    public void udskrivElementerIArray() {
        int[] myArray = {17, 3, -2, 10, 4};
        int i = 0;
        while (myArray[i] != 10) {
            System.out.println(myArray[i]);
            i++;
        }
    }

    // udskriv alle elementer undtagen når aktuelt element = 10
    public void udskrivElementerUndtagenBestemtElement() {
        int[] myArray = {17, 3, -2, 10, 4};
        int i = 0;
        while (i < myArray.length) {
            if (myArray[i] != 10)
                System.out.println(myArray[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        new ArrayWithLoops().go();
        System.out.println("");
        new ArrayWithLoops().udskrivElementerIArray();
        System.out.println("");
        new ArrayWithLoops().udskrivElementerUndtagenBestemtElement();
    }


}
