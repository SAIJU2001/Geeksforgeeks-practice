/*              Count of smaller elements
Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.

Example 1:
Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
 
Example 2:
Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function countOfElements() which takes the array A[], its size N and an integer X as inputs and returns the number of elements which are less than or equal to given element.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <= 105
0 <= X <= 105               */


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class CountOfSmallerElements
{
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.countOfElements(a, n, k));    
        }
	}
}
// } Driver Code Ends


//User function Template for Java
class Compute 
{    
    public long countOfElements(long arr[], long n, long x)
    {
        long count=0;
        for( int i=0 ; i<n ; i++ )
            if( arr[i]<=x )
                count++;
                
        return count;
    }
}