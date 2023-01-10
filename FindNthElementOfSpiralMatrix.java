/*          Find nth element of spiral matrix
Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer  k denoting the kth element . The function will return the kth element obtained while traversing the matrix spirally.


Example 1:
Input:
n = 3, m = 3, k = 4
A[][] = {{1 2 3},
         {4 5 6},
         {7 8 9}}
Output:
6
Explanation:
The matrix above will look like 
1 2 3
4 5 6
7 8 9
and the 4th element in spiral fashion
will be 6 .

Your Task:
You only need to implement the given function findK(). Do not read input, instead use the arguments given in the function. Return the K'th element obtained by traversing matrix spirally.

Expected Time Complexity: O(N*M)
Expected Auxiliary Space: O(N*M)

Constraints:
1<=n,m<=20
1<=k<=n*m           */


//{ Driver Code Starts
import java.util.*;

class FindNthElementOfSpiralMatrix
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
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here
	int upper=0,lower=n-1,left=0,right=m-1,direction=0,count=0;
	int total=m*n;
	    while( count<total )
	    {
	           for( int i=left ; i<=right ; i++ )
	           {
	               count++;
	               if( count==k )
	                return A[upper][i];
	            }
	            upper++;

	
	           for( int i=upper ; i<=lower ; i++ )
	           {
	               count++;
	               if( count==k )
	                return A[i][right];
	            }
	            right--;
	   
	           for( int i=right ; i>=left ; i-- )
	           {
	               count++;
	               if( count==k )
	                return A[lower][i];
	            }
	            lower--;
	  
	           for( int i=lower ; i>=upper ; i-- )
	           {
	               count++;
	               if( count==k )
	                return A[i][left];
	            }
	            left++;       
	    }
        return 0;
    }
}