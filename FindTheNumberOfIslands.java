/*          Find the number of islands
Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water) and '1's(Land). Find the number of islands.

Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

Example 1:

Input:
grid = {{0,1},{1,0},{1,1},{1,0}}
Output:
1
Explanation:
The grid is-
0 1
1 0
1 1
1 0
All lands are connected.

Example 2:

Input:
grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
Output:
2
Expanation:
The grid is-
0 1 1 1 0 0 0
0 0 1 1 0 1 0 
There are two islands :- one is colored in blue 
and other in orange.
Your Task:
You don't need to read or print anything. Your task is to complete the function numIslands() which takes the grid as an input parameter and returns the total number of islands.

Expected Time Complexity: O(n*m)
Expected Space Complexity: O(n*m)

Constraints:
1 ≤ n, m ≤ 500          */


//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class FindTheNumberOfIslands 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) 
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) 
            {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) 
                {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    // Function to find the number of islands.
    public int numIslands(char[][] grid) 
    {
        // Code here
        
        int row=grid.length;
        int col=grid[0].length;
        int countIsland=0;
        
        for( int i=0 ; i<row ; i++ )
            for( int j=0 ; j<col ; j++ )
                if( grid[i][j]=='1' )
                {
                    findIsland( grid,i,j,row,col );
                    countIsland++;
                }
    
        return countIsland;
    }

    public int findIsland( char grid[][], int x, int y, int row, int col )
    {   
        if( x<0 || x>=row || y<0 || y>=col || grid[x][y]<'1' )
            return 0;
            
        //mark current cell is visted
        grid[x][y]='0';
        
        //recursive call for 8 co-ordinates
        return 1+findIsland( grid, x-1, y, row, col )+findIsland( grid, x+1, y, row, col )+
        findIsland( grid, x, y+1, row, col )+findIsland( grid, x, y-1, row, col )+
        findIsland( grid, x-1, y-1, row, col )+findIsland( grid, x-1, y+1, row, col )+
        findIsland( grid, x+1, y-1, row, col )+findIsland( grid, x+1, y+1, row, col ); 
    }
}