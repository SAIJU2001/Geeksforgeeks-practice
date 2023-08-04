//gfg

/*      Maximum Rectangular Area in a Histogram
HardAccuracy: 32.12%Submissions: 146K+Points: 8
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars. For simplicity, assume that all bars have the same width and the width is 1 unit, there will be N bars height of each bar will be given by the array arr.

Example 1:

Input:
N = 7
arr[] = {6,2,5,4,5,1,6}
Output: 12
Explanation: In this example the largest area would be 12 of height 4 and width 3. We can achieve this 
area by choosing 3rd, 4th and 5th bars.

Example 2:

Input:
N = 8
arr[] = {7 2 8 9 1 3 6 5}
Output: 16
Explanation: Maximum size of the histogram 
will be 8  and there will be 2 consecutive 
histogram. And hence the area of the 
histogram will be 8x2 = 16.

Your Task:
The task is to complete the function getMaxArea() which takes the array arr[] and its size N as inputs and finds the largest rectangular area possible and returns the answer.

Expected Time Complxity : O(N)
Expected Auxilliary Space : O(N)

Constraints:
1 ≤ N ≤ 106
0 ≤ arr[i] ≤ 1012
*/

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumRectangularAreaInHistogram
{    
	public static void main (String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
        {
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)
                arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long maxArea=0;

        Stack<Integer> st=new Stack<>();        //create stack
        int nsr[]=new int[(int) n];             //next smaller right array
        //calculate the next smaller right value for every element
        for (int i=(int) n-1 ; i>=0 ; i--)
        {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i])
            {
                //when element is greater or equal the stack peek then pop from the stack
                st.pop();
            }
            if (st.isEmpty())
            {
                //when stack is empty add the value of main array length
                nsr[i] = (int) n;
            }
            else
            {
                //otherwise add the stack top index value
                nsr[i] = st.peek();
            }
            //index are pushed in the stack
            st.push(i);
        }

        st = new Stack<>();
        int nsl[] = new int[(int) n];       //next smaller left calculate

        for (int i=0 ; i<n ; i++)
        {
            while (!st.isEmpty() && hist[st.peek()] >= hist[i])
            {
                //when element is greater or equal the stack peek then pop from the stack
                st.pop();
            }
            if (st.isEmpty())
            {
                //when stack is empty add the value -1
                nsl[i] = -1;
            }
            else
            {
                //otherwise add the stack top index value
                nsl[i] = st.peek();
            }
            st.push(i); //index are pushed in the stack
        }

        for (int i=0 ; i<n ; i++)
        {
            long width = nsr[i] - nsl[i] - 1;   //calculate the width
            long area = width * hist[i];        //calculate area
            maxArea = Math.max(maxArea, area);  //find max area
        }
        return maxArea;
    }
}



