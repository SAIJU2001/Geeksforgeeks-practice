/* Palindrome String
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
 

Your Task:
You don't need to read input or print anything. Complete the function isPlaindrome()which accepts string S and returns an integervalue 1 or 0.


Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)


Constraints:
1 <= Length of S<= 105  */

import java.util.*;

public class PalindromeString
{
    public static int isPalindrome(String S) 
    {
        String rev="";
        int n = S.length()-1;
        for( int i=n ; i>=0 ; i-- )
        {
            rev=rev+S.charAt(i);
        }
        if(S.equals(rev))
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String S = Sc.next();
        System.out.println();
        if(isPalindrome( S )==1)
        System.out.print("The string is a palindrome string.");
        else
        System.out.print("The string is not a palindrome string.");
    }
}