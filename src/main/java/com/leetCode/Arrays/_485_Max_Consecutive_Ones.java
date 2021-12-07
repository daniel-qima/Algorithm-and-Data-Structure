package com.leetCode.Arrays;

/**
 *
 * https://leetcode.com/problems/max-consecutive-ones/
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
public class _485_Max_Consecutive_Ones {

    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1,1};
        int[] nums2 = {1};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int maxNumber = 0;
        int startCount = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i] == 1) {
                startCount +=1;
            } else {
                startCount = 0;
            }

            maxNumber = Math.max(startCount, maxNumber);
//            if (startCount > maxNumber) maxNumber = startCount;
          /*  if (nums[i-1] == 0) {
                startCount = 1;
                continue;
            }
            if (nums[i-1] == nums[i]) {
                startCount += 1;
            }
            if (startCount > 1 && startCount > maxNumber) {
                maxNumber = startCount;
            }*/
        }
        return maxNumber;
    }


    public int findMaxConsecutiveOnes(int[] nums) {
        //first have two int to storing the value
        int currentLength = 0;
        int maxConsecutiveOneLength = 0;
        for(int i=0; i<nums.length; i++) {
            //
            if(nums[i] == 1) {
                currentLength += 1; // if have 1, then add to currentLenght
                maxConsecutiveOneLength = Math.max(currentLength, maxConsecutiveOneLength);
            } else {
                currentLength = 0;
            }

        }
        return maxConsecutiveOneLength;
    }
}
