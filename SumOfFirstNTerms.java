//gfg

/*      Sum of first n terms
BasicAccuracy: 23.17%Submissions: 53K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.

Example 1:

Input:
N=5
Output:
225
Explanation:
13+23+33+43+53=225

Example 2:

Input:
N=7
Output:
784
Explanation:
13+23+33+43+53+63+73=784

Your Task:
You don't need to read input or print anything.Your task is to complete the function sumOfSeries() which takes the integer N as parameter and returns the sum of the cubes of the first N natural numbers.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)

Constraints:
1<=N<=50000
*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class SumOfFirstNTerms
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution 
{
    long sumOfSeries(long N) 
    {
        // code here
        long val=(N*(N+1))/2;   //formula applied from the mathematics
        long result=(val*val);
        return result;
    }
}