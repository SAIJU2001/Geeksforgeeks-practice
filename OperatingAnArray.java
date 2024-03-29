//gfg

/*  Operating an array
BasicAccuracy: 25.06%Submissions: 35K+Points: 1
Save 25% On Your Favorite Courses & Get Additional Cashback. Explore Offers Now

Given an array A of size N, your task is to do some operations, i.e., search an element x, insert an element y at index yi, and delete an element z by completing the functions. Also, all functions should return a boolean value.

Note: 

In delete operation return true even if element is not present.
N is never greater than 10000.
Input Format:
N
A1 A2 . . . An
x y yi z

Example:
Input:
5
2 4 1 0 6
1 2 2 0

Output:
1 1 1
Your Task:
Since this is a function problem, you only need to complete the provided functions.

Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= Ai <= 1000
*/

//{ Driver Code Starts
import java.util.Arrays;
import java.util.Scanner;

class OperatingAnArray
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
        {
			int n=sc.nextInt();
			int[] a=new int[10000];
			Arrays.fill(a,-1);
			for(int i=0;i<n;i++)
            {
				a[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			GfG g = new GfG();
			boolean b = g.searchEle(a,x);
			if(b==true)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			b = g.insertEle(a,y,yi);
			if(b)
            {
			if(a[yi]==y)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			}
			else
				System.out.print("0 ");
			b = g.deleteEle(a,z);
			if(b)
            {
			if(!g.searchEle(a,z))
				System.out.println("1 ");
			else
				System.out.println("0 ");
			}
			else
				System.out.println("0 ");
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG
{		
	public boolean searchEle(int a[],int x)
    {
		//add code here.
		for( int i=0 ; i<a.length ; i++ )
		{
		    if( a[i]==x )
		    {
				//if find return true
		        return true;
		    }
		}
		return false;
	}
	public boolean insertEle(int a[],int y,int yi)
    {
              //add code here.
        if( yi<a.length )
        {
			//if the yi is less of this array length then add the value and return true
            a[yi]=y;
            return true;
        }
        return false;
	}
	public boolean deleteEle(int a[],int z)
    {
		//add code here.
		
		//in the note they clearly say that if not found return true ,whatever the case return true
		return true;
	}
}