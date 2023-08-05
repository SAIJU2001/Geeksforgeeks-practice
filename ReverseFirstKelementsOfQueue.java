//gfg

/*
Reverse First K elements of Queue
EasyAccuracy: 81.28%Submissions: 76K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Note: The above operations represent the general processings. In-built functions of the respective languages can be used to solve the problem.

Example 1:

Input:
5 3
1 2 3 4 5

Output: 
3 2 1 4 5

Explanation: 
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.

Example 2:

Input:
4 4
4 3 2 1

Output: 
1 2 3 4

Explanation: 
After reversing the given
input from the 4th position the resultant
output will be 1 2 3 4.
Your Task:
Complete the provided function modifyQueue that takes queue and k as parameters and returns a modified queue. The printing is done automatically by the driver code.

Expected Time Complexity : O(N)
Expected Auxiliary Space : O(K)

Constraints:
1 <= N <= 1000
1 <= K <= N
*/

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class ReverseFirstKelementsOfQueue
{
    public static void main(String[] args) 
    {
        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            // Taking count of total number of elements
            int n = sc.nextInt();

            // Taking count of total elements
            // that need to be reversed
            int k = sc.nextInt();

            // Creating a Queue
            Queue<Integer> q = new LinkedList<>();

            // adding all the elements to the Queue
            while (n-- > 0) {
                q.add((int)sc.nextInt());
            }

            // Creating an object of class GfG
            GfG g = new GfG();

            // calling modifyQueue of class GfG
            // and passing Queue and k as arguments
            // and storing the reuslt in a new Queue
            Queue<Integer> ans = g.modifyQueue(q, k);

            // Printing all the elements from the
            // new Queue and polling them out
            while (!ans.isEmpty()) {
                int a = ans.peek();
                ans.poll();
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class GfG 
{
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) 
    {
        // add code here.
        Stack<Integer>st=new Stack<>();     //stack(LIFO order) which always gives the reverse order
        int n=q.size();
        
        for( int i=0 ; i<k ; i++ )
        {
            //queue value added to the stack
            st.push( q.remove() );
        }
        
        for( int i=0 ; i<k ; i++ )
        {
            //add the stack values to the queue
            q.add( st.pop() );
        }
        
        for( int i=k ; i<n ; i++ )
        {
            //now remove the first k elements
            q.add( q.remove() );
        }
        return q;
    }
}
