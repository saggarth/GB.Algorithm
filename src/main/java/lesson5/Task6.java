package lesson5;

import java.util.Arrays;
import java.util.Random;

class Task6 {
    public static void main(String[] args) {
        int maxSize = 40;
        int[] array = new int[maxSize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxSize);
        }
        int[] arrayCopy = Arrays.copyOf(array, maxSize);

        System.out.println(Arrays.toString(array));
        long startTime = System.nanoTime();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Sort time is: " + (System.nanoTime() - startTime));
        System.out.println(Arrays.toString(arrayCopy));
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(recMergeSort(arrayCopy)));
        System.out.println("MergeSort time is: " + (System.nanoTime() - startTime));
    }

    private static int[] recMergeSort(int[] array) {
        int lenght = array.length;
        if (lenght < 2) {
            return array;
        }
        int middle = lenght / 2;
        return merge(recMergeSort(Arrays.copyOfRange(array,0, middle)), recMergeSort(Arrays.copyOfRange(array, middle, lenght)));
    }

    private static int[] merge(int[] arrayA, int[] arrayB) {
        int[] result = new int[arrayA.length + arrayB.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = arrayA[aIndex] < arrayB[bIndex] ? arrayA[aIndex++] : arrayB[bIndex++];
            if (aIndex == arrayA.length) {
                System.arraycopy(arrayB, bIndex, result, ++i, arrayB.length - bIndex);
                break;
            }
            if (bIndex == arrayB.length) {
                System.arraycopy(arrayA, aIndex, result, ++i, arrayA.length - aIndex);
                break;
            }
        }
        return result;
    }
}