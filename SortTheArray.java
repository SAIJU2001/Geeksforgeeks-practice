/*          Sort The Array
Given a random set of numbers, Print them in sorted order.

Example 1:
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: {1, 2, 3, 5}
Explanation: After sorting array will 
be like {1, 2, 3, 5}.

Example 2:
Input:
N = 2
arr[] = {3, 1}
Output: {1, 3}
Explanation: After sorting array will
be like {1, 3}.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function sortArr() which takes the list of integers and the size N as inputs and returns the modified list.

Expected Time Complexity: O(N * log N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, A[i] ≤ 105           */


//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class SortTheArray
{
    public static void main(String args[]) throws IOException 
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt();
            
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }    
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        Arrays.sort(arr);
        return arr;
    }
} 