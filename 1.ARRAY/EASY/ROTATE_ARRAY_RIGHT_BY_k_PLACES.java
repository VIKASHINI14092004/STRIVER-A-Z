/*
QUESTION:-

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

APPROACH:-
To rotate the array k places to right follow below steps
-> Reverse first n-k elements
-> Reverse last k elements
-> Reverse the entire array

To rotate the array k places to left follow below steps
-> Reverse first k elements
-> Reverse last n-k elements
-> Reverse the entire array
*/

// CODE:-
class Solution {
    public void rotate(int[] nums, int k) {
            int n=nums.length;
            k=k%n;
            int result[]=new int[n];
            int j=0;
            for(int i=n-k;i<n;i++)
              {
                result[j]=nums[i];
                j++;
              }
            for(int i=0;i<n-k;i++)
              {
                result[j]=nums[i];
                j++;
              }
            for(int i=0;i<n;i++)
              {
                nums[i]=result[i];
              }
    }
}


// TIME COMPLEXITY = O(N)
// SPACE COMPLEXITY = O(N)
