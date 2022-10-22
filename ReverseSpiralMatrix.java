/*          Reverse Spiral Form of Matrix
Given a matrix as 2D array. Find the reverse spiral traversal of the matrix. 

Example 1:
Input: R = 3, C = 3
  a = {{9, 8, 7},
       {6, 5, 4},
       {3, 2, 1}}
Output: 5 6 3 2 1 4 7 8 9
Explanation: Spiral form of the matrix
in reverse order starts from the centre 
and goes outward.

Example 2:
Input: R = 4, C = 4 
  a = {{1, 2, 3, 4},
       {5, 6, 7, 8},
       {9, 10, 11, 12}, 
       {13, 14, 15, 16}}
Output: 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
Explanation: 

Your Task:  
You dont need to read input or print anything. Complete the function reverseSpiral() which takes R, C and a as input parameters and returns the matrix in reverse spiral form.

Expected Time Complexity: O(R*C)
Expected Auxiliary Space: O(R*C)

Constraints:
1 <= R,C <=100
1 <= a[R][C] <=100                  */


//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class ReverseSpiralMatrix
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code her
        int length=R*C;
        int arr[]=new int[length];
        int left=0,top=0,direction=0,index=length-1;
        int right=C-1,bottom=R-1;
        
        while( top<=bottom && left<=right )
        {
            if( direction==0 )
            {
                for( int i=left ; i<=right ; i++ )
                    arr[index--]=a[top][i];
                top++;
            }
            else if( direction==1 )
            {
                for( int i=top ; i<=bottom ; i++ )
                    arr[index--]=a[i][right];
                right--;
            }
            else if( direction==2 )
            {
                for( int i=right ; i>=left ; i-- )
                    arr[index--]=a[bottom][i];
                bottom--;
            }
            else if( direction==3 )
            {
                for( int i=bottom ; i>=top ; i-- )
                    arr[index--]=a[i][left];
                left++;
            }
            direction=(direction+1)%4;
        }
        return arr;
    }
}
