/*  Second Largest.
Given an array Arr of size N, print second largest element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.

Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arri ≤ 105      */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class SecondLargestElement
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) 
        {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int firstMax=arr[0];
        int secondMax=-1;
        
        for( int i=0 ; i<n ; i++ )
        {
            if( firstMax<arr[i] )
            {
                secondMax=firstMax;
                firstMax=arr[i];
            }
            
            if( firstMax>arr[i] && secondMax<arr[i])
            secondMax=arr[i];
            
        }
        return secondMax;
    }
}