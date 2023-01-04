/*			Reaching the heights
The teacher gives a mental ability question to Raju. The question is as follows:-

Raju is in an elevator. Given by his teacher is an array of size N which denotes the number of floors and has a 1 based indexing. The elevator starts from the ground and moves up and down, X and Y floors respectively. There is a code used in the elevator according to which it moves up X floors given at odd indexes of the array and moves down Y floors given at even indexes of the array. He is asked to go to the highest floor possible. Help him to sort the array such that he reaches the highest floor after traversing the whole array from starting till the end, without skipping any index.

He always prefers to move more number of floors up and less number of floors down. Once he gets into the elevator, the elevator should not reach the ground again, if it does return -1.

Example 1:

Input : arr[ ] = {2, 3, 4, 5}
Output : 5 2 4 3
Explanation:
Array can be arranged as {5,3,4,2} or 
{4,3,5,2} or {4,2,5,3} but it will get 
arranged as {5,2,4,3} because he always 
prefer to move more number of floors up 
and less number of floors down.

Example 2:

Input : arr[ ] = {1, 1} 
Output :  Not Possible 
 
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function game_with_number() that takes sizeOfArray (n), an array (arr), and return the sorted array or if it is Not Possible return -1. The driver code takes care of the printing.

Expected Time Complexity: O(N*LOG(N)).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 103				*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class ReachingTheHeights 
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
	            arr[i] = Integer.parseInt(elements[i]);    
	        
		    Complete obj = new Complete();
		    ArrayList<Integer> ans;
		    ans = obj.reaching_height(N, arr);
        	
        	if(ans.size() == 1 && ans.get(0) == -1)
			{
        	    System.out.println("Not Possible");
        	    continue;
        	}
        	
        	for(int i: ans)
        	    System.out.print(i + " ");
        	System.out.println();
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Complete
{   
    // Function for finding maximum and value pair
    public static ArrayList<Integer> reaching_height (int n, int arr[]) 
	{
        //Complete the function
        ArrayList<Integer> list=new ArrayList<>();
        int flag=0;
        for( int k=0 ; k<n-1 ; k++)
            if( arr[k]==arr[k+1] )
                flag++;
        
        if( flag==n-1 && flag!=0 )
        {    
            list.add(-1);
            return list;
        }
            
        int j=n-1,i=0;
        Arrays.sort(arr);
        for( int k=0 ; k<n ; k++ )
        {
            if( k%2==1 || k==1 )
                list.add(arr[i++]);
            else
                list.add(arr[j--]);
        }
        return list;
    }
}
