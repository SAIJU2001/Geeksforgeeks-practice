//gfg

/*      Determine if Two Trees are Identical
EasyAccuracy: 50.01%Submissions: 199K+Points: 2
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
Given two binary trees, the task is to find if both of them are identical or not. 

Example 1:
Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.

Example 2:
Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.

Your task:
Since this is a functional problem you don't have to worry about input, you just have to complete the function isIdentical() that takes two roots as parameters and returns true or false. The printing is done by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= Number of nodes <= 105
1 <=Data of a node <= 105
*/

//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class DetermineIfTwoTreesAreIdentical
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N')
        {
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) 
        {    
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) 
            {        
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
        
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) 
            {        
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        } 
        return root;
    }

    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException
    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0)
            {
	            String s1 = br.readLine();
    	    	String s2 = br.readLine();
    	    	Node root1 = buildTree(s1);
    	    	Node root2 = buildTree(s2);
                Solution g = new Solution();
            //System.out.println(g.isIdentical(root,roott));
			    boolean b = g.isIdentical(root1,root2);
			    if(b==true)
				    System.out.println("Yes");
			    else
				    System.out.println("No");
	        }
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if( root1==null || root2==null )
	    {
            //if anyone or both null compare two nodes and return
	        return root1==root2;
	    }
	    
        //check two nodes data are same or not
        //call for the left check with left and right check with right
	    return ( root1.data==root2.data )&&( isIdentical( root1.left, root2.left ) )&&( isIdentical( root1.right, root2.right ) );
	}	
}

