//gfg

/*  Reverse each word in a given string
MediumAccuracy: 53.96%Submissions: 37K+Points: 4
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given a String. Reverse each word in it where the words are separated by dots.

Example 1:

Input:
S = "i.like.this.program.very.much"
Output: 
i.ekil.siht.margorp.yrev.hcum
Explanation: 
The words are reversed as
follows:"i" -> "i","like"->"ekil",
"this"->"siht","program" -> "margorp",
"very" -> "yrev","much" -> "hcum".

Example 2:

Input: 
S = "pqr.mno"
Output: 
rqp.onm
Explanation: 
The words are reversed as
follows:"pqr" -> "rqp" ,
"mno" -> "onm"

Your Task:
You don't need to read input or print anything. Your task is to complete the functionreverseWords()which takes the string S as input and returns the resultant string by reversing all the words separated by dots.

Expected Time Complexity:O(|S|).
Expected Auxiliary Space:O(|S|).

Constraints:
1<=|S|<=105
*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class ReverseEachWordInGivenString
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{  
    String reverseWords(String S)
    {
        // your code here
        StringBuilder sb=new StringBuilder();       //using stringbuilder to optimize string concatenation
        Stack<Character>st=new Stack<>();           //stack reverse the string
        for( int i=0 ; i<S.length() ; i++ )
        {
            char ch=S.charAt(i);
            if( ch=='.')
            {
                //whenever dot appear means a word is complete and reverse the word 
                while( !st.isEmpty() )
                {
                    sb.append( st.pop() );
                }
                sb.append( ch);
            }
            else
            {
                //push every character to the stack
                st.push( ch);
            }
        }
        
        while( !st.isEmpty() )
        {
            //after all operation if any caharacter exists in the stack those are added to the string in reverse ,manner
            sb.append( st.pop() );
        }
            
        return sb.toString();
    }
}