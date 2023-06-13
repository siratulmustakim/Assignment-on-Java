//Question 12
//Write a program that will shuffle (values will randomly change their position) from the given array
//numbers=[1,2,3,4,5,6,7,8,9,0]
//random output: 3 5 0 1 7 9 6 4 2 8

import java.util.Random;

public class Problem12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] randIndex = new int[array.length];
        int temp;
        Random rand = new Random();
        int[] shuffledArray = new int[array.length];

// Math.random() die 0-9 all number generate korte parini, konota missing thakei. Random class works fine.

        temp = rand.nextInt(array.length);
        randIndex[0] = temp;
        shuffledArray[0] = array[randIndex[0]];

        for (int i = 1; i < array.length; i++) {

            temp = rand.nextInt(array.length);
            //randIndex[i] = temp;

            // to avoid duplicate number generation
            for (int j = i - 1; j >= 0; j--) {
                if (randIndex[j] == temp) {
                    i--;
                    break;
                } else if (j == 0) {
                    randIndex[i] = temp;
                    shuffledArray[i] = array[randIndex[i]];

                }
            }

        }
        // randIndex printing
//        for (int aa : randIndex) {
//            System.out.print("  " + aa);
//        }

        System.out.print("Shuffled array: ");
        for (int aa : shuffledArray) {
            System.out.print("  " + aa);
        }
        System.out.println();


    }

}