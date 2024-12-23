package com.example.demo.interview;

public class Permute {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(8);
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode(11);
        left1.left = left2;
        TreeNode rightLeft = new TreeNode(13);
        TreeNode rightRight = new TreeNode(4);
        right1.left = rightLeft;
        right1.right = rightRight;

        TreeNode left2Left = new TreeNode(7);
        left2.left = left2Left;
        TreeNode left2Right = new TreeNode(2);
        left2.right = left2Right;
        TreeNode rightRightRight = new TreeNode(1);
        rightRight.right = rightRightRight;

        System.out.println(hasPathSum(root, 18));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum){
        return travelPath(root, targetSum, 0);
    }

    public static boolean travelPath(TreeNode root, int targetSum, int sum){
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left == null && root.right == null && sum == targetSum){
            return true;
        }
        return travelPath(root.left, targetSum, sum) || travelPath(root.right, targetSum, sum);
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
