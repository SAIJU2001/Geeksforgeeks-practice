/*          Addition of two square matrices
Stand out from the crowd. Prepare with Complete Interview Preparation  

Given two square matrices matrixA and matrixB of size n x n.  Find the addition of these two matrices.

Note :- You don't have to return anything in this question (Refer YourTask section).
 
Example 1:
Input: matrixA = {{1, 2}, {3, 4}},
matrixB = {{4, 3}, {2, 1}}
Output: {{5, 5}, {5, 5}}

Example 1:
Input: matrixA = {{2, 2}, {2, 2}},
matrixB = {{3, 3}, {3, 3}}
Output: {{5, 5},{5, 5}}
 
Your Task:
You don't need to read or print anything. Your task is to complete the function Addition() which takes matrixA and matrixB as input parameters and adds two matrices. Do the addition without using extra memory. The output matrix must be in matrixA.
 
Expected Time Complexity: O(n2)
Expected Space Complexity: O(1)
 
Constraints:
1 <= n <= 100           */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class AdditionOfTwoSquareMatrices
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrixA = new int[n][n];
            int[][] matrixB = new int[n][n];
            for(int i = 0; i < n; i++)
            {
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixA[i][j] = Integer.parseInt(S[j]);
            }
            for(int i = 0; i < n; i++)
            {
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixB[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.Addition(matrixA, matrixB);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  Addition(int[][] matrixA, int[][] matrixB)
    {
        // code here
        for( int i=0 ; i<matrixA.length ; i++ )
            for( int j=0 ; j<matrixA[0].length ; j++ )
                matrixA[i][j]+=matrixB[i][j];
    }
}