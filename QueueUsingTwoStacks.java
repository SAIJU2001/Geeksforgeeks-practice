//gfg

/* 
Queue using two Stacks
EasyAccuracy: 58.89%Submissions: 116K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)

Note :- If there is no element return -1 as answer while popping.

Example 1:

Input:
5
1 2 1 3 2 1 4 2

Output: 
2 3

Explanation: 
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue 
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.

Example 2:

Input:
4
1 2 2 2 1 4

Output: 
2 -1

Explanation: 
In the second testcase 
1 2 the queue will be {2}
2   poped element will be 2 and 
    then the queue will be empty
2   the queue is empty and hence -1
1 4 the queue will be {4}.
Your Task:
You are required to complete the two methods push which take one argument an integer 'x' to be pushed into the queue and pop which returns a integer poped out from other queue(-1 if the queue is empty). The printing is done automatically by the driver code.

Expected Time Complexity : O(1) for push() and O(N) for pop() or O(N) for push() and O(1) for pop()  
Expected Auxilliary Space : O(1).

Constraints:
1 <= Q <= 100
1 <= x <= 100

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
*/


//{ Driver Code Starts
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;

class QueueUsingTwoStacks
{
	public static void main(String args[])
	{
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking input the number of testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //Creating a new object of class StackQueue
			StackQueue g = new StackQueue();
			
			//Taking input the total number of Queries
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				
				//If QueryTyoe is 1 then
				//we call the Push method
				//of class StackQueue
				//else we call the Pop method
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.Push(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.Pop()+" ");
			q--;
				
			}
			System.out.println();
		    t--;
		}
	}
}
// } Driver Code Ends


class StackQueue
{
	//two stacks
    Stack<Integer> s1 = new Stack<Integer>();	//main stack
    Stack<Integer> s2 = new Stack<Integer>();	//helper stack

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here

	   //whenever you add any value all the values from the main stack remove and add to the helper stack
	   while( !s1.isEmpty() )
	   {
		   s2.push( s1.pop() );
		}
		
		//then add the value
		s1.push( x);
		
		//then again add the values from helper stack to main stack
	   while( !s2.isEmpty() )
	   {
	       s1.push( s2.pop() );
	   }
    }
	    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   // Your code here
	   if( s1.isEmpty() && s2.isEmpty() )
	   {
		//whenever two stacks are empty return -1
	       return -1;
	   }
	   
	   return s1.pop();	//simply value poped from the main stack
    }
}
