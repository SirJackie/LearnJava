package com.example.datastructure;

public class MyArrQueue {
    private String[] data;
    private int front;
    private int rear;

    public MyArrQueue(int length) {
        data = new String[length];
        front = 0;
        rear = 0;
    }

    public int getSize(){
        if (rear >= front) {
            return rear - front;
        } else {
            return rear + data.length - front;
        }
    }

    public void enqueue(String item) throws Exception {
        if ( (rear + 1) % data.length == front ){
            // throw new Exception("MyArrQueue is full.");
            this.ExpandLength();
        }

        data[rear] = item;
        rear = (rear + 1) % data.length;
    }

    public String dequeue() throws Exception {
        if (rear == front) {
            throw new Exception("MyArrQueue is Empty, Nothing to Dequeue.");
        }

        String dequeuedItem = data[front];
        front = (front + 1) % data.length;
        return dequeuedItem;
    }

    public String get(int index) throws Exception {
        int criteriaLeft  = (front + index) % data.length;
        int criteriaRight = rear > criteriaLeft ? rear : rear + data.length;

        if ( criteriaLeft < criteriaRight ){
            return data[criteriaLeft];
        } else {
            throw new Exception("MyArrQueue read out of bound.");
        }
    }

    public void Inspect() {
        for (int i = front; i != rear; i = (i + 1) % data.length) {
            System.out.println(data[i]);
        }
    }

    public void ExpandLength() throws Exception {
        // Save Old Queue
        MyArrQueue oldQueue = new MyArrQueue(0);
        oldQueue.data = this.data;
        oldQueue.front = this.front;
        oldQueue.rear = this.rear;

        // Create New Queue
        this.data = new String[oldQueue.data.length * 2];
        this.front = 0;
        this.rear = 0;

        for (int i = oldQueue.front; i != oldQueue.rear; i = (i + 1) % oldQueue.data.length) {
            this.enqueue(oldQueue.data[i]);
        }
    }
}
