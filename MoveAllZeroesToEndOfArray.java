//gfg

/*      Move all zeroes to end of array
EasyAccuracy: 45.51%Submissions: 117K+Points: 2
Done with this problem? Now use these skills to apply for a job in Job-A-Thon 21!

Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.

Example 1:
Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.

Example 2:
Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.

Your Task:
You don't need to read input or print anything. Complete the function pushZerosToEnd() which takes the array arr[] and its size n as input parameters and modifies arr[] in-place such that all the zeroes are moved to the right.  

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
0 ≤ arri ≤ 105
*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MoveAllZeroesToEndOfArray 
{
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) 
        {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) 
            {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{
    void pushZerosToEnd(int[] arr, int n) 
    {
        // code here
        
        int index=0,count=0;
        for( int i=0 ; i<n ; i++ )
        {
            if( arr[i]!=0 )
            {
                //if value is not 0 then added to the array
                arr[index++]=arr[i];
            }
            else
            {
                //if value is zero then incremenet count 
                count++;
            }
        }
        while( count-->0 )
        {
            //now all the zeros are added to the array
            arr[index++]=0;
        }
    }
}


