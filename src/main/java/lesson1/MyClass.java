package lesson1;

import java.util.Arrays;

public class MyClass {
    Integer[] myArray;

    public MyClass(Integer[] myArray) {
        this.myArray = myArray;
    }

    public void print() {
        System.out.println(Arrays.toString(myArray));
    }

    public Integer[] getMyArray() {
        return myArray;
    }
}