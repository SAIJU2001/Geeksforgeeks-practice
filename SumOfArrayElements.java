/*      Sum of Array Elements
Given an integer array arr of size n, you need to sum the elements of arr.

Example 1:
Input:
n = 3
arr[] = {3 2 1}
Output: 6

Example 2:
Input:
n = 4
arr[] = {1 2 3 4}
Output: 10

Your Task:
You need to complete the function sumElement() that takes arr and n and returns the sum. The printing is done by the driver code.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 <= n <= 103
1 <= arri <= 104            */

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class  SumOfArrayElements
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            
            int input[] = new int[n];
            for(int i = 0; i < n; i++)
                input[i] = Integer.parseInt(str[i]);
            
            //int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            System.out.println(obj.sumElement(input, n));    
        }
    }
} 
// } Driver Code Ends


//User function Template for Java
class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum=0;
        for( int i=0 ; i<n ; i++ )
            sum+=arr[i];
            
        return sum;
    }
}
