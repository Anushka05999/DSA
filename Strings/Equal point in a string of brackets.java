/*
Equal point in a string of brackets
Input: str = "(())))("
Output: 4
Explanation: After index 4, string splits into (()) and ))(. Number of opening brackets in the first part is equal to number of closing brackets in the second part.
Input : str = "))"
Output: 2
Explanation: As after 2nd position i.e. )) and "empty" string will be split into these two parts: So, in this number of opening brackets i.e. 0 in the first part is equal to number of closing brackets in the second part i.e. also 0.*/


class Solution {
    public long countSub(String str) {
        int totalClose = 0;
        for (char c : str.toCharArray()) {
            if (c == ')') totalClose++;
        }

        int openCount = 0;
        int closeRemaining = totalClose;

     
        if (openCount == closeRemaining) {
            return 0;
        }

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openCount++;
            } else {
                closeRemaining--;
            }

            // Found a valid split
            if (openCount == closeRemaining) {
                return i + 1; // split AFTER this index
            }
        }

        return -1; // no valid split
    }
    
}
