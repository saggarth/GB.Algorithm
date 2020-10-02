package lesson5;

import java.util.Arrays;
import java.util.Random;

class Task5 {
    public static void main(String[] args) {
        int searchKey = 27;
        int maxSize = 40;
        int[] array = new int[maxSize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxSize);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        if (find(searchKey, array) != array.length) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can’t find " + searchKey);
        }
    }

    public static int find(int searchKey, int[] array) {
        return recFind(searchKey, 0, array.length - 1, array);
    }

    private static int recFind(long searchKey, int lowerBound, int upperBound, int[] array) {
        int i = (lowerBound + upperBound ) / 2;
        if(array[i] == searchKey) {
            return i;
        } else if(lowerBound > upperBound) {
            return array.length;
        } else {
            if(array[i] < searchKey) {
                return recFind(searchKey, i + 1, upperBound, array);
            } else {
                return recFind(searchKey, lowerBound, i - 1, array);
            }
        }
    }
}