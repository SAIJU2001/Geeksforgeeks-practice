//gfg

/*      Common elements
EasyAccuracy: 22.16%Submissions: 303K+Points: 2
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function commonElements() which take the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing the common element present in all the 3 arrays in sorted order. 
If there are no such elements return an empty array. In this case the output will be printed as -1.

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

Constraints:
1 <= n1, n2, n3 <= 10^5
The array elements can be both positive or negative integers.
*/

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class CommonElements
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        //linked hashset is same as hashset but in the linked hashset the input output manner is same
        int i=0,j=0,k=0;
        
        while( i<n1 && j<n2 && k<n3 )
        {
            if( A[i]==B[j] && B[j]==C[k] )
            {
                //if they are equal then push to the set
                set.add( A[i] );
                i++;
                j++;
                k++;
            }
            //which array element is small increase that array index
            else if( A[i]<=B[j] && A[i]<=C[k] )
            {
                i++;
            }
            else if( B[j]<=A[i] && B[j]<=C[k] )
            {
                j++;
            }
            else
            {
                k++;
            }
        }
        
        //result store to the arraylist and return
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
}
