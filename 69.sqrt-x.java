/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    // Binary Search approach: Time O(log n), Space O(1)
    public int mySqrt(int x) {
        // Handle base cases: sqrt(0)=0, sqrt(1)=1
        if (x < 2) return x;

        // Initialize search range: sqrt(x) is always <= x/2 for x >= 2
        int left = 1, right = x / 2;

        // Binary search for the square root
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Avoid overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;  // Perfect square found
            } else if (square < x) {
                left = mid + 1;  // Search in right half
            } else {
                right = mid - 1;  // Search in left half
            }
        }

        return right;  // Return floor of square root        
    }
}
// @lc code=end

