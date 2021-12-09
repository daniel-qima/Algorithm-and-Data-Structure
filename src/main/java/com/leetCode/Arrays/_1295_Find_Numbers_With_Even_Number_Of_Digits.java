package com.leetCode.Arrays;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 * @date
 */
public class _1295_Find_Numbers_With_Even_Number_Of_Digits {

    public static void main(String[] args) {
        int[] numbers = {12,345,2,6,7896};
        System.out.printf("result: " + solution(numbers));

    }
    // 22:10 @time
    public static int solution(int[] nums) {
        //1. variable to store the number of even digits
        //2. how to know the even digits divide 10
        int result =0;
        for(int i=0; i<nums.length; i++) {
            if ((int)(Math.log10(nums[i]) +1 ) % 2 == 0)  // 这里为什么要 + 1 因为至少会有一位数
               result += 1;
        }
        return result;
    }


    public int findNumbers(int[] nums) {
        int evenNum = 0;

        for(int i=0; i<nums.length; i++) {
            if((String.valueOf(nums[i]).length())%2 == 0) {
                evenNum += 1;
            }
        }
        return evenNum;
    }

}
