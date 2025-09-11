/*
Minimum times A has to be repeated such that B is a substring of it
Input:
A = "abcd"
B = "cdabcdab"
Output:
3
Explanation:
Repeating A three times (“abcdabcdabcd”),
B is a substring of it. B is not a substring
of A when it is repeated less than 3 times.
Example 2:
Input:
A = "ab"
B = "cab"
Output :
-1
Explanation:
No matter how many times we repeat A, we can't
get a string such that B is a substring of it.*/
// User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // Keep appending A until length >= B
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }

        // Check if B is substring now
        if (sb.indexOf(B) != -1) {
            return count;
        }

        // Try one more repetition (because B may cross boundary)
        sb.append(A);
        count++;
        if (sb.indexOf(B) != -1) {
            return count;
        }

        // If still not found
        return -1;
    }
};
