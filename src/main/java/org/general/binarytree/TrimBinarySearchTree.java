package org.general.binarytree;

public class TrimBinarySearchTree {

    public TreeNode trimBinarySearchTree(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            return trimBinarySearchTree(root.left, low, high);
        }
        if (root.val > high) {
            return trimBinarySearchTree(root.right, low, high);
        }
        root.left = trimBinarySearchTree(root.left, low, high);
        root.right = trimBinarySearchTree(root.right, low, high);
        return root;
    }
    public static void main(String[] args) {

    }
}
