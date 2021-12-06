package com.codewithtejas.basic;

public class ValueInATree {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static int findClosestValueInBst(BST tree, int target) {

        return -1;
    }

    public static boolean findTarget(BST root, int target) {
        if (root == null) return false;
        if (root.value == target) return true;
        if (root.value > target) return findTarget(root.left, target);
        else return findTarget(root.right, target);
    }

    public static void main(String[] args) {
        var root = new ValueInATree.BST(10);
        root.left = new ValueInATree.BST(5);
        root.left.left = new ValueInATree.BST(2);
        root.left.left.left = new ValueInATree.BST(1);
        root.left.right = new ValueInATree.BST(5);
        root.right = new ValueInATree.BST(15);
        root.right.left = new ValueInATree.BST(13);
        root.right.left.right = new ValueInATree.BST(14);
        root.right.right = new ValueInATree.BST(22);

        var expected = 13;
        System.out.println(expected);
        var actual = ValueInATree.findClosestValueInBst(root, 12);
        System.out.println(actual);
    }
}
