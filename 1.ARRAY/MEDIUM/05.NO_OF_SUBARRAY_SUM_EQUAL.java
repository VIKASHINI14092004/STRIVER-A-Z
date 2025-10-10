/*
QUESTION:
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

Example:
Input: nums = [1,1,1], k = 2
Output: 2

CODE:
*/
public int equalSubarraySum(int nums , int k){
  int n=nums.length;
  int sum=0;
  int start=0;
  int end=0;
  int count=0;
  While(end<n)
  {
    sum+=nums[end];
      While(sum>k && start<=end)
       {
        start--;
       }
      if(sum==k)
        {
        count++:
        }
    end++;
  }
  return count++;
}

    
 
  
  
