/* Wave Array
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically smallest one.

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.

Example 2:

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.

Your Task:
The task is to complete the function convertToWave(), which converts the given array to a wave array.
NOTE: The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ n ≤ 106
0 ≤ arr[i] ≤107 */

import java.util.*;

public class WaveArray
{
    public static void convertToWave(int n, int[] a) 
    {
        int first=0;
        int second=1;
        while(second<n)
        {
            int temp=a[second];
            a[second]=a[first];
            a[first]=temp;
            first+=2;
            second=first+1;
        }
        
    }
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int n = Sc.nextInt();
        int a[] = new int[n];
        System.out.println();
        for( int i=0 ; i<n ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                a[i] = Sc.nextInt();
            }
        System.out.println(); 
        convertToWave( n,  a);
        System.out.print("The array wave is : ");
        for( int i=0 ; i<n ; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
}