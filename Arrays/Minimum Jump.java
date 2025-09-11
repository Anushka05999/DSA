/*
Minimum Jumps
Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3 
Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
Input: arr = [1, 4, 3, 2, 6, 7]
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = [0, 10, 20]
Output: -1
Explanation: We cannot go anywhere from the 1st element.*/
class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        
        // If already at end or array size is 1
        if (n <= 1) return 0;
        
        // If first element is 0, cannot move anywhere
        if (arr[0] == 0) return -1;
        
        int maxReach = arr[0]; // max index we can reach
        int steps = arr[0];    // steps left in current jump
        int jumps = 1;         // we make at least one jump (from 0)

        for (int i = 1; i < n; i++) {
            // If we reached the end
            if (i == n - 1) return jumps;

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step
            steps--;

            // If no more steps left
            if (steps == 0) {
                jumps++; // must jump

                // If current index >= maxReach, we cannot move further
                if (i >= maxReach) return -1;

                // Re-initialize steps for the new jump
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
