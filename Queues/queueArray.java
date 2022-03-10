package Queues;

import java.util.Scanner;

public class queueArray {
    int front, rear;
    int capacity;
    int array[];
    public queueArray(int capacity) {
        this.capacity = capacity;
         array = new int[capacity];
         rear =0;
    }

    public void enqueue(int data) throws Exception {
        if (rear == capacity) {
            throw new Exception();
        }else {

            array[rear] = data;
            rear++;

        }
    }

    public int dequeue() throws Exception {
        if (rear == 0) {
            throw new Exception();
        }

        int temp = array[0];
        for (int i = 0; i<rear-1;i++){
            array[i] = array[i + 1];
        }
        rear--;
        return temp;

    }

    public void queueDisplay() {
        for (int i = 0; i<rear;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        int capacity = scan.nextInt();
        queueArray queue = new queueArray(7);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.queueDisplay();
        queue.dequeue();
        queue.queueDisplay();
//        System.out.println(queue.dequeue());
//        queue.queueDisplay();
        queue.dequeue();
        queue.queueDisplay();
        queue.enqueue(0);
        queue.queueDisplay();
    }

}
