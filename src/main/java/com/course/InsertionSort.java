package com.course;

import java.util.Arrays;

public class InsertionSort {

    private InsertionSort() {}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        // loop one element one time, and compare with previous element,
        // sort with previous element

        for(int i=0; i<arr.length; i++) {

            for (int j = i; j>0; j--){
                if (arr[j-1].compareTo(arr[j])>0) {
                    swap(arr, j, j-1);
                } else {
                    break;// break the loop
                }
            }

           /* for(int j = i; j>0 && arr[j-1].compareTo(arr[j]) >0; j==){
                swap(arr, j, j-1);
            }*/
        }
    }


    public static <E extends Comparable<E>> void sort2(E[] arr) {
       for(int i=0; i<arr.length; i++){
           E temp = arr[i];
           int j;// why use index here, because finally need to insert the temp to index j position
           for ( j = i; j>0; j--){
               if (temp.compareTo(arr[j-1])<0) {// 也可以把if条件放在for 里面，这样可以省略break
                   arr[j] = arr[j-1]; // 如果值比temp小，则平移一位
               } else {
                   break;
               }
           }
           arr[j] = temp;
       }
    }

    public static <E extends Comparable<E>> void sortReverse(E[] arr) {
        // arr[0, i) 未排序 arr[i...n) 已排序
        for(int i= arr.length - 1; i>=0; i--){
            E temp = arr[i];
            int j;
            for(j = i; j< arr.length -1 && temp.compareTo(arr[j+1])>0; j ++) {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
    }

    private static  <E> void swap(E[] arr, int indexMin, int indexMax) {
        E temp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {9, 3, 5, 1, 8};

       /*int[] data = {10000, 100000};
        for(int n : data) {
            Integer[] integers = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(integers, integers.length);
            SelectionHelper.sortTest("InsertionSort", integers);
            SelectionHelper.sortTest("InsertionSort2", arr2);
        }*/

       sortReverse(arr);

//        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
