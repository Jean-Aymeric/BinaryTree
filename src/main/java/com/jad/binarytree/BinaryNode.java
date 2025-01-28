package com.jad.binarytree;

import lombok.Data;

@Data
class BinaryNode<E extends Comparable<E>> {
    private E value;
    private BinaryNode<E> left;
    private BinaryNode<E> right;

    BinaryNode(final E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    BinaryNode<E> add(final E value) {
        switch (value.compareTo(this.value)) {
            case 1 -> {
                this.right = this.add(this.right, value);
                return this.right;
            }
            case -1 -> {
                this.left = this.add(this.left, value);
                return this.left;
            }
        }
        return this;
    }

    private BinaryNode<E> add(final BinaryNode<E> child, final E value) {
        if (child == null) return new BinaryNode<>(value);
        child.add(value);
        return child;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + this.getValue() +
                ", left=" + this.getLeft() +
                ", right=" + this.getRight() +
                '}';
    }

    String toPrettyString() {
        return "[" + this.value +
                (((this.left == null) && (this.right == null)) ? "" :
                        "(" + ((this.left == null) ? "-" : this.left.toPrettyString()) +
                                ", " + ((this.right == null) ? "-" : this.right.toPrettyString()) + ")") + "]";
    }
}
