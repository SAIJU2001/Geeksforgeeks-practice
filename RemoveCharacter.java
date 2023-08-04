//gfg

/*  Remove character
BasicAccuracy: 59.6%Submissions: 37K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".

Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
 
Your Task:  
You dont need to read input or print anything. Complete the function removeChars() which takes string1 and string2 as input parameter and returns the result string after removing characters from string2  from string1.

Expected Time Complexity:O( |String1| + |String2| )
Expected Auxiliary Space: O(|String1|)

Constraints:
1 <= |String1| , |String2| <= 50
*/

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class RemoveCharacter 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) 
        {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    static String removeChars(String string1, String string2)
    {
        // code here
        HashSet<Character>set=new HashSet<>();      //set add only unique value
        StringBuilder sb=new StringBuilder();       //for new string
        
        for( int i=0 ; i<string2.length() ; i++ )
        {
            //add the caharacter to the set
            set.add( string2.charAt(i));
        }
        
        for( int i=0 ; i<string1.length() ; i++ )
        {
            char ch=string1.charAt(i);      //extract every character
            
            if( !set.contains( ch))
            {
                //check the value is contain in the set or not if not then add the value to the result string
                sb.append(ch);
            }
        }
        return sb.toString();   //stringbuilder type cast to string
    }
}