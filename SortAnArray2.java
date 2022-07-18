/* Sort an array of 0s, 1s and 2s

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


Expected Time Complexity: O(2N)
Expected Auxiliary Space: O(1)  */


import java.util.*;

public class SortAnArray2
{
    //solve by the count method.

    public static void sort012(int a[], int n)
    {
        // code here 
        int zero=0;
        int one=0;
        int two=0;
        int temp=0;
        for( int i=0 ; i<n ; i++ )
        {
            if(a[i]==0)
            {
                zero++;
            }
            else if( a[i]==1)
            {
               one++;
            }
            else
            {
                two++;    
            }
        }
        for( int i=0 ; i<n ; i++ )
        {
                if(zero!=0)
                {
                    a[i]=0;
                    zero--;
                }
                else if(one!=0 )
                {
                    a[i]=1;
                    one--;
                }
                else
                {
                    a[i]=2;
                    two--;    
                }
        }
        System.out.println("The sorted array is : ");
        for( int i=0 ; i<n ; i++)
        System.out.print(a[i]+" ");
        
    }
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index : ");
        int n = Sc.nextInt();
        System.out.println();
        int a[] = new int[n];
        for( int i=0 ; i<n ; i++)
        {
            System.out.print("Enter the value of "+i+"th index : ");
            a[i]=Sc.nextInt();
        }
        System.out.println();
        sort012( a, n );
    }
}