//gfg

/*  Intersection Point in Y Shaped Linked Lists
MediumAccuracy: 44.67%Submissions: 221K+Points: 4
Sharpen up your programming skills, participate in coding contests & explore high-paying jobs

Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

 

Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List
Example 2:

Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL       
Your Task:
You don't need to read input or print anything. The task is to complete the function intersetPoint() which takes the pointer to the head of linklist1(head1) and linklist2(head2) as input parameters and returns data value of a node where two linked lists intersect. If linked list do not merge at any point, then it should return -1.
Challenge : Try to solve the problem without using any extra space.

 

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ N + M ≤ 2*105
-1000 ≤ value ≤ 1000
*/
 

 //{ Driver Code Starts
import java.util.*;


class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
	
class IntersectionPointInYShapedLL
{
    Node head = null;  
	Node tail = null;

public void addToTheLast(Node node) 
{

  if (head == null) {
   head = node;
   tail = head;
  } else {
   //Node temp = head;
   //while (temp.next != null)
    //temp = temp.next;

   //temp.next = node;
   tail.next=node;
   tail = node;
  }
}

  /* Function to print linked list */
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
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			IntersectionPointInYShapedLL llist1 = new IntersectionPointInYShapedLL();
		    IntersectionPointInYShapedLL llist2 = new IntersectionPointInYShapedLL();
			IntersectionPointInYShapedLL llist3 = new IntersectionPointInYShapedLL();
			
				int a1=sc.nextInt();
				Node head1= new Node(a1);
				Node tail1= head1;
				
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					tail1.next = (new Node(a));
					tail1= tail1.next;
				}
			
			
				int b1=sc.nextInt();
				Node head2 = new Node(b1);
				Node tail2 = head2;
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt();  
					tail2.next = (new Node(b));
					tail2= tail2.next;
				}
				if(n3>0){
				int c1=sc.nextInt();
				Node head3= new Node(c1);
				tail1.next = head3;
				tail2.next = head3;
				Node tail3=head3;
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt();   
					tail3.next = (new Node(c));
					tail3= tail3.next;
				}
				}
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(head1, head2));
			t--;			
         }
    }
}

// } Driver Code Ends


//solution
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         if( head1==null || head2==null )
            return -1;
            
         Node temp1=head1;
         Node temp2=head2;
         while( temp1!=temp2 )
         {
            temp1=( temp1==null )? head2 : temp1.next;
            temp2=( temp2==null )? head1 : temp2.next;
         }
         
        if( temp1==null || temp2==null )
            return -1;   
        else
            return temp1.data;
	}
}


