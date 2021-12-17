package com.leetCode.Arrays;

public class _1089_Duplicate_Zeros {

    public void duplicateZeros(int[] arr) {
        //  [1,0,2,3,0,4,5,0]
        // [1,0,0,2,3,0,4,5]
        //  [1,0, 0, 2, 3,0, 0,4]
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                for(int j = arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}
