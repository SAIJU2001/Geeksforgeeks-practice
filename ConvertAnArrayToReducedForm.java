/*          Convert an array to reduced form

Given an array with N distinct elements, convert the given array to a reduced form where all elements are in range from 0 to N-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is placed for second smallest element, and N-1 is placed for the largest element.

Note: You don't have to return anything. You just have to change the given array.

Example 1:
Input:
N = 3
Arr[] = {10, 40, 20}
Output: 0 2 1
Explanation: 10 is the least element so it
is replaced by 0. 40 is the largest
element so it is replaced by 3-1 = 2. And
20 is the 2nd smallest element so it is
replaced by 1.

Example 2:
Input:
N = 5
Arr[] = {5, 10, 40, 30, 20}
Output: 0 1 4 3 2
Explanation: As 5 is smallest element,
it's replaced by 0. Then 10 is 2nd
smallest element, so it's replaced by 1.
Then 20 is 3rd smallest element, so it's
replaced by 2. And so on.

Your Task:
You don't need to read input or print anything. Your task is to complete the function convert() which takes the array of integers arr and n as parameters and makes changes in the given array.

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 106            */


 //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class ConvertAnArrayToReducedForm 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) 
        {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                arr[i] = Integer.parseInt(inputLine[i]);

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) 
                out.print(arr[i] + " ");
            
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    void convert(int[] arr, int n) 
    {
        //Code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int a[]=new int[n];
        
        for( int i=0 ; i<n ; i++ )
            a[i]=arr[i];
            
        Arrays.sort(a);
        for( int i=0 ; i<n ; i++ )
            map.put( a[i],i );
            
        for( int i=0 ; i<n ; i++ )
            arr[i]=map.get( arr[i] );
    }
}