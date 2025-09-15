/*
link-https://www.geeksforgeeks.org/problems/summed-matrix5834/1?page=1&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions
Input: n = 4, q = 7
Output: 2
Explanation: Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7
5 6 7 8
The count of 7 is 2.
Input: n = 5, q = 4
Output: 3
Explanation: Matrix becomes
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
6 7 8 9 10 
The count of 4 is 3.*/
// User function Template for Java

class Solution {
    static long sumMatrix(long n, long q) {
        long s = q - 2;

        // if q is outside valid range
        if (q < 2 || q > 2 * n) return 0;

        long low = Math.max(0, s - (n - 1));
        long high = Math.min(s, n - 1);

        return high - low + 1;
    }
}
