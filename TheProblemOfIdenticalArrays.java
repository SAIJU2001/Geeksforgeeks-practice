/*      The problem of identical arrays
Two arrays of size N are called identical arrays if they contain the same elements. The order of elements in both arrays could be different; however, both the arrays must contain same elements. You are given two arrays of size N.

You need to determine if the arrays are identical or not.

Example 1:
Input : A[] = {1, 2, 3, 4, 5}, B[] = {3, 4, 1, 2, 5}
Output : 1
Explanation:
Here we can see array A[] = [1, 2, 3, 4, 5] and 
B[] = [3, 4, 1, 2, 5]. If we look both the array then we 
can get that array B is the permutation of A. So, both array
are identical. 

Example 2:
Input : A[] = {1, 2, 4}, B[] = {3, 2, 1} 
Output : 0 
 
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function check() that takes an array (arr), another array (brr), size of both array (n), and return the 1 if both the array are identical else 0. The driver code takes care of the printing.

Expected Time Complexity: O(NLog(N)).
Expected Auxiliary Space: O(1).
 
Constraints:
1 ≤ N ≤ 105
0 ≤ A[i] ≤ 9        */

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class TheProblemOfIdenticalArrays 
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
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++)
            {
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int brr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] ele = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++)
            {
		        brr[i] = Integer.parseInt(ele[i]);
		    }
		    
		    Complete obj = new Complete();
		    int res = obj.check(arr, brr, sizeOfArray);
		    
		    System.out.println(res);
		}
	}
}
// } Driver Code Ends


class Complete
{      
    // Function for finding maximum and value pair
    public static int check (int arr[], int[] brr, int n) 
    {
        //Complete the function
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        int indicateIdentical=1;
        for( int i=0 ; i<n ; i++ )
        {
            if( arr[i]!=brr[i])
            {
                indicateIdentical=0;
                break;
            }
        }
        
        return indicateIdentical;
        
    }   
}