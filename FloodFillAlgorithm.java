/*          Flood fill Algorithm
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image.

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

Example 1:

Input: image = {{1,1,1},{1,1,0},{1,0,1}},
sr = 1, sc = 1, newColor = 2.
Output: {{2,2,2},{2,2,0},{2,0,1}}
Explanation: From the center of the image 
(with position (sr, sc) = (1, 1)), all 
pixels connected by a path of the same color
as the starting pixel are colored with the new 
color.Note the bottom corner is not colored 2, 
because it is not 4-directionally connected to 
the starting pixel.
 
Your Task:
You don't need to read or print anyhting. Your task is to complete the function floodFill() which takes image, sr, sc and newColor as input paramater and returns the image after flood filling.
 
Expected Time Compelxity: O(n*m)
Expected Space Complexity: O(n*m)
 
Constraints:
1 <= n <= m <= 100
0 <= pixel values <= 10
0 <= sr <= (n-1)
0 <= sc <= (m-1)            */


//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class  FloodFillAlgorithm
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++)
            {
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public void dfs( int row, int col, int ans[][], int image[][], int delRow[], 
    int delCol[], int iniColor, int newColor )
    {
        ans[row][col]=newColor;
        int n=image.length;
        int m=image[0].length;

        for( int i=0 ; i<4 ; i++ )
        {   
            int nRow=row+delRow[i];
            int nCol=col+delCol[i];
        
            if( nRow>=0 && nCol>=0 && nRow<n && nCol<m && image[nRow][nCol]==iniColor
            && ans[nRow][nCol]!=newColor )
                dfs( nRow, nCol, ans, image, delRow, delCol, iniColor, newColor );
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int iniColor=image[sr][sc];
        int ans[][]=image;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
         dfs( sr, sc, ans, image, delRow, delCol, iniColor, newColor );
         
         return ans;
    }
}