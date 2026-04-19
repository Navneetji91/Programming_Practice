/*
 * @lc app=leetcode id=1855 lang=java
 *
 * [1855] Maximum Distance Between a Pair of Values
 */

// 
class MaximumDistanceBetweenAPairOfValues {
    public int maxDist(int[] nums1, int[] nums2) {
        int i = 0, j = 0, res = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                i++;
            } else {
                res = Math.max(res, j - i);
                j++;
            }
        }
        return res;
    }
}


// @lc code=end

