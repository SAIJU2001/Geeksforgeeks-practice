/*          Rotten Oranges
Save Today, Earn More Tomorrow. Get 25% off on Complete Interview Preparation  

Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges

We have to determine what is the minimum time required to rot all oranges. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. 
 
Example 1:
Input: grid = {{0,1,2},{0,1,2},{2,1,1}}
Output: 1
Explanation: The grid is-
0 1 2
0 1 2
2 1 1
Oranges at positions (0,2), (1,2), (2,0)
will rot oranges at (0,1), (1,1), (2,2) and 
(2,1) in unit time.

Example 2:
Input: grid = {{2,2,0,1}}
Output: -1
Explanation: The grid is-
2 2 0 1
Oranges at (0,0) and (0,1) can't rot orange at
(0,3).
 
Your Task:
You don't need to read or print anything, Your task is to complete the function orangesRotting() which takes grid as input parameter and returns the minimum time to rot all the fresh oranges. If not possible returns -1.
 
Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)
 
Constraints:
1 ≤ n, m ≤ 500      */


//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class  RottenOranges
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
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Pair
{
    int row;
    int col;
    int tm;
    Pair( int _row, int _col , int _tm )
    {
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        int vis[][]=new int[n][m];
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};
        int countFresh=0;
        for( int i=0 ; i<n ; i++ )
            for( int j=0 ; j<m ; j++)
            {
                if( grid[i][j]==2 )
                {
                    q.add( new Pair(i,j,0) );
                    vis[i][j]=2;
                }
                else
                    vis[i][j]=0;
                if( grid[i][j]==1 )
                    countFresh++;
            }
        int cnt=0;
        int tm=0;
        while( !q.isEmpty() )
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max( tm, t);
            q.remove();
            for( int i=0 ; i<4 ; i++ )
            {
                int nrow=r+delRow[i];
                int ncol=c+delCol[i];
                
                if( nrow>=0 && ncol>=0 && ncol<m && nrow<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0 )
                {
                    q.add( new Pair( nrow, ncol, t+1 ));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if( cnt!=countFresh )
            return -1;
            
        return tm;
    }
}