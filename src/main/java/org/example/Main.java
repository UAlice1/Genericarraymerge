//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[]{1, 2, 3};
        Integer[] numbers2 = new Integer[]{4, 5, 6};
        Integer[] mergedNumbers = (Integer[])GenericArrayUtility.mergeArrays(numbers1, numbers2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedNumbers));
        String[] fruits1 = new String[]{"apple", "banana"};
        String[] fruits2 = new String[]{"cherry", "date"};
        String[] mergedFruits = (String[])GenericArrayUtility.mergeArrays(fruits1, fruits2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedFruits));
    }
}
