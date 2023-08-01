//gfg

/*
Queue Push & Pop
BasicAccuracy: 74.53%Submissions: 19K+Points: 1
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given an array arr[] of size N, enqueue the elements of the array into a queue and then dequeue them.

Example 1:

Input:
N = 5 
arr[] = 1 2 3 4 5 
Output: 
1 2 3 4 5
Example 2:

Input:
N = 7
arr[] = 1 6 43 1 2 0 5
Output:
1 6 43 1 2 0 5
Your Task:
You don't need to read any input. Your task is to complete the functions push() and _pop(). The function push() takes the array and its size as the input parameters and returns the queue formed, and the function _pop(), takes the queue as the input parameter and prints the elements of the queue.

Expected time complexity: O(n)
Expected space complexity: O(n)

Constraints:
1 <= Ai <= 107
*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;
  
public class QueuePushAndPop 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
             Solution g=new Solution();
            
            Queue<Integer> ans=g.push(arr,n);
            g._pop(ans);
            System.out.println();    
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution
{    
    public Queue<Integer> push(int arr[], int n)
    {
        //push all the elements of the array arr in the queue and return the queue
        Queue<Integer>q=new LinkedList<>();
        for( int i=0 ; i<n ; i++ )
        {
            q.add( arr[i] );
        }
        return q;
    }
    
    public void _pop(Queue<Integer> q)
    {
        //dequeue the elements and print them
        while( !q.isEmpty() )
            System.out.print( q.remove()+" ");
    }
}