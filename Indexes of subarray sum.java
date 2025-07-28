/*Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.*/

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
       int s = 0, curr = 0;
        for (int e = 0; e < arr.length; e++) {
            curr += arr[e];
            while (curr > target && s <= e) curr -= arr[s++];
            if (curr == target) 
                return new ArrayList<>(Arrays.asList(s + 1, e + 1)); // 1-based indices
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
}
