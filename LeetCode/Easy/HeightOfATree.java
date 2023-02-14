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



public class HeightOfATree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        System.out.printf("%d %d\n", left, right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4));
        HeightOfATree h = new HeightOfATree();
        h.maxDepth(node);
    }
}
