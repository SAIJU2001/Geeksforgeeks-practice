/*                   Spiral Matrix 
Given a matrix of size N x M. You have to find the Kth element which will obtain while traversing the matrix spirally starting from the top-left corner of the matrix.

Example 1:
Input: 
N = 3, M = 3, K = 4
A[] = {{1, 2, 3}, 
       {4, 5, 6}, 
       {7, 8, 9}}
Output: 
6
Explanation: Spiral traversal of matrix: 
{1, 2, 3, 6, 9, 8, 7, 4, 5}. Fourth element
is 6.

Example 2:
Input: 
N = 2, M = 2, K = 2 
A[] = {{1, 2},
       {3, 4}} 
Output: 
2
Explanation: Spiral traversal of matrix: 
{1, 2, 4, 3}. Second element is 2.

Your Task:  
You don't need to read input or print anything. Complete the function findK() which takes the matrix A[ ][ ], number of rows N, number of columns M, and integer K as input parameters and returns the Kth element in the spiral traversal of the matrix.

Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ K ≤ N*M ≤ 106                  */

//{ Driver Code Starts
import java.util.*;

class SpiralMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int upper=0,lower=n-1,left=0,right=m-1,direction=0,count=0;
	    while( upper<=lower && left<=right )
	    {
	       if( direction==0 )
	       {
	           for( int i=left ; i<=right ; i++ )
	           {
	               count++;
	               if( count==k )
	                return a[upper][i];
	            }
	            upper++;
	       }
	       if( direction==1 )
	       {
	           for( int i=upper ; i<=lower ; i++ )
	           {
	               count++;
	               if( count==k )
	                return a[i][right];
	            }
	            right--;
	       }
	       if( direction==2 )
	       {
	           for( int i=right ; i>=left ; i-- )
	           {
	               count++;
	               if( count==k )
	                return a[lower][i];
	            }
	            lower--;
	       }
	       if( direction==3 )
	       {
	           for( int i=lower ; i>=upper ; i-- )
	           {
	               count++;
	               if( count==k )
	                return a[i][left];
	            }
	            left++;
	       }
	       direction=(direction+1)%4;	            
	    }
	    return 0;
	}	
}