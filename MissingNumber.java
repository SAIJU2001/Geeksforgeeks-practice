/* Missing number in array.
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
1 ≤ A[i] ≤ 106// User function Template for Java    */

import java.util.*;

public class MissingNumber
{
    public static int Missing_number(int array[], int n) 
    {
        int sum=0;
        int sum_natural=n*(n+1)/2;
        
        for( int i=0 ; i<n-1 ; i++ )
        {
            sum+=array[i];      
        }
        
        int sub=sum_natural-sum;
        return sub;
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int index = Sc.nextInt();
        int array[] = new int[index-1];
        System.out.println();
        for( int i=0 ; i<index-1 ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                array[i] = Sc.nextInt();
            }
            System.out.println();
        int num = Missing_number( array, index ); 
        System.out.print("The missing value is : "+num);

    }
}