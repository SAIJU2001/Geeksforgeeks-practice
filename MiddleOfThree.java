//gfg

/*      Middle of Three
BasicAccuracy: 54.8%Submissions: 71K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).

Example 1:

Input:
A = 978, B = 518, C = 300
Output:
518
Explanation:
Since 518>300 and 518<978, so 
518 is the middle element.

Example 2:

Input:
A = 162, B = 934, C = 200
Output:
200
Exaplanation:
Since 200>162 && 200<934,
So, 200 is the middle element.

Your Task:
You don't need to read input or print anything.Your task is to complete the function middle() which takes three integers A,B and C as input parameters and returns the number which has middle value.

Expected Time Complexity:O(1)
Expected Auxillary Space:O(1)

Constraints:
1<=A,B,C<=109
A,B,C are distinct. 
*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class MiddleOfThree 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    int middle(int A, int B, int C)
    {
        //code here

        //basic comparison and find the result
        if( (A>B && B>C) || (C>B && B>A) )
        {
            return B;
        }
            
        if( (B>A && A>C) || ((C>A && A>B)) ) 
        {    
            return A;
        }
            
        if( (A>C && C>B) || (B>C && C>A) )
        {
            return C;
        }
        return -1;
    }
}