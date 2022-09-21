/*  Longest increasing subarray
Given an array containing n numbers. The problem is to find the length of the longest contiguous subarray such that every element in the subarray is strictly greater than its previous element in the same subarray.

Example 1:

Input:
n = 9
a[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}
Output:
5
 
Example 2:

Input:
n = 10
a[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}
Output:
4
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function lenOfLongIncSubArr() which takes the array a[] and its size n as inputs and returns the length of the longest increasing subarray.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<=n<=105
1<=a[i]<=105            */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestIncreasingSubarray 
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.lenOfLongIncSubArr(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public long lenOfLongIncSubArr(long arr[], long n)
    {
        long maxCount=0;
        long count=0;
        
        for( int i=0 ; i<n-1 ; i++ )
        {
            if( arr[i]<arr[i+1] )
            {
                count++;
            }
            else
            {
                if( maxCount<count )
                    maxCount=count;
                count=0;
            }
        }
        
        if( maxCount<count )
            maxCount=count;
            
        return maxCount+1;
    }
}
