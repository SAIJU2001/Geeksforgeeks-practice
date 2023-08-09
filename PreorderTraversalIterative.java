//gfg

/*  Preorder traversal (Iterative)
MediumAccuracy: 81.12%Submissions: 26K+Points: 4
Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
Given a binary tree. Find the preorder traversal of the tree without using recursion.

Example 1:

Input:
           1
         /   \
        2     3
      /  \
     4    5
Output: 1 2 4 5 3
Explanation:
Preorder traversal (Root->Left->Right) of 
the tree is 1 2 4 5 3.

Example 2

Input:
            8
          /   \
         1      5
          \    /  \
           7  10   6
            \  /
            10 6
Output: 8 1 7 10 5 10 6 6 
Explanation:
Preorder traversal (Root->Left->Right) 
of the tree is 8 1 7 10 5 10 6 6.
 
Your task:
You don't need to read input or print anything. Your task is to complete the function preOrder() which takes the root of the tree as input and returns a list containing the preorder traversal of the tree, calculated without using recursion.

Expected time complexity: O(N)
Expected auxiliary space: O(N)

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105
*/

//{ Driver Code Starts
//Initial Template for Java

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

class PreorderTraversalIterative 
{    
    static Node buildTree(String str)
    {    
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
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
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
  
	public static void main (String[] args) throws IOException
    {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0)
        {
	        String s = br.readLine();
    	    Node root = buildTree(s);
        	Tree g = new Tree();
            ArrayList<Integer> res = g.preOrder(root);
            for (int i = 0; i < res.size (); i++)
                System.out.print (res.get (i) + " ");
            System.out.print("\n");
            t--;
        }
    }
}
// } Driver Code Ends



class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        // Code
        ArrayList<Integer>list=new ArrayList<Integer>();    //to store the node values
        if( root==null )
        {
            return list;
        }
        
        Stack<Node>st=new Stack<>();    //stack is help to preorder
        st.push( root );
        
        while( !st.isEmpty() )
        {
            //everytime root is poped and added to the list
            root=st.pop();
            list.add( root.data );
            
            //then check left and right are nulls or not
            //if not null then the values added to the stack
            if( root.right!=null )
            {
                st.push( root.right );
            }
            if( root.left!=null )
            {
                st.push( root.left );
            }
        }
        return list;
    }    
}
