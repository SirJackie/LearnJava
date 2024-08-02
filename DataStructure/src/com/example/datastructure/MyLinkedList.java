package com.example.datastructure;

public class MyLinkedList {

    // Use Inner Class to Avoid a Separated Java File (LLNode.java)
    public class LLNode{
        public String data;
        public LLNode next;

        public LLNode() {
            ;
        }

        public LLNode(String data, LLNode next) {
            this.data = data;
            this.next = next;
        }
    }

    LLNode head;
    int size;

    public MyLinkedList() {
        this.head = new LLNode(null, null);
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(String item) {
        LLNode iterator = head;
        for (int i = 0; i < size; i++){
            iterator = iterator.next;
        }

        LLNode last = iterator;
        last.next = new LLNode(item, null);
        size++;
    }

    public String get(int index) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new Exception("MyLinkedList read out of bound.");
        }

        LLNode iterator = head;
        for(int i = 0; i <= index; i++){
            iterator = iterator.next;
        }

        return iterator.data;
    }

    public void set(int index, String item) throws Exception {
        if(index < 0 || index > size - 1){
            throw new Exception("MyLinkedList written out of bound.");
        }

        LLNode iterator = head;
        for (int i = 0; i <= index; i++){
            iterator = iterator.next;
        }

        iterator.data = item;
    }

    public void insert(int index, String item) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new Exception("MyLinkedList inserted out of bound.");
        }

        LLNode iterator = head;
        for (int i = 0; i < index; i++){
            iterator = iterator.next;
        }

        LLNode originalNode = iterator.next;
        iterator.next = new LLNode(item, originalNode);

        size++;
    }

    public String delete(int index) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new Exception("MyLinkedList deleted out of bound.");
        }

        LLNode iterator = head;
        for (int i = 0; i < index; i++) {
            iterator = iterator.next;
        }

        LLNode deletedNode = iterator.next;
        iterator.next = deletedNode.next;
        size--;

        return deletedNode.data;
    }
}
