package DataStructures;

import java.util.NoSuchElementException;

public class MyLinkedList <E> {

    private ListNode<E> head;
    private ListNode<E> tail;
    public int size;

    public MyLinkedList () {
        size = 0;
        head = new ListNode<E>(null);
        tail = new ListNode<E>(null);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Adds the node at the end of the list
     * @param data the data to be put into the node
     */
    public void add(E data) {
        ListNode<E> node = new ListNode<E>(data);
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
        size++;
    }

    /**
     * Adds the node at the front of linked list. Stack Push function
     * @param data the data to be put into the node
     */
    public void addFront(E data) {
        ListNode<E> node = new ListNode<E>(data);
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
        size++;
    }

    /**
     * Returns the value of front node and Deletes the node. Stack pop function
     */
    public E deleteFront() {
        if (head.next != tail) {
            ListNode<E> node = head.next;
            node.next.prev = node.prev;
            head.next = node.next;
            node.next = null;
            node.prev = null;
            size--;
            return node.data;
        } else {
            throw new NullPointerException();
        }
    }

    /**
     * @param position index of the object to be deleted
     */
    public E deletePosition(int position) {
        int pos, i;
        ListNode<E> node;
        if (position > size/2){
            pos = size - position - 1;
            node = tail;
            for (i = 0; i <= pos; i++){
                node = node.prev;
            }
            breakLinks(node);
            return node.data;
        } else {
            pos = position;
            node = head;
            for (i = 0; i <= pos; i++){
                node = node.next;
            }
            breakLinks(node);
            return node.data;
        }
    }

    private void breakLinks(ListNode<E> node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
        size--;
    }

    /**
     * @param position Get data from particular position
     * @return The data of type E at index 'position'
     */
    public E get(int position) {

        if (position >= 0 && position < size){
            int pos, i;
            ListNode<E> node;
            if (position > (size-1)/2){
                pos = size - position - 1;
                node = tail;
                for (i = 0; i <= pos; i++){
                    node = node.prev;
                }
                return node.data;
            } else {
                pos = position;
                node = head;
                for (i = 0; i <= pos; i++){
                    node = node.next;
                }
                return node.data;
            }

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public E getLast() {
        if (tail.prev != head) {
            return tail.prev.data;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Insert a data at a particular position
     * @param data data field of the node to be inserted
     * @param position Position at which data is to be inserted
     */
    public void insert(E data, int position) {
        if (position < size){
            ListNode<E> node = new ListNode<E>(data);
            ListNode<E> refNode = head;
            for (int i = 0; i < position -1; i++){
                refNode = refNode.next;
            }
            node.prev = refNode;
            node.next = refNode.next;
            refNode.next = node;
            node.next.prev = node;
        } else {
            throw new IndexOutOfBoundsException();
        }

    }

    /**
     * Get the index of a particular object
     * @param data object whose index needs to found
     * @return index in the list. -1 if object is not present
     */
    public int indexOf(E data) {
        int i;
        ListNode<E> node = head.next;
        for (i = 0; i < size; i++) {
            if (data.equals(node.data)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }
}
