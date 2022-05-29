package com.leetCode.Arrays;


/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
public class _88_Merge_sorted_array {


    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(num1, m, num2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        m--;
        n--;


        for(int i=nums1.length - 1; i >= 0; i--) {

            if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (m < 0) {

                return;
            } else {
                if (nums2[n] > nums1[m]){
                    nums1[i] = nums2[n--];

                } else {
                    nums1[i] = nums1[m--];

                }
            }


        }
    }
}
