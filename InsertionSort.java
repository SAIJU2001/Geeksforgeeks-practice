/*      Insertion Sort.
The task is to complete the insert() function which is used to implement Insertion Sort.

Example 1:

Input:  N = 5
arr[] = { 4, 1, 3, 9, 7}
Output: 1 3 4 7 9

Example 2:

Input:  N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10

Your Task: 
You don't have to read input or print anything. Your task is to complete the function insert() and insertionSort() where insert() takes the array, it's size and an index i and insertionSort() uses insert function to sort the array in ascending order using insertion sort algorithm. 

Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 1000
1 <= arr[i] <= 1000     */

import java.util.*;

public class InsertionSort
{
	public static void printArray(int arr[],int size)
	{
        System.out.print("After sorting : ");
		for( int i=0 ; i<size ; i++ )
        {
		    System.out.print(arr[i]+" ");
        }
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
		int n= sc.nextInt();
        System.out.println();

		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
            System.out.print("Enter the va;ue of the index "+i+" : "); 
        	arr[i]= sc.nextInt();
        }
        System.out.println();
			
		insertionSort(arr,n);
	    printArray(arr,n);
		
	}
  //Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int arr[], int n)
    {
        //code here
        for( int i=1 ; i<n ; i++)
        {
            int j=i-1;
            int unsort=arr[i];
            while( j>=0 && arr[j]>unsort)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=unsort;
        }
  }
}