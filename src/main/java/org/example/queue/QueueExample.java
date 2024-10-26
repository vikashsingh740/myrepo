package org.example.queue;

public class QueueExample {

    int[] intArray;
    int rear = -1;
    int size;

    QueueExample(int n) {
        intArray = new int[n];
        this.size = n;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public void add(int data) {
       if (rear==size-1){
          System.out.println("Queue is full");
          return;
       }
       rear++;
       intArray[rear] = data;
    }

    public int remove() {
        if (isEmpty()){
            return -1;
        }
        int front = intArray[0];
        for (int i=0;i<rear;i++){
            intArray[i]=intArray[i+1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()){
            return -1;
        }
        return intArray[0];
    }

    public static void main(String[] args) {
        QueueExample queueExample = new QueueExample(4);
        queueExample.add(10);
        queueExample.add(20);
        queueExample.add(30);
        queueExample.add(40);
        while (!queueExample.isEmpty()){
            System.out.print("===>> "+queueExample.remove());
        }
    }
}
