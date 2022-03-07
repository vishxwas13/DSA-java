package Stacks;

import java.util.Scanner;

public class stackArray {
    int top;
    int[] array;
    int capacity;

    public stackArray(int capacity){
        this.capacity = capacity;
        top=-1;
         array = new int[capacity];
    }

     void push(int data) throws Exception {
        if(top == capacity-1){
            throw new Exception();
        }else {
            top++;
            array[top] = data;
        }
    }
    int pop() throws Exception {
        if (top == -1) {
            throw new Exception();
        }else {
            int pop = array[top];
            top--;
            return pop;

        }
    }

    void peak() throws Exception {
        if (top == -1) {
            throw new Exception();
        }else{
            int peak = array[top];
            System.out.println("peak is ==> " + peak);
        }
    }
    void isEmptyisfull()  {
        if (top==-1){
            System.out.println("Empty-->underflow");
        }if (top==capacity-1){
            System.out.println("full --> overflow");
        }else{
            System.out.println("neither empty nor full, size --> " + top );
        }
    }
    void printStack(){
        for (int i=top;i> -1;i--){
            System.out.print(" "+ array[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter capacity here: ");
//        int capacity = scan.nextInt();
        stackArray s = new stackArray(4);
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.printStack();
        s.pop();
        s.printStack();
        s.peak();
//        s.isEmptyisfull();


    }
}
