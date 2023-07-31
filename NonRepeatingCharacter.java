//gfg

/*      Non Repeating Character
EasyAccuracy: 40.43%Submissions: 149K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.

Example 2:

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating. 
Your Task:
You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= N <= 105
*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class NonRepeatingCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here

        //(char,count)
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for( int i=0 ; i<S.length() ; i++ )
        {
            char ch=S.charAt(i);
            //use default count value 0 and a char is appear increase the counter
            map.put(ch, map.getOrDefault( ch, 0)+1 );
        }
        
        //check which char's count value is 1
        for( char key : map.keySet() )
        {
            if( map.get( key )==1 )
                return key;
        }
        return '$';
    }
}

