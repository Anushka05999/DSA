/*
link-https://www.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1?page=1&category=Arrays,Strings&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions
Input: s = "abaab"
Output: 3
Explanation: All palindromic substrings (of length > 1) are: "aba", "aa", "baab".
Input: s = "aaa"
Output: 3
Explanation: All palindromic substrings (of length > 1) are: "aa", "aa", "aaa".
Input: s = "abbaeae"
Output: 4
Explanation: All palindromic substrings (of length > 1) are: "bb", "abba", "aea", "eae".*/
class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;

        // Check odd and even centers
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > 1) {
                    count++;
                }
                left--;
                right++;
            }
        }
        return count;
        
    }
}
