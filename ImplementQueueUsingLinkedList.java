//gfg

/* 
Implement Queue using Linked List
BasicAccuracy: 45.6%Submissions: 84K+Points: 1
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

Implement a Queue using Linked List. 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the poped element)

Example 1:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation: n the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.

Example 2:

Input:
Q = 4
Queries = 1 2 2 2 1 3 
Output: 2 -1
Explanation: In the second testcase 
1 2 the queue will be {2}
2   poped element will be {2} then
    the queue will be empty. 
2   the queue is empty and hence -1
1 3 the queue will be {3}.
Your Task:
Complete the function push() which takes an integer as input parameter and pop() which will remove and return an element(-1 if queue is empty).

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= Q <= 100
1 <= x <= 100
*/

//{ Driver Code Starts
import java.util.*;

class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class ImplementQueueUsingLinkedList 
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}
// } Driver Code Ends


class MyQueue
{
    QueueNode front, rear;	//front and rear pointer to access the data
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode node=new QueueNode( a);	//Create node
        
        if( front==null )
        {
			//if front is null make its front
            front=node;
            rear=front;
            return;
        }
        //otherwise add the node to the rear
        rear.next=node;
        rear=node;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if( front==null )
        {
			//list have null return -1
            return -1;
        }
        
        int val=front.data;		//extract front value
        front=front.next;		//front node deleted
        return val;				//return stored front value
	}
}




