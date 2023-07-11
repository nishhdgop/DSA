//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	ArrayList<Integer> al = new ArrayList<>();
	boolean seen[][] = new boolean[n][m];
	int dr[]={0,1,0,-1};
	int dc[]={1,0,-1,0};
	int x=0,y=0,di=0;
	for(int i=0;i<m*n;i++){
	    al.add(A[x][y]);
	    seen[x][y]=true;
	    int cr=x+dr[di];
	    int cc=y+dc[di];
	    if(0<=cr && cr<n && 0<=cc && cc<m && !seen[cr][cc]){
	        x=cr;
	        y=cc;
	    }else{
	        di=(di+1)%4;
	        x+=dr[di];
	        y+=dc[di];
	    }
	}
	return al.get(k-1);
    }
}