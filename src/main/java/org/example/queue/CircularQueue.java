package org.example.queue;

public class CircularQueue {
    int[] intArray;
    int rear = -1;
    int front = -1;
    int size;

    public CircularQueue(int n) {
       intArray = new int[n];
       size = n;
    }

    public boolean isEmpty(){
       return rear==-1 && front==-1;
    }

    public void add(int data){
       if (isFull()){
           System.out.println("Queue is full");
           return;
       }
       if (front==-1){
           front=0;
       }
        rear = (rear+1)%size;
        intArray[rear] = data;
    }

    private boolean isFull() {
        return (rear + 1) % size == front;
    }

    public int remove(){
        if (isEmpty()){
            return -1;
        }
        int data = intArray[front];
        //single element condition
        if (front == rear){
            front=-1;
            rear = -1;
        } else {
           front = (front+1)%size;
        }
        return data;
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return intArray[front];
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.add(10);
        circularQueue.add(20);
        circularQueue.add(30);
        circularQueue.add(40);
        while (!circularQueue.isEmpty()){
            System.out.print("===>> "+circularQueue.remove());
        }
    }
}
