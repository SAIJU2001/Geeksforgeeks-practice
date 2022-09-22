/*  Find the smallest and second smallest element in an array
Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.

Example 1:
Input :
5
2 4 3 5 6
Output :
2 3 
Explanation: 
2 and 3 are respectively the smallest 
and second smallest elements in the array.

Example 2:
Input :
6
1 2 1 3 6 7
Output :
1 2 
Explanation: 
1 and 2 are respectively the smallest 
and second smallest elements in the array.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function minAnd2ndMin() which takes the array A[] and its size N as inputs and returns a vector containing the smallest and second smallest element if possible, else return {-1,-1}.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=105
1<=A[i]<=105            */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class SmallestAnd2NDSmallestElement 
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
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}
// } Driver Code Ends

//User function Template for Java
class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long arr[]=new long[2];
        long firstSmallest=-1;
        long secondSmallest=-1;
        
        Arrays.sort(a);
        
        for( int i=1 ; i<n ; i++ )
        {
            if( a[0]!=a[i] )
            {
                secondSmallest=a[i];
                break;
            }
        }
        if( secondSmallest==-1 )
            firstSmallest=-1;
        else
            firstSmallest=a[0];
            
        arr[0]=firstSmallest;
        arr[1]=secondSmallest;
        
        return arr;
    }
}
