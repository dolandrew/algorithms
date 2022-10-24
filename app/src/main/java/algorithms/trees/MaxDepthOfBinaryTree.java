package algorithms.trees;

class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        // if no node here
        if (root == null) {
            // return 0 up the stack
            return 0;
        }
        
        // go left, until the base case, return the value
        int left = maxDepth(root.left);
        // go right until the base case, return the value
        int right = maxDepth(root.right);

        // done recursion, do the following on the way back up
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxDepth(root));
    }}