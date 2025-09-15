/*Input: mat[][] = [[1, 1, 1, 1],
                [2, 2, 2, 2],
                [3, 3, 3, 3],
                [4, 4, 4, 4]]
Output: [[1, 2, 3, 4],
       [1, 2, 3, 4],
       [1, 2, 3, 4],
       [1, 2, 3, 4]]
Explanation: Converting rows into columns and columns into rows.
Input: mat[][] =  [[1, 2],
                 [9, -2]]
Output: [[1, 9],
        [2, -2]]
Explanation: Converting rows into columns and columns into rows*/
class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;

        // Create result matrix (cols x rows)
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < cols; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                row.add(mat[j][i]);  // flip indices
            }
            result.add(row);
        }

        return result;
    }
}
