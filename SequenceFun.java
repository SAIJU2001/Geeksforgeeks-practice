/*      Sequence Fun
You have a sequence 2,5,16,65,........Given an integer n as input. You have to find the value at the nth position in the sequence.
 
Example 1:
Input: n = 4
Output: 65

Example 2:
Input: n = 10
Output: 9864101
 
Your Task:
You don't need to read or print anything, Your task is to complete the function NthTerm() which takes n as input parameter and returns value at nth position of the given sequence modulo 109 + 7.
 
Expected Time Complexity:  O(n)
Expected Space Complexity: O(1)
 
Constraints:
1 <= n <= 104           */

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class SequenceFun
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.NthTerm(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public int NthTerm(int n)
    {
        // code here
        long a=2,mod=1000000007;
        for( int i=2 ; i<=n ; i++ )
            a=(a*i+1)%mod;
            
        return (int)a;
    }
}