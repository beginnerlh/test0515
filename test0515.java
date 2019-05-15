/*一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

示例 1:

输入:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
输出: 2
解释:
3x3 网格的正中间有一个障碍物。
从左上角到右下角一共有 2 条不同的路径：
1. 向右 -> 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右 -> 向右
*/
package lianxi0515;

public class test0515 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] a = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(s.uniquePathsWithObstacles(a));

    }
}

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[] dp = new int[grid[0].length];
        dp[0]=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dp[j]=0;
                    continue;
                }
                if(j>0)
                    dp[j]+=dp[j-1];
            }
        }
        return dp[dp.length-1];
    }
}