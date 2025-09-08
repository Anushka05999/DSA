/*
K Sized Subarray Maximum
Input: arr[] = [1, 2, 3, 1, 4], k = 3
Output: [3, 3, 4]
Explanation: 
1st contiguous subarray [1, 2, 3], max = 3
2nd contiguous subarray [2, 3, 1], max = 3
3rd contiguous subarray [3, 1, 4], max = 4
Input: arr[] = [8, 5, 10, 7, 9, 4, 15, 12], k = 4
Output: [10, 10, 10, 15, 15]
Explanation: 
1st contiguous subarray [8, 5, 10, 7], max = 10
2nd contiguous subarray [5, 10, 7, 9], max = 10
3rd contiguous subarray [10, 7, 9, 4], max = 10
4th contiguous subarray [7, 9, 4, 15], max = 15
5th contiguous subarray [9, 4, 15, 12], max = 15
Input: arr[] = [5, 1, 3, 4, 2], k = 1
Output: [5, 1, 3, 4, 2]
Explanation: When k = 1, each element in the array is its own subarray, so the output is simply the same array*/
class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // store indexes

        for (int i = 0; i < arr.length; i++) {
            // Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (not useful)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Add to result once we have a valid window
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}
