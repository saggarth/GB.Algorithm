package lesson1;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] arrayInt = {1,1,2,3,5,8,7,4,2,0};
        Integer[] arrayInteger = {1,2,9,8,4,6,4,6,8,4,9,4};
        MyClass myClass = new MyClass(new Integer[]{1, 2, 3});

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayInteger));
        myClass.print();

        simpleSearch(arrayInteger, 4);
        simpleSearch(myClass.getMyArray(), 2);
    }

    static void simpleSearch(Object[] array, int i) {
        long startTime = System.nanoTime();
        for (Object o: array) {
            if(o.equals(i)){
                System.out.println("Find " + i + ". Search complite in " + (System.nanoTime() - startTime) + "ns");
                break;
            }
        }
    }
}