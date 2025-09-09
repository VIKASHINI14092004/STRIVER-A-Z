/*
QUESTION
MAX N0 OF CONSECUTIVE ONE'S
Given a binary array nums, return the maximum number of consecutive 1s in the array.

Example 1
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The longest run of 1s has length 3.

Example 2
Input: nums = [0,0,0,0]
Output: 0

SOLUTION
  */

class Solution {
      public int findMaxConsecutiveOnes(int[] nums) {
      int n=nums.length;
      int count=0;
      int maxCount=0;
      for(int i=0;i<n;i++){
          if(nums[i]==1){ 
            count++;
            maxCount=Math.max(count,maxCount);
          }
          else{
            count=0;
          }
        }
        return maxCount;
    }
}
