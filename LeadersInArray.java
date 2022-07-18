/* Leaders in an array.
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 
Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
 
Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

 Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)  */

import java.util.*;

public class LeadersInArray
{
    //Function to find the leaders in the array.
    public static ArrayList<Integer> leaders(int arr[], int n)
    {
        ArrayList<Integer> alist = new ArrayList<Integer>();
       ArrayList<Integer> revalist = new ArrayList<Integer>();
        int max=arr[n-1];
        for( int i=n-1 ; i>=0 ; i-- )
        {
            if( arr[i]>=max )
                {
                    max=arr[i];
                    alist.add(max);
                }
        }
        for( int i=alist.size()-1 ; i>=0 ; i-- )
        {
            revalist.add(alist.get(i));
        }
      return revalist;
    }
    public static void main(String args[])
    {
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
            ArrayList<Integer> alist = new ArrayList<Integer>(); 
            alist=leaders(arr, n);
            System.out.print("The leaders in this array is : ");
            for( int i=0 ; i<alist.size() ; i++ )
            {
                System.out.print(alist.get(i)+" ");
            }

    }
}
