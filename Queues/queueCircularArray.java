package Queues;

import java.util.Scanner;

public class queueCircularArray {
    int front = 0 , rear = 0;
    int capacity;
    int array[];
    public queueCircularArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];

    }

    public void enqueue(int data) throws Exception {
        if ((rear+1)% capacity == front) {
            System.out.println("jnjn");
            return;
        }
        if (front == 0) {
            front = 1;
        }
        rear = (rear + 1)% capacity;
        array[rear] = data;
    }

    public int dequeue() throws Exception {
        if (rear == 0) {
            throw new Exception();
        }

        int temp = array[front];
        if (front == rear) {
            front = rear = 0;
        } else {
            front = (front+1)%capacity;
        }
        return temp;

    }

    public void queueDisplay() {
        for (int i = front; i<=rear;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        int capacity = scan.nextInt();
        queueCircularArray queueC = new queueCircularArray(7);
        queueC.enqueue(1);
        queueC.enqueue(2);
        queueC.enqueue(3);
        queueC.enqueue(4);
        queueC.enqueue(5);
        queueC.queueDisplay();
        queueC.dequeue();
        queueC.queueDisplay();
//        System.out.println(queue.dequeue());
//        queueC.queueDisplay();
        queueC.dequeue();
        queueC.queueDisplay();
        queueC.enqueue(0);
        queueC.queueDisplay();
    }

}
