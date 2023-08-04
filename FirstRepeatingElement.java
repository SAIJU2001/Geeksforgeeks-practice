//gfg

/*  First Repeating Element
EasyAccuracy: 32.57%Submissions: 181K+Points: 2
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 

Example 1:

Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 
5 is appearing twice and 
its first appearence is at index 2 
which is less than 3 whose first 
occuring index is 3.

Example 2:

Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation: 
All elements appear only once so 
answer is -1.

Your Task:
You don't need to read input or print anything. Complete the function firstRepeated() which takes arr and n as input parameters and returns the position of the first repeating element. If there is no such element, return -1.
 
Expected Time Complexity: O(n)
Expected Auxilliary Space: O(n)

Constraints:
1 <= n <= 106
0 <= Ai<= 106
*/

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class FirstRepeatingElement 
{
    public static void main(String[] args) 
    {
        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution 
{
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) 
    {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();    //key=array element,value=index
        int minIndex=n;
        
        for( int i=0 ; i<n ; i++ )
        {
            if( !map.containsKey( arr[i] ) )    //everytime check key is present or not
            {
                map.put( arr[i], i );   //if key is not opresent the add the key and value
            }
            else
            {
                //if key value is present calculate for minimum index
                minIndex=Math.min( minIndex, map.get( arr[i]) );
            }
        }
        
        if( minIndex==n )
        {
            //if there is no repeat return -1
            return -1;
        }
        
        return minIndex+1;
    }
}
