/*              Counting elements in two arrays
Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].

Example 1:
Input:
m = 6, n = 6
arr1[] = {1,2,3,4,7,9}
arr2[] = {0,1,2,1,1,4}
Output: 4 5 5 6 6 6
Explanation: Number of elements less than
or equal to 1, 2, 3, 4, 7, and 9 in the
second array are respectively 4,5,5,6,6,6

Example 2:
Input:
m = 5, n = 7
arr1[] = {4,8,7,5,1}
arr2[] = {4,48,3,0,1,1,5}
Output: 5 6 6 6 3
Explanation: Number of elements less than
or equal to 4, 8, 7, 5, and 1 in the
second array are respectively 5,6,6,6,3

Your Task :
Complete the function countEleLessThanOrEqual() that takes two array arr1[], arr2[],  m, and n as input and returns an array containing the required results(the count of elements less than or equal to it in arr2 for each element in arr1 where ith output represents the count for ith element in arr1.)

Expected Time Complexity: O((m + n) * log n).
Expected Auxiliary Space: O(m).

Constraints:
1<=m,n<=10^5
0<=arr1[i],arr2[j]<=10^5                */


//{ Driver Code Starts
import java.util.*;

class CountingElementsInTwoArrays
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }    
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> list=new ArrayList<Integer>();
       int count=0, j;
       Arrays.sort(arr2);
       for( int i=0 ; i<m ; i++ )
       {
           for( j=0 ; j<n ; j++ )
           {
               if( arr1[i]<arr2[j] )
                    break;
           }
           list.add(j);
           count=0;
       }
       return list;
    }
}