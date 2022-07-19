/* Bitonic Point
Given an array arr of n elements which is first increasing and then may be decreasing, find the maximum element in the array.
Note: If the array is increasing then just print then last element will be the maximum value.

Example 1:

Input: 
n = 9
arr[] = {1,15,25,45,42,21,17,12,11}
Output: 45
Explanation: Maximum element is 45.

Example 2:

Input: 
n = 5
arr[] = {1, 45, 47, 50, 5}
Output: 50
Explanation: Maximum element is 50.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function findMaximum() which takes the array arr[], and n as parameters and returns an integer denoting the answer.

Expected Time Complexity: O(logn)
Expected Auxiliary Space: O(1)

Constraints:
3 ≤ n ≤ 106
1 ≤ arri ≤ 106  */

import java.util.*;

public class BitonicPoint
{
    public static int findMaximum(int[] arr, int n)
    {
        int max=0;
        for( int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                max=arr[i+1];
            }
        }
        return max;
    }
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        for( int i=0 ; i<n ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println();
            int max=findMaximum( arr, n);
            System.out.print("Maximum element in this array is "+max);
        } 
}