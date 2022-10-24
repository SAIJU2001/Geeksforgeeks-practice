/*      Shuffle integers.
Given an array arr[] of n elements in the following format {a1, a2, a3, a4, .., an/2, b1, b2, b3, b4, ., bn/2}, the task is shuffle the array to {a1, b1, a2, b2, a3, b3, , an/2, bn/2} without using extra space.

Example 1:

Input: n = 4, arr[] = {1, 2, 9, 15}
Output:  1 9 2 15
Explanation: a1=1 , a2=2 , b1=9 , b2=15
So the final array will be :  
a1, b1, a2, b2 = { 1, 9, 2, 15 }

Example 2:
Input: n = 6
arr[] = {1, 2, 3, 4, 5, 6}
Output: 1 4 2 5 3 6

Your Task:
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function shuffleArray() that takes array arr[], and an integer n as parameters and modifies the given array according to the above-given pattern.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 ≤ n ≤ 105
-105≤ arri ≤ 105                */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        long a[]=new long[n];
        int i=0,j=n/2 ;
        
        for( int k=0 ; k<n ; k++ )
        {
            if(k==0)
                a[k]=arr[i++];
            else if( k%2==0 )
                a[k]=arr[i++];
            else
                a[k]=arr[j++];
        }
        
        for( int k=0 ; k<n ; k++ )
            arr[k]=a[k];
    }
}


//{ Driver Code Starts.

// Driver class
class ShuffleIntegers 
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
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
             Solution ob = new  Solution();
            //ArrayList<Long> ans=
            ob.shuffleArray(a,n);
           // System.out.println(ob.shuffleArray(a,n));
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends
