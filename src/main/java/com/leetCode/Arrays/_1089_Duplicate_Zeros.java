package com.leetCode.Arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class _1089_Duplicate_Zeros {

    public static void duplicateZeros(int[] arr) {
        //  [1,0,2,3,0,4,5,0]
        // [1,0,0,2,3,0,4,5]
        //  [1,0, 0, 2, 3,0, 0,4]
        /*for(int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                for(int j = arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }*/
        //****************************
        // soulution 2
        // using queue

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(arr[i]);
            }
            Integer poll = queue.poll();
            arr[i] = poll;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] height = {1,1,4,2,1,3};
//        {1, 0, 0, 2, 3, 0, 0, 4} 5 0 0
//        duplicateZeros(arr);
//        solution(arr);
//        so(arr);
        int[] nums = { 2, 1};
        int i = sor(nums);

        int[] brr = new int[5];
        brr[0] = 1;
      Arrays.stream(brr).forEach(System.out::println);
    }


    public static int sor(int[] nums) {

//        Arrays.sort(nums);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Set<Integer> set = new HashSet<>();
        for(int i=nums.length -1; i >= 0; i--) {
            set.add(nums[i]);
        }

        Integer[] arr = set.toArray(new Integer[0]);
        // List<Integer> list = new ArrayList<>(set);
        // return list.size()>2 ? list.get(2): list.get(0);
        return arr.length > 2 ? arr[0]:arr[2];
    }
    public static int heightChecker(int[] heights) {
        int k = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for(int i=0; i<heights.length; i++) {
            if (heights[i] != expected[i])k++;
        }
        return k;

    }


    public static int so(int[] nums) {
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]

        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }

    public static void solution(int[] arr) {
        int count = 0;
        for(int i : arr) {
            if(i == 0) {
                count++;
            }
        }
        int len = arr.length;
        for(int i = len - 1; i >= 0; i--) {
            int temp = i + count;
            if(temp < len) {
                arr[temp] = arr[i];
            }
            if(arr[i] == 0) {
                count--;
                temp = i + count;
                if(temp < len) {
                    arr[temp] = arr[i];
                }
            }
        }
    }
}
