/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        String res = "";
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
            res+="n ";
            continue;
            }
            else{
                res+=""+curr.val+" ";

            }
            q.add(curr.left);
            q.add(curr.right);
        }
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        String val[]=data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        for(int i=1;i<val.length;++i){
            TreeNode root1 = q.poll();
            if(!val[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(val[i]));
                root1.left = left;
                q.add(left);
            }
            if(!val[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(val[i]));
                root1.right =right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
