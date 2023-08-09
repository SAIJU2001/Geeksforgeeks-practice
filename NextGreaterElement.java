//gfg

/*      Next Greater Element
MediumAccuracy: 56.97%Submissions: 21K+Points: 4
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given an array arr[ ] of size n having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.
Next greater element of an element in the array is the nearest element on the right which is greater than the current element.
If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Example 1:

Input: 
n = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
Explanation:
In the array, the next larger element 
to 1 is 3, 3 is 4, 2 is 4 and for 4? 
since it doesn't exist, it is -1.

Example 2:

Input: 
n = 5, arr[] = [6 8 0 1 3]
Output:
8 -1 1 3 -1
Explanation:
In the array, the next larger element to 
6 is 8, for 8 there is no larger elements 
hence it is -1, for 0 it is 1, for 1 it 
is 3 and then for 3 there is no larger 
element on right and hence -1.

Your Task:
This is a function problem. You only need to complete the function nextLargerElement() that takes list of integers arr[ ] and n as input parameters and returns list of integers of length N denoting the next greater elements for all the corresponding elements in the input array.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

Constraints:
1 ≤ n ≤ 106
0 ≤ arri ≤ 1018
*/

//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NextGreaterElement 
{    
	public static void main (String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
        {
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        ot.print(res[i] + " ");

		    ot.println();
		}
        ot.close();
	}
}
// } Driver Code Ends


// User Function Template for JAVA
class Solution
{
    public static long[] nextLargerElement(long[] arr, int n) 
    { 
        // Your code here
        Stack<Long>st=new Stack<>();       //stack is used to store the greater
        long nlr[]=new long[n];         //array to store the next greater element
        for( int i=n-1 ; i>=0 ; i-- )
        {
            while( !st.isEmpty() && st.peek()<=arr[i] )
            {
                //while stack peek value is less than array element then pop from the stack
                st.pop();
            }
            if( st.isEmpty() )
            {
                //after poping the elements check stack is empty or not
                //if empty put -1
                nlr[i]=-1;
            }
            else
            {
                //if not empty put the stack top value
                nlr[i]=st.peek();
            }
            st.push( arr[i] );      //every element push in the stack
        }
        return nlr;
    } 
}

