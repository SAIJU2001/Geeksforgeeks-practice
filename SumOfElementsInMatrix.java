/*      Sum of elements in a matrix
Stand out from the crowd. Prepare with Complete Interview Preparation  

Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.

Example 1:
Input:
N=2,M=3
Grid=
[[1,0,1],
[-8,9,-2]]
Output:
1
Explanation:
The sum of all elements of the matrix is 
(1+0+1-8+9-2)=1.

Example 2:
Input:
N=3,M=5
Grid=
[[1,0,1,0,1],
[0,1,0,1,0],
[-1,-1,-1,-1,-1]]
Output:
0
Explanation:
The sum of all elements of the matrix are
(1+0+1+0+1+0+1+0+1+0-1-1-1-1-1)=0.

Your Task:
You don't need to read input or print anything.Your task is to complete the function sumOfMatrix() which takes two integers N ,M and a 2D array Grid as input parameters and returns the sum of all the elements of the Grid.

Expected Time Complexity:O(N*M)
Expected Auxillary Space:O(1)

Constraints:
1<=N,M<=1000
-1000<=Grid[i][j]<=1000         */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class SumOfElementsInMatrix 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            String[] S = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int Grid[][] = new int[N][M];
            for (int i = 0; i < N; i++) 
            {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < M; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.sumOfMatrix(N, M, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    int sumOfMatrix(int N, int M, int[][] Grid) 
    {
        // code here
        int sum=0;
        for( int i=0 ; i<N ; i++ )
            for( int j=0 ; j<M ; j++ )
                sum+=Grid[i][j];
                
        return sum;
    }
}