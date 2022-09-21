/*          Jay's Apples
One day Jay, on getting his first salary, decides to distribute apples among the poverty-stricken persons. He gave each person 1kg of apples. People are coming in a queue and he makes sure that he gives every person 1 kg of apples only once. Every person is identified by a specific integer.

Given the length of the queue N followed by an array of N integers, denoting the persons in that queue, find the minimum kilograms of apples Jay will have to distribute.

Example 1:

â€‹Input : arr[ ] = {1, 1, 1, 1, 1}
Output : 1
Explanation:
For test case 1, the same person (identified 
by the integer '1' comes again and again in 
the queue, but Jay will not give him apples 
again and again. He gave him apples only 
once so minimum kg's of apples here 
required-1kg).

â€‹Example 2:

Input : arr[ ] = {1, 2, 3, 1, 2} 
Output :  3 
 
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function minimum_apple() that takes an array (arr), sizeOfArray (n) and return the minimum kilograms of apples Jay will have to distribute. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
1 ≤ Ai ≤ 105            */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class JaysApples 
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
		    Complete obj = new Complete();
		    int ans = obj.minimum_apple(arr, sizeOfArray);
		    System.out.println(ans);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Complete
{   
    // Function for finding maximum and value pair
    public static int minimum_apple (int arr[], int n) 
    {
        //Complete the function
        Arrays.sort(arr);
        int appleCount=1;
        for( int i=0 ; i<n-1 ; i++ )
        {
            if( arr[i] !=arr[i+1])
                appleCount++;
        }
        
        return appleCount;
    }    
}


