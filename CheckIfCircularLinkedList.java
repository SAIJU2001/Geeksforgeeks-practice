//gfg

/*      Check If Circular Linked List
BasicAccuracy: 54.26%Submissions: 129K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given head, the head of a singly linked list, find if the linked list is circular or not. A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.

Note: The linked list does not contains any inner loop.

Example 1:

Input:
LinkedList: 1->2->3->4->5
(the first and last node is connected,
i.e. 5 --> 1)
Output: 1

Example 2:

Input:
LinkedList: 2->4->6->7->5->1
Output: 0

Your Task:
The task is to complete the function isCircular() which checks if the given linked list is circular or not. It should return true or false accordingly. (the driver code prints 1 if the returned values is true, otherwise 0)

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <=Number of nodes<= 100
*/

//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class CheckIfCircularLinkedList
{
	Node head;
	
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int l = sc.nextInt();
			
			sc.nextLine().trim().split(" ");
			String str[]= sc.nextLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
                
			
			if(l==1 && n>=1)
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next; 
				}
				temp.next = head;
			}
			
			GfG g = new GfG();
			boolean b = g.isCircular(head);
			if(b==true)
			System.out.println(1);
			else 
			System.out.println(0);
		t--;
		}
	}
}
// } Driver Code Ends

//solution for gfg
class GfG
{
    boolean isCircular(Node head)
    {
		// Your code here	

		//here using the slow pointer and fast pointer method
	    Node fast=head;
	    Node slow=head;

	    while( fast!=null && fast.next!=null )
	    {
	        slow=slow.next;
	        fast=fast.next.next;
	        
	        if( slow==fast )
	        {
				//if slow = fast means lopp detect
	            return true;
	        }
	    }
	    return false;
    }
}