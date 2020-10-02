//задания 2.1 и 2.2

package lesson2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {

        int[] array, noSortArray;
        array= new int[20];
        Random random = new Random();
        long startTime = System.nanoTime();

        int k = 5;

        for (int i=0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        noSortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(noSortArray));
        System.out.println(Arrays.toString(array));
        System.out.println(System.nanoTime() - startTime + " ns");

        linearSearch(noSortArray, k);
        binarySearch(array, k);
    }

    static void linearSearch (int[] array, int k) {
        long startTime = System.nanoTime();
        for (int a : array) {
            if (a == k) {
                System.out.println("Linear: find " + k + " in " + (System.nanoTime() - startTime) + " ns");
                break;
            }
        }
    }

    static void binarySearch (int[] array, int k) {
        long startTime = System.nanoTime();
        int firstInd = 0;
        int lastInd = array.length - 1;
        while (firstInd <= lastInd){
            int middleInd = (firstInd + lastInd)/2;
            if (array[middleInd] == k){
                System.out.println("Binary: find " + k + " in " + (System.nanoTime() - startTime) + " ns");
                break;
            }
            else if (array[middleInd] < k){
                firstInd = middleInd + 1;
            } else if (array[middleInd] > k) {
                lastInd = middleInd - 1;
            }
        }
    }
}