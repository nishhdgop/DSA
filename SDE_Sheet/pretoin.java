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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder==null || preorder==null|| preorder.length!=inorder.length){
            return null;
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length; ++i){
            hm.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,hm);
    }
    private TreeNode build(int inorder[],int is,int ie,int preorder[],int ps,int pe,HashMap<Integer,Integer> hm){
        if(ps>pe||is>ie)return null;

        TreeNode root = new TreeNode(preorder[ps]);
        int inRoot = hm.get(preorder[ps]);
        int numLeft = inRoot-is;
        root.left = build(inorder,is,inRoot-1,preorder,ps+1,ps+numLeft,hm);
        root.right = build(inorder,inRoot+1,ie,preorder,ps+numLeft+1,pe,hm);
        return root;
    }
}
