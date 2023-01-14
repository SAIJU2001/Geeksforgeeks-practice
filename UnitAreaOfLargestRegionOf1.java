/*      Unit Area of largest region of 1's
Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
 
Example 1:

Input: grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
Output: 5
Explanation: The grid is-
1 1 1 0
0 0 1 0
0 0 0 1
The largest region of 1's is colored
in orange.

Example 2:

Input: grid = {{0,1}}
Output: 1
Explanation: The grid is-
0 1
The largest region of 1's is colored in 
orange.

Your Task:
You don't need to read or print anyhting. Your task is to complete the function findMaxArea() which takes grid as input parameter and returns the area of the largest region of 1's.

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)
 
Constraints:
1 ≤ n, m ≤ 500          */


//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class UnitAreaOfLargestRegionOf1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                {
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code hereint row=grid.length;
        int row=grid.length;
        int col=grid[0].length;
        int maxArea=0;
        
        for( int i=0 ; i<row ; i++ )
            for( int j=0 ; j<col ; j++ )
                if( grid[i][j]==1 )
                    maxArea=Math.max( maxArea, dfs( grid, i, j, row, col ));
    
        return maxArea;
    }
    public int dfs( int grid[][], int x, int y, int row, int col )
    {   
        if( x<0 || x>=row || y<0 || y>=col || grid[x][y]<1 )
            return 0;
            
        //mark current cell is visted
        grid[x][y]=0;
        
        //recursive call for 8 co-ordinates
        return 1+dfs( grid, x-1, y, row, col )+dfs( grid, x+1, y, row, col )+
        dfs( grid, x, y+1, row, col )+dfs( grid, x, y-1, row, col )+
        dfs( grid, x-1, y-1, row, col )+dfs( grid, x-1, y+1, row, col )+
        dfs( grid, x+1, y-1, row, col )+dfs( grid, x+1, y+1, row, col ); 
    }
}