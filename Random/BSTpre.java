/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode bst(int pre[],int ps,int pe,int in[],int is,int ie,HashMap<Integer,Integer>hm){
        if(is>ie||ps>pe)return null;
        TreeNode root = new TreeNode(pre[ps]);
        int inRoot = hm.get(pre[ps]);
        int numLeft = inRoot - is;
        root.left = bst(pre,ps+1,ps+numLeft,in,is,inRoot-1,hm);
        root.right = bst(pre,ps+numLeft+1,pe,in,inRoot+1,ie,hm);
        return root; 
    }
    public TreeNode bstFromPreorder(int[] pre) {
        if(pre.length==0)return null;
        int in[] = new int[pre.length];
        int j=0;
        for(int i:pre){
            in[j]=i;
            j++;
        }
        Arrays.sort(in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<in.length;i++){
            hm.put(in[i],i);
        }
       return bst(pre,0,pre.length-1,in,0,in.length-1,hm);
    }
}
