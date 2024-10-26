package org.example.bst;

import java.util.ArrayList;
import java.util.List;

public class BSTTree {

    public BSTNode add(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }
        if (data < root.data) {
            root.left = add(root.left, data);
        }
        if (data > root.data) {
            root.right = add(root.right, data);
        }
        return root;
    }

    public void inOrder(BSTNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print("===>> " + root.data + " ");
        inOrder(root.right);
    }

    public BSTNode delete(BSTNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        if (root.data == val) {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            // case 3
            // calculate inorder successor
            BSTNode IS = calculateInOrderSuccessor(root);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    private BSTNode calculateInOrderSuccessor(BSTNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void printBetween2Nums(BSTNode root, int x, int y){
        if (root==null){
            return;
        }
       if (root.data>=x && root.data<=y){
           printBetween2Nums(root.left,x,y);
           System.out.print("==> "+root.data);
           printBetween2Nums(root.right,x,y);
       } else if (root.data<x){
           printBetween2Nums(root.right,x,y);
       }else {
            printBetween2Nums(root.left,x,y);
       }
    }

    public void printAllPathToLeaf(BSTNode root, List<Integer> path){
        if (root==null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right==null){
            printPath(path);
            System.out.println();
        }else {
            printAllPathToLeaf(root.left,path);
            printAllPathToLeaf(root.right,path);
        }
       path.remove(path.size()-1);
    }

    private void printPath(List<Integer> path) {
        for (int x : path){
            System.out.print(x+"-->");
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 2, 3, 4, 5,8, 7};
        BSTTree bstTree = new BSTTree();
        BSTNode root = null;
        for (int x : a) {
            root = bstTree.add(root, x);
        }
        System.out.println(root.data);
        bstTree.inOrder(root);
        System.out.println("============================");
        BSTNode bstNode = bstTree.delete(root, 8);
        bstTree.inOrder(bstNode);
        System.out.println("============================");
        bstTree.printBetween2Nums(bstNode,3,7);
        System.out.println("============================");
        bstTree.printAllPathToLeaf(bstNode,new ArrayList<>());
    }
}

