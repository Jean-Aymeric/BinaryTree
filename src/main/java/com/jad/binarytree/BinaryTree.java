package com.jad.binarytree;

public class BinaryTree<E extends Comparable<E>> {
    private BinaryNode<E> root;

    @SafeVarargs
    public final void add(final E... values) {
        for (final E value : values) {
            this.add(value);
        }
    }

    public final void add(final E value) {
        if (this.root == null) {
            this.root = new BinaryNode<>(value);
        } else {
            this.root.add(value);
        }
    }

    @Override
    public final String toString() {
        return "BinaryTree{" +
                "root=" + this.root +
                '}';
    }

    public final String toPrettyString() {
        if (this.root == null) return "";
        return this.root.toPrettyString();
    }

    public final String toTreeString() {
        if (this.root == null) return "";
        return this.root.toTreeString();
    }

    public final int getHeight() {
        if (this.root == null) return 0;
        return this.root.getHeight();
    }

    public final boolean isAVL() {
        return BinaryNode.isAVL(this.root);
    }

    public void testRotate() {
        this.root.rotateLeftLeftChild();
        this.root.rotateLeftLeftChild();
    }
}
