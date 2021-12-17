package com.course.utils;

import java.util.Random;

public class ArrayGenerator {

    private ArrayGenerator(){}

    public static Integer[] generateOrderedArray(int n) {
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }


    public static Integer[] generateRandomArray(int n, int bound) {

        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
           arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
