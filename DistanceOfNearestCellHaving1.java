/*          Distance of nearest cell having 1
MediumAccuracy: 47.7%Submissions: 43K+Points: 4
Lamp
Stand out from the crowd. Prepare with Complete Interview Preparation  

Given a binary grid of n*m. Find the distance of the nearest 1 in the grid for each cell.
The distance is calculated as |i1  - i2| + |j1 - j2|, where i1, j1 are the row number and column number of the current cell, and i2, j2 are the row number and column number of the nearest cell having value 1.
 
Example 1:

Input: grid = {{0,1,1,0},{1,1,0,0},{0,0,1,1}}
Output: {{1,0,0,1},{0,0,1,1},{1,1,0,0}}
Explanation: The grid is-
0 1 1 0 
1 1 0 0 
0 0 1 1 
0's at (0,0), (0,3), (1,2), (1,3), (2,0) and
(2,1) are at a distance of 1 from 1's at (0,1),
(0,2), (0,2), (2,3), (1,0) and (1,1)
respectively.

Example 2:

Input: grid = {{1,0,1},{1,1,0},{1,0,0}}
Output: {{0,1,0},{0,0,1},{0,1,2}}
Explanation: The grid is-
1 0 1
1 1 0
1 0 0
0's at (0,1), (1,2), (2,1) and (2,2) are at a 
distance of 1, 1, 1 and 2 from 1's at (0,0),
(0,2), (2,0) and (1,1) respectively.

Yout Task:
You don't need to read or print anything, Your task is to complete the function nearest() which takes the grid as an input parameter and returns a matrix of the same dimensions where the value at index (i, j) in the resultant matrix signifies the minimum distance of 1 in the matrix from grid[i][j].
 
Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

Constraints:
1 ≤ n, m ≤ 500              */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class DistanceOfNearestCellHaving1
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
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++)
            {
                for(int j = 0; j < ans[i].length; j++)
                {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;

        int vist[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for( int i=0 ; i<n ; i++ )
            for( int j=0 ; j<m ; j++ )
                if( grid[i][j]==1 )
                {
                    q.add( new Node( i,j,0 ) );
                    vist[i][j]=1; 
                }
                else
                    vist[i][j]=0;

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};

        while( !q.isEmpty() )
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            q.remove();
            dist[row][col]=steps;

            for( int i=0 ; i<4 ; i++ )
            {
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if( nrow>=0 && nrow<n && ncol>=0 && ncol<m && vist[nrow][ncol]==0 )
                { 
                    vist[nrow][ncol]=1;
                    q.add(new Node( nrow,ncol,steps+1 ) );
                }
            }
        }
        return dist;
    }
}
class Node
{
    int first;
    int second;
    int third;
    Node( int _first, int _second , int _third )
    {
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}