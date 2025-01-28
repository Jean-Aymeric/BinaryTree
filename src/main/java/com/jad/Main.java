package com.jad;

import com.jad.binarytree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> myBinaryTree = new BinaryTree<>();
        myBinaryTree.add(5, 3, 7, 2, 4, 6, 9, 8, 10);
        System.out.println(myBinaryTree.toTreeString());
        myBinaryTree.testRotate();
        System.out.println(myBinaryTree.toTreeString());
    }
}