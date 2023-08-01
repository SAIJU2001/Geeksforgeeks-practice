//gfg

/*	Queue using stack
EasyAccuracy: 73.87%Submissions: 18K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Implement a Queue using two stack s1 and s2.

Example 1:

Input:
enqueue(2)
enqueue(3)
dequeue()
enqueue(4)
dequeue()
Output: 2 3
Explanation:
enqueue(2) the queue will be {2}
enqueue(3) the queue will be {3 2}
dequeue() the poped element will be 2 
the stack will be {3}
enqueue(4) the stack will be {4 3}
dequeue() the poped element will be 3. 

Example 2:

Input:
enqueue(2)
dequeue()
dequeue()
Output: 2 -1
Your Task:

Since this is a function problem, you don't need to take inputs. You are required to complete the two methods enqueue() which takes an integer 'x' as input denoting the element to be pushed into the queue and dequeue() which returns the integer poped out from the queue.

Expected Time Complexity: O(1) for enqueue() and O(n) for dequeue()
Expected Auxiliary Space: O(1) for both enqueue() and dequeue()

Constraints:
1 <= Number of queries <= 100
1 <= values of the stack <= 100
*/

//{ Driver Code Starts
import java.util.*;

class QueueUsingStack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();	
		    t--;
		}
	}
}
// } Driver Code Ends


//solution
class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    return output.pop();
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here	
	    if( output.isEmpty() )
	    {
			
	        output.push( x);
	        return;
	    }
	    
	    while( !output.isEmpty() )
	    {
	        input.push( output.pop() );
	    }
	    
	    output.push(x);
	    while( !input.isEmpty() )
	    {
	        output.push( input.pop() );
	    }
    }
}

