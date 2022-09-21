/*      Number of occurrence.
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.

Example 2:

Input:
N = 7, X = 4
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 0
Explanation: 4 is not present in the
given array.

Your Task:
You don't need to read input or print anything. Your task is to complete the function count() which takes the array of integers arr, n and x as parameters and returns an integer denoting the answer.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106
1 ≤ X ≤ 106         */

 //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class NumberOfOccurance
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) 
        {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

//User function Template for Java

class Solution 
{
    int count(int[] arr, int n, int x) 
    {
        // code here
        int occurance=0;
        
        for( int i=0 ; i<n ; i++ )
        {
            if( arr[i]==x )
                occurance++;
        }
        return occurance;
    }
}