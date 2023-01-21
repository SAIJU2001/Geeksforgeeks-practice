/*              Minimum X (xor) A

Given two integers A and B, the task is to find an integer X such that (X XOR A) is minimum possible and the count of set bit in X is equal to the count of set bits in B.

Example 1:
Input: 
A = 3, B = 5
Output: 3
Explanation:
Binary(A) = Binary(3) = 011
Binary(B) = Binary(5) = 101
The XOR will be minimum when x = 3
i.e. (3 XOR 3) = 0 and the number
of set bits in 3 is equal
to the number of set bits in 5.

Example 2:
Input: 
A = 7, B = 12
Output: 6
Explanation:
(7)2= 111
(12)2= 1100
The XOR will be minimum when x = 6 
i.e. (6 XOR 7) = 1 and the number 
of set bits in 6 is equal to the 
number of set bits in 12.

Your task :
You don't need to read input or print anything. Your task is to complete the function minVal() that takes integer A and B as input and returns the value of X according to the question.
 
Expected Time Complexity : O(log MAX(A,B))
Expected Auxiliary Space : O(1)
 
Constraints :
1 <= A, B <= 109                    */
 

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class MinimumXxorA 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) 
        {
            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public static int minVal(int a, int b) 
    {
        // code here
        int c1=countSetBit( a );
        int c2=countSetBit( b );
        
        if( c1==c2 )
            return a;
        else if( c1>c2 )
        {
            //convert 1 to 0
            int diff=c1-c2;
            while( diff-->0 )
                a=a&(a-1);
                
            return a;
        }
        else
        {
            //convert 0 to 1
            int diff=c2-c1;
            while( diff-->0 )
                a=a|(a+1);
                
            return a;
            
        }
    }
    
    public static int countSetBit( int n )
    {
        int count=0;
        while( n>0 )
        {
            count+=n&1;
            n>>=1;
        }
        return count;
    }
}