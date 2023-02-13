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
    TreeNode getNode(int[] nums, int l, int r){
        if (r < l) return null;
        int m = (l + r) / 2;

        TreeNode newNode = new TreeNode(nums[m]);
        newNode.left = getNode(nums, l, m - 1);
        newNode.right = getNode(nums, m + 1, r);

        return newNode;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return getNode(nums, 0, nums.length - 1);
    }
}