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
    boolean Check(TreeNode l, TreeNode r){
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;

        return l.val == r.val && Check(l.left, r.right) && Check(l.right, r.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return Check(root.left, root.right);        
    }
}