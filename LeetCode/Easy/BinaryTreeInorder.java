import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
class Solution {
    List<Integer> list = new ArrayList<>();

    void inorder(TreeNode node){
        if (node == null)
            return;

        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        Math.log()
        return list;
    }
}
