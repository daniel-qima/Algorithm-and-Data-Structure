package com.leetCode.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class _977_Squaresof_a_Sorted_Array {

    public static void main(String[] args) {

    }

    // two pointer
    public int[] solution(int[] nums) {
        int[] result = new int[nums.length];
        // nums 有序的
       int right = nums.length - 1; int left = 0;


        for (int position = nums.length - 1; position > 0 ; position++) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])){
                result[position] = nums[left] * nums[left];
                left++;
            } else {
                result[position] =nums[right] * nums[right];
                right--;
            }
        }


//       int position = nums.length - 1;
   /*    while (left <= right) {
           if (Math.abs(nums[left]) > Math.abs(nums[right])) {
               result[position] = nums[left] * nums[left];
               left ++;
           } else {
               result[position] = nums[right] * nums[right];
               right--;
           }
           position--;
       }*/
        return result;
    }
}
