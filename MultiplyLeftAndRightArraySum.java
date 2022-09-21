/*      Multiply left and right array sum.
Pitsy needs help with the given task by her teacher. The task is to divide an array into two sub-array (left and right) containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.

Example 1:

Input : arr[ ] = {1, 2, 3, 4}
Output : 21
Explanation:
Sum up an array from index 0 to 1 = 3
Sum up an array from index 2 to 3 = 7
Their multiplication is 21.

Example 2:

Input : arr[ ] = {1, 2} 
Output :  2 
 
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function multiply() that takes an array (arr), sizeOfArray (n), and return the sum of the subarrays and then multiply both the subarrays. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[i] ≤ 100          */


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class MultiplyLeftAndRightArraySum 
{    
    // Driver code
	public static void main (String[] args) throws IOException
    {
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0)
        {
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++)
            {
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    Complete obj = new Complete();
		    int ans = obj.multiply(arr, N);
        	System.out.println(ans);
		}
	}
}


// } Driver Code Ends


//User function Template for Java
//gfg solution is here

class Complete
{   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) 
    {
        //Complete the function
        int i=0,j=n/2;
        int res1=0,res2=0;
        
        for( int k=0 ; k<n/2 ; k++ )
        {
            res1=res1+arr[i++];
            res2=res2+arr[j++];
        }
        
        if( n%2 !=0 )
           res2=res2+arr[j];
           
           
        return res1*res2;
        
    }
    
    
}





