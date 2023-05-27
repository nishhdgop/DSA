//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int first;
    int second;
    Pair(int _f,int _s){
        first=_f;
        second=_s;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCheckCycle(int src,int V,ArrayList<ArrayList<Integer>> adj,boolean []vis){
        vis[src]=true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int adjn:adj.get(node)){
                if(vis[adjn]==false){
                    q.add(new Pair(adjn,node));
                    vis[adjn]=true;
                }else if(adjn != parent){
                    return true;
                }
            }
          
        }
          return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V+1];
        for(int i=1;i<=V;i++){
            vis[i]=false;
        }
        for(int i=0;i<V;i++){
            if(vis[i]==false)
            if(isCheckCycle(i,V,adj,vis)){
                return true;
            }
        }
        return false;
    }
}