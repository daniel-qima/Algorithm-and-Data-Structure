package com.course;

import com.course.utils.ArrayGenerator;

import java.util.Arrays;

public class SelectionSort {

    private SelectionSort() {}


    public static void main(String[] args) {
        Integer[] arr = {10000, 100000};
        for(int a: arr) {
//            Integer[] integers = ArrayGenerator.generateRandomArray(a, a);
//            SelectionHelper.sortTest("SelectionSort", integers);
//            SelectionHelper.sortTest("sortFromEnd", integers);
        }

        Integer[] nums = {2, 5, 4, 3, 6, 1};
        sortFromEnd(nums);
        System.out.println(Arrays.toString(nums));
        // 执行结果 大致相差100 倍
        // SelectionSort, n = 10000 : 0.144193 s
        // SelectionSort, n = 100000 : 15.334849 s
    }

    public static <E extends Comparable<E>> E[] sort(E[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for(int j = i; j<nums.length; j++) {
                if (nums[j].compareTo(nums[min]) < 0){
                    min = j;
                }
            }
            E temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
//           swap(nums, i, min );
        }
        return nums;
    }

    public static <E extends Comparable<E>> void sortFromEnd(E[] nums) {
        for(int i=nums.length-1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i; j >=0 ; j--) {
               if (nums[j].compareTo(nums[maxIndex]) > 0)
                   maxIndex = j;
            }
            swap(nums, i, maxIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int minIndex){
        E temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
