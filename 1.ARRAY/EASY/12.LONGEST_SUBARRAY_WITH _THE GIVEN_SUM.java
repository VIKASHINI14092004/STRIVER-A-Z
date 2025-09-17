/*
QUESTION:-
You are given an array 'A' of size 'N' and an integer 'K'. You need to print the length of the longest subarray of array 'A' whose sum = 'K'.
Example:
Input: 'N' = 7 'K' = 3
'A' = [1, 2, 3, 1, 1, 1, 1]
Output: 3
Explanation: Subarrays whose sum = '3' are:
[1, 2], [3], [1, 1, 1], [1, 1, 1]
Here, the length of the longest subarray is 3, which is our final answer.
*/

/*
APPROACH:-
-> Use sliding window approach using two pointers start and end
-> Run a loop to traverse the entire array add from end and subtract from start when sum>k
-> If sum==k then, update the ans now, window size = end-start+1
*/

// CODE:-
class Solution {
    public int longestSubarrayWithSumK(int[] A, int k) {
      int n=A.length;
      int start=0;
      int maxLength=0;
      int sum=0;
      for(int end=0;end<n;end++)
        {
          sum+=A[end];
          while(sum>k && start<=end)
            {
              sum-=A[start];
              start++;
            }
          if(sum==k)
          {
            maxLength=Math.max(maxLength,end-start+1);
          }
        }
      return maxLength;
    }
}
