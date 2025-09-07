/*
Input: arr[] = [1, 2, 4, 5, 7, 8, 3]
Output: 8
Explanation: Elements before 8 are strictly increasing [1, 2, 4, 5, 7] and elements after 8 are strictly decreasing [3].
Input: arr[] = [10, 20, 30, 40, 50]
Output: 50
Explanation: Elements before 50 are strictly increasing [10, 20, 30 40] and there are no elements after 50.
Input: arr[] = [120, 100, 80, 20, 0]
Output: 120
Explanation: There are no elements before 120 and elements after 120 are strictly decreasing [100, 80, 20, 0].*/
// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
        
    }
}
