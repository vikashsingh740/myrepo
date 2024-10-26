package org.example.treerevise;

import java.util.LinkedList;
import java.util.Queue;

public class TreeExample {

    public void inOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void dfs(TreeNode1 root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        dfs(root.left);
        dfs(root.right);
    }

    public void bfs(TreeNode1 root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode1 treeNode1 = queue.poll();
            System.out.print(treeNode1.data + " ");
            if (treeNode1.left!=null){
                queue.add(treeNode1.left);
            }
            if (treeNode1.right!=null){
                queue.add(treeNode1.right);
            }
        }
    }

    public int sumOfAllNodes(TreeNode1 treeNode1) {
        if (treeNode1 == null) {
            return 0;
        }
        int leftSum = sumOfAllNodes(treeNode1.left);
        int rightSum = sumOfAllNodes(treeNode1.right);
        return leftSum + rightSum + treeNode1.data;
    }

    public int heightOfTree(TreeNode1 treeNode1) {
        if (treeNode1 == null) {
            return 0;
        }
        int leftHeight = heightOfTree(treeNode1.left);
        int rightHeight = heightOfTree(treeNode1.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int countOfNodes(TreeNode1 treeNode1) {
        if (treeNode1 == null) {
            return 0;
        }
        int leftCount = countOfNodes(treeNode1.left);
        int rightCount = countOfNodes(treeNode1.right);
        return leftCount+rightCount + 1;
    }

    public int diameter(TreeNode1 treeNode1){
        if (treeNode1==null){
            return 0;
        }
        int d1 = diameter(treeNode1.left);
        int d2 = diameter(treeNode1.right);
        int d3 = heightOfTree(treeNode1.left) + heightOfTree(treeNode1.right)+1;
        return Math.max(d1,Math.max(d2,d3));
    }

    public TreeInfo1 secondApproachDiameter(TreeNode1 treeNode1){
        if (treeNode1==null){
            return new TreeInfo1(0,0);
        }
        TreeInfo1 treeInfo1 = secondApproachDiameter(treeNode1.left);
        TreeInfo1 treeInfo2 = secondApproachDiameter(treeNode1.right);
        int d1 = treeInfo1.dim;
        int d2 = treeInfo2.dim;
        int d3 = treeInfo1.ht + treeInfo2.ht +1;
        int height = Math.max(treeInfo1.ht,treeInfo2.ht)+1;
        return new TreeInfo1(Math.max(d1,Math.max(d2,d3)),height);
    }

    public boolean isSubTree(TreeNode1 root, TreeNode1 subRoot) {
        if (subRoot == null){
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode1 root, TreeNode1 subRoot) {
        if (root == null && subRoot==null) {
            return true;
        }
        if (root == null || subRoot == null) {
           return false;
        }
        if (root.data == subRoot.data){
            return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode1 treeNode1 = new TreeNode1(20);
        treeNode1.left = new TreeNode1(15);
        treeNode1.right = new TreeNode1(25);
        treeNode1.left.left = new TreeNode1(10);
        treeNode1.left.right = new TreeNode1(18);
        treeNode1.right.left = new TreeNode1(23);
        treeNode1.right.right = new TreeNode1(26);
        TreeExample treeExample = new TreeExample();
        treeExample.inOrder(treeNode1);
        System.out.println("========================");
        treeExample.preOrder(treeNode1);
        System.out.println("========================");
        treeExample.postOrder(treeNode1);
        System.out.println("========================");
        treeExample.dfs(treeNode1);
        System.out.println("========================");
        treeExample.bfs(treeNode1);
        System.out.println("========================");
        System.out.println("Sum of All nodes "+treeExample.sumOfAllNodes(treeNode1));
        System.out.println("========================");
        System.out.println("Height of tree "+treeExample.heightOfTree(treeNode1));
        System.out.println("========================");
        System.out.println("count of Node "+treeExample.countOfNodes(treeNode1));
        System.out.println("========================");
        System.out.println("Dim "+treeExample.diameter(treeNode1));
        System.out.println("========================");
        System.out.println("Dim2ndApproach "+treeExample.secondApproachDiameter(treeNode1).dim);
        TreeNode1 treeNode11 = new TreeNode1(15);
        treeNode11.left =  new TreeNode1(10);
        treeNode11.right =  new TreeNode1(18);
        System.out.println("========================");
        System.out.println("SubTree "+ treeExample.isSubTree(treeNode1,treeNode11));
    }
}
