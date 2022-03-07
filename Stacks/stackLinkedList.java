package Stacks;

import java.util.Scanner;

public class stackLinkedList {
    Node head;
//    int size = 0;
    static class Node {
        int data;
        Node next;


       Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void stackPush(int data) {
        Node temp = new Node(data);
        if (head ==null){
            head = temp;
        }
        else {
           Node temp2 = head;
           head = temp;
           temp.next = temp2;
//            size++;
//            System.out.println("pushed!");
        }
    }
    int stackPop(){
        int res = head.data;
        head = head.next;
        return res;
    }

    int stackPeek() {
        return head.data;
    }

    void stackDisplay() {
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(" " + currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stackLinkedList mystack = new stackLinkedList();
        mystack.stackPush(2);
        mystack.stackPush(3);
//        System.out.println("Top element is -->" + mystack.stackPeek());
//        mystack.stackDisplay();
        mystack.stackPush(4);
        mystack.stackPush(5);
        mystack.stackDisplay();
        mystack.stackPop();
//        System.out.println("Top element is -->" + mystack.stackPeek());
//        mystack.stackDisplay();
        mystack.stackPop();
//        System.out.println("Top element is -->" + mystack.stackPeek());
        mystack.stackDisplay();
//        System.out.println("Top element is -->" + mystack.stackPeek());
//        mystack.stackPush(0);
        System.out.println("Top element is -->" + mystack.stackPeek());
//        mystack.stackDisplay();

    }
}
