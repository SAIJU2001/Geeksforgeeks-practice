//gfg

/*  Insert an Element at the Bottom of a Stack
EasyAccuracy: 81.04%Submissions: 2K+Points: 2
Share your Interview, Campus or Work Experience to win GFG Swag Kits and much more!

You are given a stack St of N integers and an element X. You have to insert X at the bottom of the given stack.

Example 1:

Input:
N = 5
X = 2
St = {4,3,2,1,8}
Output:
{2,4,3,2,1,8}
Explanation:
After insertion of 2, the final stack will be {2,4,3,2,1,8}.
 

Example 2:

Input:
N = 3
X = 4
St = {5,3,1}
Output:
{4,5,3,1}
Explanation:
After insertion of 4, the final stack will be {4,5,3,1}.
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function insertAtBottom() which takes a stack St and an integer X  as inputs and returns the modified stack after insertion.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105
1 <= X, Elements of Stack <= 103
Sum of N over all test cases doesn't exceeds 106
*/

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class InsertElementAtBottomOfStack 
{
    static File file;
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String args[]) throws IOException 
    {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) 
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            s = in.readLine().trim().split(" ");
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) 
            {
                st.push(Integer.parseInt(s[i]));
            }
            Solution ob = new Solution();
            Stack<Integer> S = ob.insertAtBottom(st, x);
            for (int i : S) 
            {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) 
    {
        recursion( St,X);   //function call
        return St;
    }
    
    public void recursion( Stack<Integer> St, int X)
    {
        if( St.isEmpty() )
        {
            //when stack is empty element push to the stack
            St.push(X);
            return;
        }
        
        int top=St.pop();   //top element pop from the stack
        recursion( St,X);   //recursive call
        St.push(top);       //when return back from the recursive call push that top
    }
}