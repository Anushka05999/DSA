/*
Min and Max in Array
  Input: arr[] = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
  Input: arr[] = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
  Input: arr[] = [56789]
Output: 56789 56789
Explanation: Since the array contains only one element so both min & max are same.*/
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        if(arr.length==1){
            return new Pair<>(arr[0], arr[0]);
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return new Pair<>(min,max);
    }
}
