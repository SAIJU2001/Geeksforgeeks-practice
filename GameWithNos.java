/*          Game with nos
You are given an array arr[], and you have to re-construct an array arr[].
The values in arr[] are obtained by doing Xor of consecutive elements in the array.

Example 1:
Input : n=5, arr[ ] = {10, 11, 1, 2, 3}
Output : 1 10 3 1 3
Explanation:
At index 0, arr[0] xor arr[1] = 1
At index 1, arr[1] xor arr[2] = 10
At index 2, arr[2] xor arr[3] = 3
...
At index 4, No element is left So, it will remain as
it is.
New Array will be {1, 10, 3, 1, 3}.

Example 2:

Input : n=4, arr[ ] = {5, 9, 7, 6}
Output :  12 14 1 6
Explanation:
At index 0, arr[0] xor arr[1] = 12
At index 1, arr[1] xor arr[2] = 14
At index 2, arr[2] xor arr[3] = 1
At index 3, No element is left So, it will remain as it is.
New Array will be {12, 14, 1, 6}.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function game_with_number() that takes an array (arr), sizeOfArray (n) and return the array re-constructed array arr. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 107            */

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GameWithNos
{    
    // Driver code
	public static void main (String[] args) throws IOException
    {
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0)
        {
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++)
            {
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.game_with_number(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++)
            {
		        out.print(arr[i] + " ");
		    }
		    out.println();
		}
		out.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Complete
{    
       // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) 
    {
        // Complete the function
        for( int i=0 ; i<n-1 ; i++ )
        {
            int temp=arr[i]^arr[i+1];
            arr[i]=temp;
        }
        return arr;
    }    
}




