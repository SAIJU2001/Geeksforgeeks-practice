/*      Bubble Sort.
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.

Example 1:

Input: N = 5
arr[] = {4, 1, 3, 9, 7}
Output: 1 3 4 7 9

Example 2:

Input: N = 10 
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10

Your Task: 
You don't have to read input or print anything. Your task is to complete the function bubblesort() which takes the array and it's size as input and sorts the array using bubble sort algorithm.

Expected Time Complexity: O(N^2).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= arr[i] <= 103      */

import java.util.*;

public class BubbleSort
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for( int i=0 ; i<n ; i++ )
        {
            for( int j=0 ; j<n-1 ; j++)
            {
                if( arr[j]>arr[j+1] )
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        System.out.print("After sorting : ");
        int n = arr.length;
        for (int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		System.out.println();	
		//creating a new array of length n
		int arr[] = new int[n];
			
		//inserting elements to the array
		for( int i=0 ; i<n ; i++)
		{
            System.out.print("Enter the value of index no "+i+" : ");
			arr[i] = sc.nextInt(); 
		}
		System.out.println();	
			
		//calling bubbleSort() method
		bubbleSort(arr,n);
			
		//calling printArray() method
		printArray(arr);

		}
	}


