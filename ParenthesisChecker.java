//gfg

/*  Parenthesis Checker
EasyAccuracy: 28.56%Submissions: 469K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balanced pairs, with 0 number of 
unbalanced bracket.

Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.

Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.
Your Task:
This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.

Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 32000
*/

 
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class ParenthesisChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>st=new Stack<>();   //creat a stack of character type
        
        for( int i=0 ; i<x.length() ; i++ )
        {
            char ch=x.charAt(i);    //extract every character from the string
            
            if( ch=='[' || ch=='{' || ch=='(' )
            {
                //opening braces push to the stack
                st.push( ch);
            }
            else if( !st.isEmpty() && ((ch==']' && st.peek()=='[') || (ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') ) )
            {
                //when closing braces appear check the top of the stack if match then pop othewise return false
                st.pop();
            }
            else
            {
                return false;
            }
        }
        
        //after completion of loop  any braces present in the stack it means not balanced
        if( !st.isEmpty())
            return false;
            
        return true;
    }
}

