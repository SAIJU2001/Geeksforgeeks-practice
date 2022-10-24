/*          Stepping Numbers
A number is called a stepping number if all adjacent digits have an absolute difference of 1, e.g. '321' is a Stepping Number while 421 is not. Given two integers n and m, find the count of all the stepping numbers in the range [n, m].

Example 1:
Input: n = 0, m = 21
Output: 13
Explanation: Stepping no's are 0 1 2 3 4 5
6 7 8 9 10 12 21

Example 2:
Input: n = 10, m = 15
Output: 2
Explanation: Stepping no's are 10, 12

Your Task:  
You don't need to read input or print anything. Your task is to complete the function steppingNumbers() which takes the integer n and integer m as input parameters and returns the number of stepping numbers in the range between n and m.

Expected Time Complexity: O(log(M))
Expected Auxiliary Space: O(SN) where SN is the number of stepping numbers in the range

Constraints:
0 ≤ N < M ≤ 107             */


//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class SteppingNumbers
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int countSteppingNumbers(int x)
    {
        Queue<Integer> queue = new ArrayDeque<>();
        
        if(x<0) return 0;
        if(x<10) return x + 1;
        
        for(int i=1; i<10; i++) 
            queue.add(i);
        
        int count = 1;
        
        while(queue.isEmpty()==false)
        {
            int num = queue.poll();
            count++;
            
            int num1 = num*10 + (num%10+1);
            int num2 = num*10 + (num%10-1);
            
            if(num%10==0)
            {
                if(num1<=x) queue.add(num1);
            }
            else if(num%10==9)
            {
                if(num2<=x) queue.add(num2);
            }
            else
            {
                if(num1<=x) queue.add(num1);
                if(num2<=x) queue.add(num2);
            }
        }
        return count;
    }
    
    int steppingNumbers(int n, int m)
    {
        return countSteppingNumbers(m) - countSteppingNumbers(n-1);
        
    }   
}
