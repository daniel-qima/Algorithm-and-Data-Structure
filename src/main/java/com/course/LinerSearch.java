package com.course;

import com.course.utils.ArrayGenerator;

public class LinerSearch {


    public static void main(String[] args) {

        Integer[] data = {1000000, 10000000};
        for (int n : data) {
            Integer[] array = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                 solution(array, n);
            }
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0; //转换成s nano转换成s， 9个0
            System.out.println("n = " + n + ", 100 runs: " + time + " s");
        }
    }


    public static <T> int solution(T[] data, T target) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return result;
    }
}
