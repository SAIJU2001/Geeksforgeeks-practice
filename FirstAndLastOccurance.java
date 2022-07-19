/* First and last occurrences of x
Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

Example 1:

Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
Explanation: First occurrence of 5 is at index 2 and last
             occurrence of 5 is at index 5. 
 

Example 2:

Input:
n=9, x=7
arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
Output:  6 6 

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.
Note: If the number x is not found in the array just return both index as -1.

 Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1).

 Constraints:
1 ≤ N ≤ 107 */

import java.util.*;

public class FirstAndLastOccurance
{
    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> a = new ArrayList<>();
        long first=-1;
        long last=-1;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==x)
            {
                if(first==-1)
                {
                    first=i;
                    last=i;
                }
                else
                last=i;
            }
            
        }
        a.add(first);
        a.add(last);
        return a;
    }
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int n = Sc.nextInt();
        long arr[] = new long[n];
        System.out.println();
        for( int i=0 ; i<n ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println(); 
        System.out.print("Enter the value of the occurance element : ");
        int x = Sc.nextInt();
        System.out.println(); 
        ArrayList<Long> a= new ArrayList<>();
        a=find( arr, n, x);
        System.out.print(a);    
}
}