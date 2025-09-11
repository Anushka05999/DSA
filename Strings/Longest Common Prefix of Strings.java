/*
Longest Common Prefix of Strings
Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.*/
// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if (arr == null || arr.length == 0) return "";

        // Take the first word as reference
        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            // Compare this char with same index in other words
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    // Mismatch found → return substring till i
                    return first.substring(0, i);
                }
            }
        }
        return first; // If no mismatch, whole first word is prefix
    }
}
