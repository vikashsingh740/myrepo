package org.general.binarytree;

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(pathSum(root,18));
    }

    public static boolean pathSum(TreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right==null) {
           return root.val == data;
        }
        int remaining = data- root.val;
        return pathSum(root.left,remaining) || pathSum(root.right,data- root.val);
    }
}
