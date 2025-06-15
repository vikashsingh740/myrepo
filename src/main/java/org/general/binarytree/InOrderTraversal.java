package org.general.binarytree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode treeNode) {
        List<Integer> result = new ArrayList<>();
        helper(treeNode, result);
        return result;
    }

    public void helper(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        helper(treeNode.left, result);
        result.add(treeNode.val);
        helper(treeNode.right, result);
    }

    public static void main(String[] args) {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(30);
        treeNode.left.left = new TreeNode(25);
        treeNode.left.right = new TreeNode(35);
        treeNode.right.left = new TreeNode(32);
        treeNode.right.right = new TreeNode(40);
        List<Integer> list = inOrderTraversal.inorderTraversal(treeNode);
        System.out.println(list);
    }
}