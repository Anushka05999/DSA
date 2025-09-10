/*
https://leetcode.com/problems/longest-palindromic-substring/?envType=problem-list-v2&envId=string
longest palindromic substring
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
  
Example 2:
Input: s = "cbbd"
Output: "bb"*/
class Solution {
    public String longestPalindrome(String s) {
         if (s.length() < 2) return s;
        
        int start = 0, maxLen = 1;
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--; r++;
            }
            
            // Even length palindrome
            l = i; r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    start = l;
                    maxLen = r - l + 1;
                }
                l--; r++;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
