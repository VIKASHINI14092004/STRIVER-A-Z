/*
QUESTION:-
Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

Example 1:
Input:
n = 5, arr1[] = {1, 2, 3, 4, 5}
m = 3, arr2 [] = {1, 2, 3}
Output: 1 2 3 4 5
Explanation: Distinct elements including
both the arrays are: 1 2 3 4 5.

Example 2:
Input:
n = 5, arr1[] = {2, 2, 3, 4, 5}
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 1 2 3 4 5
Explanation: Distinct elements including
both the arrays are: 1 2 3 4 5.
 
APPROACH:-
-> Take two pointer i and j where i is for arr1 and j is for arr2 and traverse
-> While travsersing 3 cases arises
    -> arr1[ i ] == arr2[ j ]
        Here we found a common element, so insert only one element in the union.
        Let’s insert arr[i] in union and whenever we insert element we increment pointer while pointer is not equal to the inserted element
    -> arr1[i]<arr2[j]
        Here insert arr[i]
    -> arr1[i]>arr2[j]
        Here insert arr2[j]
-> Now check if elements of any array is left to traverse then traverse that array
*/

// CODE:-
class Solution {
public List<Integer> unionOfTwoArrays(int arr1[], int arr2[]){
  int n=arr1.length;
  int m=arr2.length;
  List<Integer> union= new ArrayList<>();
  int i=0;
  int j=0;
  while(i<n &&j<m){
      if(i>0 && arr1[i]==arr1[i-1]){
        i++;
        continue;
      }
       if(j>0 && arr2[j]==arr2[j-1]){
        j++;
        continue;
      }
      if(arr1[i]<arr2[j]){
        union.add(arr1[i]);
        i++;
      }
      else if(arr2[j]<arr1[i]){
        union.add(arr2[j]);
        j++;
      }
      else{
        union.add(arr1[i]);
        i++;
        j++;
      }
    }
  while(i<n){
      if(i==0 || arr1[i]!=arr1[i-1] ){
        union.add(arr1[i]);   
      }
      i++;
    }
  while(j<m){
      if(j==0 || arr2[j]!=arr2[j-1] ){
        union.add(arr2[j]); 
      }
      j++;
    }
  return union;
  }
}
