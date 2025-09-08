/*
QUESTION:-
Given an array `arr[]` of size `n` and an integer `target`.  
Your task is to search for `target` in the array using **linear search**.

If the element is found, return its index (0-based indexing).  
If it is not found, return -1.

Example 1:
Input:
n = 5, arr = [1, 2, 3, 4, 5], target = 3  
Output:
2  
Explanation: Element 3 is present at index 2.

Example 2:
Input:
n = 4, arr = [10, 20, 30, 40], target = 25  
Output:
-1  
Explanation: Element 25 is not present in the array.

Solution:
*/


class Solution {
    public int linearSearch(int[] arr, int target) {
        int n=arr.length;
        for(int i=0;i<n;i++)
          {
            if(arr[i]==target)
            {
              return i;
            }
          }
      return -1;
    }
}
