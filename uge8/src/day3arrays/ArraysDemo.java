package day3arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        ArraysDemo demo = new ArraysDemo();

        // Making an Array
        int[] myIntArray = new int[10]; // 10 er hvor mange tomme pladser der er i arrayet.

        // Store a value at a place in the array, hardcoded.
        myIntArray[0] = 10; // here were saving the value 10 to spot 1 (0 in the index) of the array.
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;
        myIntArray[5] = 60;
        myIntArray[6] = 70;
        myIntArray[7] = 80;
        myIntArray[8] = 90;
        myIntArray[9] = 100;

        System.out.println(myIntArray[3]); // printer 40 så

        // 2nd way to make (initialize) an array
        int[] myIntArray2 = {5, 15, 4, 30, 8};
        System.out.println(myIntArray2[2]); // would be 4 in this case
        // here we are giving the values directly when we are making the array
        // and also specifying the size of the array (5 in this case)

        // 3rd way to initialize an Array with for loop
        for (int i = 0; i < myIntArray.length; i++) { // dette for loop går igennem hvert element i myIntArray
            myIntArray[i] = i * 10;     // hvert element * vi med 10, så det får den ønskede værdi.
        }
        // her printer vi hver elements plads i arrayet, og dets værdi.
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        demo.printArray(myIntArray);
    }

    // Her laver en method der printer et array og modtager et int array som input
    public void printArray(int[] array) { // laver en method der skal modtage et int array som input
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
            // demo.printArray(myIntArray); kaldes sådan i main
        }

    }

}

