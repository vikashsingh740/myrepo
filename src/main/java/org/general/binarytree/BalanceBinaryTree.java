package org.general.binarytree;

public class BalanceBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(isBalance(root));
    }

    public static boolean isBalance(TreeNode root){
        return height(root)!=-1;
    }

    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight-rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
