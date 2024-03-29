/*      Professor and Parties.
A professor went to a party. Being an erudite person, he classified the party into two categories. He proposed that if all the persons in the party are wearing different colored robes, then that is a girl’s only party. If we even get one duplicate color, it must be a boy’s party. The colors of the robes are represented by positive integers.

Example 1:

Input
N = 5
A[] = {1, 2, 3, 4, 7}
Output
GIRLS
Explanation:
All the colors are unique so it's a GIRLS party.
 
Example 2:

Input
N = 6
A[] = {1, 3, 2, 4, 5, 1}
Output
BOYS
Explanation:
There are two colors 1. So it's a BOYS party.
 
Your task:
You don't need to print the answer, printing is done by the driver code itself. You have to complete the function PartyType() which takes the array A[] and its size N as inputs and returns  “BOYS” (without quotes) if it’s a boy’s party, else returns “GIRLS”.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints
1 ≤ N ≤ 105
1 ≤ Ai ≤ 109        */


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ProfessorsAndParties 
{
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
            {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.PartyType(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution 
{
    public static String PartyType( long a[], int n)
    {
        // Your code goes here
        Arrays.sort(a);
        String partyGenger="GIRLS";
        
        for( int i=0 ; i<n-1 ; i++ )
        {
            if( a[i]==a[i+1] )
                partyGenger="BOYS";
        }
        return partyGenger;
    }
}