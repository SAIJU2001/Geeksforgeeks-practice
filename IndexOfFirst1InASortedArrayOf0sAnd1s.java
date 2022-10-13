/*      Index of first 1 in a sorted array of 0s and 1s
Given a sorted array consisting 0s and 1s. The task is to find the index of first 1 in the given array.

Example 1:
Input : 
arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
Output : 
6
Explanation:
The index of first 1 in the array is 6.

Example 2:
Input : 
arr[] = {0, 0, 0, 0}
Output : 
-1
Explanation:
1's are not present in the array.
  
Your Task:  
You don't need to read input or print anything. Your task is to complete the function firstIndex() which takes the array A[] and its size N as inputs and returns the index of first 1. If 1 is not present in the array then return -1.

Expected Time Complexity: O(Log (N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
0 ≤ Ai ≤ 1                  */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class IndexOfFirst1InASortedArrayOf0sAnd1s
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
            
            Solution obj = new Solution();
            System.out.println(obj.firstIndex(a, n));           
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int index=-1;
        for( int i=0 ; i<n ; i++ )
        {
            if(arr[i]==1)
            {
                index=i;
                break;    
            }
        }
        return index;        
    }
}