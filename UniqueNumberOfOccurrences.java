//gfg

/*  Unique Number of Occurrences
EasyAccuracy: 72.65%Submissions: 6K+Points: 2
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
Given an array arr of N integers, the task is to check whether the frequency of the elements in the array is unique or not. Or in other words, there are no two distinct numbers in array with equal frequency. If all the frequency is unique then return true, else return false.

Example 1:

Input:
N = 5
arr = [1, 1, 2, 5, 5]
Output:
false
Explanation:
The array contains 2 (1’s), 1 (2’s) and 2 (5’s), since the number of frequency of 1 and 5 are the same i.e. 2 times. Therefore, this array does not satisfy the condition.
Example 2:

Input:
N = 10
arr = [2, 2, 5, 10, 1, 2, 10, 5, 10, 2]
Output:
true
Explanation:
Number of 1’s -> 1
Number of 2’s -> 4
Number of 5’s -> 2
Number of 10’s -> 3.
Since, the number of occurrences of elements present in the array is unique. Therefore, this array satisfy the condition.
Your task:
You don't need to read input or print anything. Your task is to complete the function isFrequencyUnique() which take integer N and array arr of size N as arguments, and returns a boolean.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <=105
-109 <= arr[i] <= 109
*/


//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class UniqueNumberOfOccurrences 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {    
            int n;
            n = Integer.parseInt(br.readLine());
             
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.isFrequencyUnique(n, arr);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}
// } Driver Code Ends


//solution for the problem
class Solution 
{
    public static boolean isFrequencyUnique(int n, int[] arr) 
    {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for( int i=0 ; i<n ; i++ )
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for( Integer i : map.keySet() )
        {
            if( !set.add(map.get(i)))
                return false;
        }
        return true;
    }
}
        

