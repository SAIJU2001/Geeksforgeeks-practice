/*          Factorial
Stand out from the crowd. Prepare with Complete Interview Preparation  

Given a positive integer, N. Find the factorial of N.
 
Example 1:
Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120

Example 2:
Input:
N = 4
Output:
24
Explanation:
4*3*2*1 = 24

Your Task:
You don't need to read input or print anything. Your task is to complete the function factorial() which takes an integer N as input parameters and returns an integer, the factorial of N.
 
Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
 
Constraints:
0 <= N <= 18            */

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Factorial
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.factorial(N));
        }
    }
}
// } Driver Code Ends


class Solution
{
    static long factorial(int N)
    {
        // code here
        if( N==1 || N==0 )
            return 1;
        
        return N*factorial( N-1 );
    }
}