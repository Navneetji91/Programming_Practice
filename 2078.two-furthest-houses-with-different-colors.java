/*
 * @lc app=leetcode id=2078 lang=java
 *
 * [2078] Two Furthest Houses With Different Colors
 */

// @lc code=start
class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(colors[i]!=colors[j]){
                    res=Math.max(res,j-i);
                    break;
                }
            }
        }
        return res;
    }
}
// @lc code=end

