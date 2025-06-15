package org.general.binarytree;

public class MaximumDepthOfBinaryTree {

    public static int maximumDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int leftHeight = maximumDepth(treeNode.left);
        int rightHeight = maximumDepth(treeNode.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(25);
        treeNode.left.right = new TreeNode(35);
        treeNode.right.left = new TreeNode(32);
        treeNode.right.right = new TreeNode(40);
        System.out.println(maximumDepth(treeNode));
    }
}
