/*      Sum of distinct elements for a limited range
Given an array, arr[] of N elements such that every element of the array is an integer in the range 1 to n, the task is to find the sum of all the distinct elements of the array.

Example 1:
Input: N = 9
arr[] = {5, 1, 2, 4, 6, 7, 3, 6, 7}
Output: 28
Explanation: The distinct elements in 
the array are 1, 2, 3, 4, 5, 6, 7.

Example 2:
Input: N = 3, arr[] = {1, 1, 1}
Output: 1

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function sumOfDistinct() that takes array arr[]  and integer N as parameters and returns the sum of a distinct elements of the array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106                 */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends


//User function Template for Java
class Solution
{
    long sumOfDistinct(long arr[], int N)
    {
        Arrays.sort(arr);
        long distinctSum=0;
        for( int i=0 ; i<N-1 ; i++ )
        {
            if(arr[i] !=arr[i+1] )
            distinctSum=distinctSum+arr[i];
        }
        return distinctSum+arr[N-1];
    }
}


//{ Driver Code Starts.

// Driver class
class SumOfDistinctElementsForLimitedRange 
{
    // Driver code
    public static void main(String[] args) throws IOException 
    {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) 
        {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(a1[i]);
            }
    //        int k = Integer.parseInt(br.readLine());
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < n; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            //int k = Integer.parseInt(br.readLine());
            Solution ob = new Solution();
            long ans=ob.sumOfDistinct(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends