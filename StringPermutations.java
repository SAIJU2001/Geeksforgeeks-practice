//gfg

/*  String Permutations
EasyAccuracy: 48.33%Submissions: 19K+Points: 2
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given a string S. The task is to find all permutations (need not be different) of a given string.

Example 1:

Input:
S = AAA
Output: AAA AAA AAA AAA AAA AAA
Explanation: There are total 6 permutations, as given in the output.

Example 2:

Input:
S = ABSG
Output: ABGS ABSG AGBS AGSB ASBG ASGB
BAGS BASG BGAS BGSA BSAG BSGA GABS
GASB GBAS GBSA GSAB GSBA SABG SAGB
SBAG SBGA SGAB SGBA
Explanation: There are total 24 permutations, as given in the output.

Your Task:
This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

Constraints:
1 ≤ size of string ≤ 5

Expected Time Complexity: O(N * N!), N = length of string.
Expected Auxiliary Space: O(1)
*/

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;

class StringPermutations 
{
	public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}	
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String>al=new ArrayList<>();  //all combination are added to the list
        recursion( S, al, "" );     //call a method which gives the combination
        Collections.sort(al);                   //sort the list
        
        return al;
    }
    public void recursion( String S, ArrayList<String>al, String combination )
    {
        if( S.length()==0 )
        {
            //if string is empty return empty list
            al.add( combination );
            return;
        }
        
        for( int i=0 ; i<S.length() ; i++ )
        {
            char ch=S.charAt(i);    //extract the character for every place in combination
            String newS=S.substring(0,i)+S.substring(i+1);  //after extracting for the place remove that caharcter
            recursion( newS, al, combination+ch );  //call for the next place
        }
    }
}
