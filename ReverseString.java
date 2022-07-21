/* Reverse a String
You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG

Example 2:

Input:
s = for
Output: rof
Your Task:

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |s| <= 10000   */

import java.util.*;

public class ReverseString
{
    public static String reverseWord(String str)
    {
        String rev = "";
        int n = str.length();
        
        for( int i=n-1 ; i>=0; i--)
        {
           rev =rev+str.charAt(i);

        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = Sc.next();
        System.out.println();
        String s =reverseWord( str );
        System.out.print(s);
    }
}