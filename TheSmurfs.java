/*      The Smurfs
A geek once visited a magical island where he found a special creature. He named it as Smurf. He noticed a very strange thing there. The smurfs resembled the primary colors of light. To make it more clear, the primary colors of light are Red(R), Green(G), and Blue(B). He talked to one of the smurfs. The smurfs came to know that he is a good programmer. The smurfs suggested a deal that they will ask him one question and if he is able to answer that question, they will allow the geek to take anything from the island.
The question is as follows:
The smurfs possess a very magical property. When two smurfs of different colors meet with other, they gets converted into a smurf of the third color. How many minimum number of smurfs will be remaining after this transformation? The question looked simple to geek. However, the smurfs put another constraint to make the geek think more. The two smurfs must be adjacent to each other  to make the transformation take place. There are n smurfs the colors of which are given in an array a[].

Example 1:
Input: n = 5
a = {'R' , 'G', 'B', 'R', 'B'}
Output: 1
Explaination: First 'R' and 'G' makes 'B'. 
Then 'B' and 'R' makes 'G' and that 'G' 
with 'B' at index 2 makes 'R', Now the 'R' 
and the last 'B' makes 'G'.

Example 2:
Input: n = 2
a = {'R', 'R'}
Output: 2
Explaination: There are two 'R' s. So 
they cannot change to anything else.

Your Task:
You do not need to read input or print anything. Your task is to complete the function findMin() which takes n and a as input parameters and retunrs the minimum number of smurfs existing at the end.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)          */


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class TheSmurfs
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int minFind(int n, String a[])
    {
        // code here
        int redCount=0,blueCount=0,greenCount=0;
        for( int i=0 ; i<n ; i++ )
        {
            if( a[i].equals("R") )
                redCount++;
            else if( a[i].equals("G") )
                greenCount++;
            else if( a[i].equals("B") )
                blueCount++;
        }
        
        if( redCount==n || blueCount==n || greenCount==n )
            return n;
        if( ( redCount%2==0 && blueCount%2==0 && greenCount%2==0 )||
            ( redCount%2==1 && blueCount%2==1 && greenCount%2==1 ) )
            return 2;
        return 1;
    }
}