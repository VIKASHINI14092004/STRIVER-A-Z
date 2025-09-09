/*
QUESTION:-
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

APPROACH:-
-> Calculate the optimum sum i.e. sum when all elements were present
-> Calculate the actual array's sum
-> Return the optimum sum - actual sum
*/

// CODE:-
/*
QUESTION:-
Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.
*/
//APPROACH 1
class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int actualSum=0;
       int totalSum=0;
       for(int i=0;i<n;i++){
           actualSum+=nums[i];
         }
       for(int i=1;i<=n;i++){ // can also use n(n+1) / 2 formula
           totalSum+=i;
       }
      return totalSum-actualSum; 
    }
}
// Time Complexity: O(n) – Two loops over the array
// Space Complexity: O(1) – No extra space used

//APPROACH 2
class Solution{
  public int missingNumber(int[]nums){
    int n=nums.length;
    Map<Integer,Integer>freqMap=new HashMap<>();
    for(int i=0;i<=n;i++)
      {
        freqMap.put(i,0);
      }
    for(int i=0;i<n;i++)
      {
        freqMap.put(nums[i],freqMap.get(nums[i]+1));
      }
    for(int key:freqMap.keySet())
      {
        if(get(key)==0))
          return key;
      }
    return -1;
  }
}
// Time Complexity: O(n) 
// Space Complexity: O(n) 

//APPROACH 3
class Solution{
  public int missingNumber(int[]nums){
    int n=nums.length;
    Set<Integer> Set1=new HashSet<>();
    for(int num:nums)
      {
        Set1.add(num);
      }
    for(int i=0;i<=n;i++)
      {
        if(!Set1.contains(i))
          return i;
      }
    return -1;
  }
}
// Time Complexity: O(n) 
// Space Complexity: O(1) 
