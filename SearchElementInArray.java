/* Search an Element in an array.
Given an integer array and another integer element. The task is to find if the given element is present in array or not.

Example 1:

Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case 
with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is 
present at index 2, output is 2.

Example 2:

Input:
n = 5
arr[] = {1,2,3,4,5}
x = 5
Output: 4
Explanation: For array elements 
{1,2,3,4,5} element to be searched 
is 5 and it is at index 4. So, the 
output is 4.

Your Task:
The task is to complete the function search() which takes the array arr[], its size N and the element X as inputs and returns the index of first occurrence of X in the given array. If the element X does not exist in the array, the function should return -1.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1). 

Constraints:
1 <= n <= 106
0 <= arr[i] <= 106
0 <= x <= 105   */

import java.util.*;

public class SearchElementInArray
{
    public static int search(int arr[], int N, int X)
    {
        int count=0;
        int i;
        for( i=0 ; i<N ; i++ )
        {
            if(arr[i]==X)
            {
                count++;
                break;
            }
        }
        if(count==0)
        return -1;
        else 
        return i;
    }
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int N = Sc.nextInt();
        int arr[] = new int[N];
        System.out.println();
        for( int i=0 ; i<N ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println(); 
            System.out.print("Enter the element search in this array : ");
            int X = Sc.nextInt();
            int l=search(arr , N, X);
            if(l==-1)
            System.out.print("The search element is not present in the array");
            else 
            System.out.print("The search element is present in the array index : "+l);
        }
}
