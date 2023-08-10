//gfg


/*          Linked List Length Even or Odd?
BasicAccuracy: 71.58%Submissions: 60K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd() which contains head of the linked list and check whether the length of linked list is even or odd.

Input:
The input line contains T, denoting the number of testcases. Each testcase contains two lines. the first line contains N(size of the linked list). the second line contains N elements of the linked list separated by space.

Output:
For each testcase in new line, print "even"(without quotes) if the length is even else "odd"(without quotes) if the length is odd.

User Task:
Since this is a functional problem you don't have to worry about input, you just have to  complete the function isLengthEvenOrOdd() which takes head of the linked list as input parameter and returns 0 if the length of the linked list is even otherwise returns 1.

Constraints:
1 <= T <= 100
1 <= N <= 103
1 <= A[i] <= 103

Example:
Input:
2
3
9 4 3
6
12 52 10 47 95 0

Output:
Odd
Even

Explanation:
Testcase 1: The length of linked list is 3 which is odd.
Testcase 2: The length of linked list is 6 which is even.
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
		
public class LinkedListLengthEvenOrOdd
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
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
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
		    GFG obj=new GFG();
			int start=obj.isLengthEvenorOdd(head);
		    if(start==0)
		    System.out.println("Even");
		    else
		    System.out.println("Odd");
		}
	}
}
// } Driver Code Ends


class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    Node node=head1;
	    int count=0;    //node counter
	    
	    while( node!=null )
	    {
            //incremenet count if node not null
	        count++;
	        node=node.next;
	    }
	    
	    if( count%2==0 )
	    {
            //basic even odd checker
	        return 0;
	    }
	        
	   return 1;
	}
}