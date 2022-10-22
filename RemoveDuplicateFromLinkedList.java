/*      Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

Example 1:
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time.

Example 2:
Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation: In the given linked list 
2 ->2 ->2 ->2 ->2, 2 is the only element
and is repeated 5 times.

Your Task:
The task is to complete the function removeDuplicates() which should remove the duplicates from linked list and return the head of the linkedlist.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= Number of nodes <= 104         */


//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class RemoveDuplicateFromLinkedList
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			RemoveDuplicateFromLinkedList llist = new RemoveDuplicateFromLinkedList(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}
// } Driver Code Ends


/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    if( head==null || head.next==null )
	        return head;
	   
	    HashSet<Integer> set=new HashSet<>();
	    set.add(head.data);
	    Node prevNode=head;
	    Node currNode=prevNode.next;
	    while( currNode!=null )
	    {
	        if( set.contains(currNode.data))
	        {
	            prevNode.next=currNode.next;
	            currNode=currNode.next;
	        }
	        else
	        {
	            set.add(currNode.data);
	            prevNode=currNode;
	            currNode=currNode.next;
	        }
	    }
	    return head;
    }
}
