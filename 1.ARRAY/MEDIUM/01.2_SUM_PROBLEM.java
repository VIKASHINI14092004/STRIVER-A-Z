/*
QUESITON:-
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

SOLUTION
*/
//APPROACH 1
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
            {
                arr[i][0]=nums[i];
                arr[i][1]=i;
            }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int start=0;
        int end=nums.length-1;
        int sum=0;
        while(start<end)
            {
                sum=arr[start][0]+arr[end][0];
                if(sum==target)
                {
                    return new int[]{arr[start][1],arr[end][1]};
                }
                else if(sum>target)
                {
                    end-=1;
                }
                else
                {
                    start+=1;
                }
            }  
        return new int[]{-1,-1};
    }
}
// TIME COMPLEXITY = O(n log n)
// SPACE COMPLEXITY = O(N)

//APPROACH 2
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                int compare=target-nums[i];
                if(map.containsKey(compare))
                   {
                    return new int[]{map.get(compare),i};
                    }
                map.put(nums[i],i);
            }
        return new int[]{-1,-1};
        
    }
}
// TIME COMPLEXITY = O(N)
// SPACE COMPLEXITY = O(N)


