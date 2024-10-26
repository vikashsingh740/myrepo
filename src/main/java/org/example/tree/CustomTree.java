package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class CustomTree {

    public TreeNode addNode(TreeNode root, int data) {
        TreeNode t = new TreeNode(data);
        if (root == null) {
            root = t;
        } else if (data < root.data) {
            root.left = t;
        } else {
            root.right = t;
        }
        return root;
    }

    public void bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            System.out.print(treeNode.data + " ");
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        System.out.println();
    }

    public void dfs1(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        dfs1(root.left);
        dfs1(root.right);
    }

    public int sumOfAllNode(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = sumOfAllNode(treeNode.left);
        int right = sumOfAllNode(treeNode.right);
        return treeNode.data + left + right;
    }

    public int sumOfAllEvenNode(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = sumOfAllEvenNode(treeNode.left);
        int right = sumOfAllEvenNode(treeNode.right);
        if (treeNode.data % 2 == 0) {
            return treeNode.data + left + right;
        } else {
            return left + right;
        }
    }

    public int countOfNodes(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int countLeft = countOfNodes(treeNode.left);
        int countRight = countOfNodes(treeNode.right);
        return countLeft + countRight + 1;
    }


    public int heightOfTree(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = heightOfTree(treeNode.left);
        int right = heightOfTree(treeNode.right);
        return Math.max(left, right) + 1;
    }

    public int diameterOfTree(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int d1 = diameterOfTree(treeNode.left);
        int d2 = diameterOfTree(treeNode.right);
        int d3 = heightOfTree(treeNode.left)+heightOfTree(treeNode.right)+1;
        return Math.max(d3,Math.max(d1,d2));
    }

    public TreeInfo findDiameterSecondApproach(TreeNode treeNode) {
        if (treeNode == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo treeInfo1 = findDiameterSecondApproach(treeNode.left);
        TreeInfo treeInfo2 = findDiameterSecondApproach(treeNode.right);
        int d1 = treeInfo1.dim;
        int d2 = treeInfo2.dim;
        int d3 = treeInfo1.ht + treeInfo2.ht + 1;
        int height = Math.max(treeInfo1.ht,treeInfo2.ht)+1;
        return new TreeInfo(height, Math.max(d3, Math.max(d1, d2)));
    }

    public boolean isSubTree(TreeNode root, TreeNode subRoot){
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root==null && subRoot==null){
            return true;
        }
        if (root==null || subRoot==null){
            return false;
        }
       if(root.data == subRoot.data){
           return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
       }
       return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(6);
        CustomTree customTree = new CustomTree();
        customTree.bfs(treeNode);
        customTree.dfs1(treeNode);
        System.out.println("=====Sum of All nodes =====");
        System.out.println(customTree.sumOfAllNode(treeNode));
        System.out.println("=====Height of tree =====");
        System.out.println(customTree.heightOfTree(treeNode));
        System.out.println("=====Sum of all even Node =====");
        System.out.println(customTree.sumOfAllEvenNode(treeNode));
        System.out.println("Count of Nodes ===> " + customTree.countOfNodes(treeNode));
        System.out.println("Diameter of tree ===> " + customTree.diameterOfTree(treeNode));
        System.out.println("Diameter of tree 2nd approach ===> " + customTree.findDiameterSecondApproach(treeNode).dim);

        TreeNode treeNode1 = new TreeNode(5);
        treeNode1.left = new TreeNode(4);
        treeNode1.right = new TreeNode(6);
        boolean isSubTree = customTree.isSubTree(treeNode, treeNode1);
        System.out.println("IsSubTree===>> "+isSubTree);
    }
}
