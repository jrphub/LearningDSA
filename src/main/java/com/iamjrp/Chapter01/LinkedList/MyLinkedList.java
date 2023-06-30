package com.iamjrp.Chapter01.LinkedList;

import java.util.LinkedList;

public class MyLinkedList<T extends Comparable<T>> implements Cloneable {

    private Node<T> head = null;

    public MyLinkedList(Node<T> head) {
        this.head = head;
    }
}
