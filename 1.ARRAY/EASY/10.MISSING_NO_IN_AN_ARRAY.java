/*
QUESTION:-
Given an array `nums` containing `n` distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
2 is the missing number in the range since it does not appear in nums.

    // APPROACH 1: SUM FORMULA METHOD
      IDEA:
      - The sum of first 'n' natural numbers is given by: n*(n+1)/2
      - Calculate this expected sum.
      - Subtract the actual array sum from the expected sum to get the missing number.

      Time Complexity: O(n) -> Single loop to calculate sum
      Space Complexity: O(1) -> No extra space used
    */
    class Solution {
    public int missingNumberSum(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

   // APPROACH 2: HASHSET METHOD
   /*
      IDEA:
      - Put all numbers into a HashSet.
      - Iterate from 0 to n and check which number is missing by using 'contains'.

      Time Complexity: O(n) -> Adding elements to HashSet and checking each number
      Space Complexity: O(n) -> HashSet storage
    */
    public int missingNumberSet(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();

        // Add all numbers to set
        for (int num : nums) {
            numSet.add(num);
        }

        // Find missing number
        for (int i = 0; i <= n; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }

        return -1; // This line won't actually be reached
    }

 // APPROACH 3: HASHMAP METHOD
/*
  IDEA:
- Use a HashMap to track the presence of each number.
- First, put all numbers in the range [0, n] into the map with an initial frequency of 0.
- Then, iterate through the given array and update the frequency of each number.
- Finally, the number with frequency 0 will be the missing number.

Time Complexity: O(n) -> Two passes over the data
Space Complexity: O(n) -> HashMap storage
*/

class SolutionHashMap {
    public int missingNumberHashMap(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Step 1: Initialize map with numbers 0 to n and frequency 0
        for (int i = 0; i <= n; i++) {
            freqMap.put(i, 0);
        }

        // Step 2: Update frequencies for numbers present in array
        for (int num : nums) {
            freqMap.put(num, freqMap.get(num) + 1);
        }

        // Step 3: Find the number with frequency 0 (missing number)
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) == 0) {
                return key;
            }
        }
        return -1; // Should never reach here
    }
}
