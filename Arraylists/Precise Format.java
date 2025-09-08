/*
Link-https://www.geeksforgeeks.org/problems/precise-fomat-java/1
Precise Format 
  Input: a = 5.43, b = 2.653
Output: [2.0467393, 2.047]
Explanation: a/b and decimal precision of a/b up to 3 places after the decimal point are given.
  Input: a = 3.25, b = 2.5
Output: [1.3, 1.300]
Explanation: a/b and decimal precision of a/b up to 3 places after the decimal point are given.
  Input: a = 10.0, b = 4.0
Output: [2.5, 2.500]
Explanation: Division of a by b gives the exact result 2.5 and the formatted result 2.500.*/
class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> resultList = new ArrayList<>();
        float result = a / b;

        // Round to 3 decimal places
        float rounded = Math.round(result * 1000.0f) / 1000.0f;

        // Return both values
        resultList.add(result);
        resultList.add(rounded);

        return resultList;
    }
}
