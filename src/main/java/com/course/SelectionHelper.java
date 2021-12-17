package com.course;

import com.course.utils.ArrayGenerator;

public class SelectionHelper {


    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i].compareTo(arr[i+1]) >0)
                return false;
        }
        return true;
    }


    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {

        long start = System.nanoTime();
        if (sortName.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        }
        if (sortName.equals("sortFromEnd")) {
            SelectionSort.sortFromEnd(arr);
        }
        long end = System.nanoTime();
        double duration = (end - start) / 1000000000.0; //conver to second

        if (!SelectionHelper.isSorted(arr)) {
            System.out.println("sorted array failed");
        }
        System.out.printf("%s, n = %d : %f s%n%n", sortName, arr.length, duration);

    }



}
