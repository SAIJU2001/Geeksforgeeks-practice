//gfg

/*  Minimum distance between two numbers
EasyAccuracy: 19.75%Submissions: 160K+Points: 2
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y such that (x!=y).

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.

Example 2:

Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return
-1 as x and y don't exist in the array.

Your Task:
Complete the function minDist() which takes the array, n, x and y as input parameters and returns the minimum distance between x and y in the array. If no such distance is possible then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
0 <= A[i], x, y <= 105
*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class MinimumDistanceBetweenTwoNumbers
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) 
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);

            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution 
{
    int minDist(int a[], int n, int x, int y) 
    {
        // code here
        int xi=-1;  //to store the indexing of two element x and y
        int yi=-1;
        int min=Integer.MAX_VALUE;
        for( int i=0 ; i<n ; i++ )
        {
            //traverse and where the values present taking the index
            if( a[i]==x )
            {
                xi=i;
            }
            else if( a[i]==y )
            {
                yi=i;
            }
            
            if( xi!=-1 && yi!=-1 )
            {
                //find always minimum distance
                min=Math.min( min, Math.abs(xi-yi) );
            }
        }
        
        if( xi==-1 || yi==-1 )
        {
            //if values are not find in the array
            return -1;
        }
        
        return min;
    }
}