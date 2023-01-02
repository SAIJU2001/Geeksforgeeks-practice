/*      Asteroid Collision
Stand out from the crowd. Prepare with Complete Interview Preparation  

We are given an integer array asteroids of size N representing asteroids in a row. For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are of same size, both will explode. Two asteroids moving in the same direction will never meet.
 
Example 1:

Input:
N = 3
asteroids[ ] = {3, 5, -3}
Output: {3, 5}
Explanation: The asteroid 5 and -3 collide resulting in 5. The 5 and 3 never collide.

Example 2:

Input:
N = 2
asteroids[ ] = {10, -10}
Output: { }
Explanation: The asteroid -10 and 10 collide exploding each other.

Your Task:
You don't need to read input or print anything. Your task is to complete the function asteroidCollision() which takes the array of integers asteroids and N as parameters and returns the state of asteroids after all collisions.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
-1000 ≤ asteroidsi  ≤ 1000
asteroids[i]!=0         */


//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class AsteroidCollision 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public static int[] asteroidCollision(int N, int[] asteroids) 
    {
        // code here
        Stack<Integer> st=new Stack<>();
        for( int i=0 ; i<N ; i++ )
        {
            if( asteroids[i]>0 )
                st.push( asteroids[i] );
            else
            {
                while( !st.isEmpty() && st.peek()>0 && st.peek()<Math.abs( asteroids[i] ) )
                    st.pop();
                
                if( !st.isEmpty() && st.peek()==Math.abs( asteroids[i] ) )
                    st.pop();
                    
                else if( st.isEmpty() || st.peek()<0 )
                    st.push( asteroids[i] );    
            }
        }
        int arr[]=new int[st.size()];
        for( int i=st.size()-1 ; i>=0 ; i-- )
            arr[i]=st.pop();
            
        return arr;
    }
}
