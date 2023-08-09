//gfg

/*          Valid Expression
MediumAccuracy: 54.4%Submissions: 16K+Points: 4
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given a string S, composed of different combinations of '(' , ')', '{', '}', '[', ']'. The task is to verify the validity of the arrangement.

An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.

Example 1:

Input:
S = ()[]{}
Output: 1
Explanation: The arrangement is valid.
 
Example 2:

Input:
S = ())({}
Output: 0
Explanation: Arrangement is not valid.

Example 3:

Input:
S = ([)]
Output: 0
Explanation: Arrangement is not valid.
 
Your Task:  
You dont need to read input or print anything. Complete the function valid() which takes S as input and returns a boolean value denoting whether the arrangement is valid or not.

Expected Time Complexity: O(N) where N is the length of S.
Expected Auxiliary Space: O(N) 

Constraints:
1 <= N <= 104
*/

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class ValidExpression
{
    public static void main(String args[]) throws IOException 
    { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character>st=new Stack<>();       //stack data structure is used
        for( int i=0 ; i<s.length() ; i++ )
        {
            char ch=s.charAt(i);
            if( ch=='(' || ch=='{' || ch=='[' )
            {
                //if the present char is opening brace then push to the stack
                st.push(ch);
            }
            else if( !st.isEmpty() && ( ( ch==')' && st.peek()=='(' ) || ( ch=='}' && st.peek()=='{' )|| ( ch==']' && st.peek()=='[' )) )
            {
                //if stack is not empty and present char is closing brace
                //then check the stack top if its right pair then remove the stack top
                st.pop();
            }
            else
            {
                //oterwise returned false
                return false;
            }
        }
        if( !st.isEmpty() )
            return false;
            
        return true;
    }
} 