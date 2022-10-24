package algorithms.trees;

class PathSum {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // base case
        if (root == null) return false;
        
        //on each recursion, subtract value from targetSum
        targetSum -= root.val;
        // if leaf node, return if targetSum depleted to 0
        if (root.left == null & root.right ==null) return targetSum==0;

        // recurse until base case passing targetSum along
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
    
    
//     public boolean hasPathSum(TreeNode root, int sum) {
//         if(root==null)return false;
//         sum = sum - root.val;
//         if(root.left==null && root.right==null){
//             if(sum == 0)return true;
//             else return false;
//         }
//         return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
        
        
//     }
    
}