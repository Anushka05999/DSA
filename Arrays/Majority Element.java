/*
link-https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays&sortBy=submissions
Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.*/
class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;

        // Step 1: Find a candidate
        int candidate = -1, count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }
        return -1;
    }
}
