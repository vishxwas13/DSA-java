package LinkedLists;

import java.util.Scanner;

public class LinkedList {
 Node head;
    private int size;
    public LinkedList() {  //constructor
        this.size = 0;
    }



    class Node{
        String data;
        Node next;

        Node(String data){    //constructor
         this.data = data;
         this.next = null;
         size++;
        }
    }

    public void addNodeFirst(String data) {
         Node newnode = new Node(data);
         if (head == null) {
             newnode.next = null;
             head = newnode;
             return;
         }

         newnode.next = head;
         head = newnode;

    }
    public void addNodeLast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            newnode = null;
            head = newnode;
        }
        else {
            Node currentnode = head;
            while (currentnode.next!= null){
                currentnode = currentnode.next;
            }
            currentnode.next = newnode;
            newnode.next = null;
        }
    }

    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentnode = head;
        while(currentnode!= null){
            System.out.print(currentnode.data+ "->");
            currentnode = currentnode.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    public void addNode(String node, int pos){
        int count =0;
        Node newNode = new Node(node);
        Node currNode = head;
        while (count<pos-1){
            currNode = currNode.next;
            count++;
        }
        Node temp = currNode.next;
        currNode.next = newNode;
        newNode.next = temp;

    }

    public void deleteNode(int pos){
        int count = 1;
        Node currNode = head;
        while (count<pos-1){
            currNode = currNode.next;
            count++;
        }
        currNode.next = currNode.next.next;

    }



    public int getSize() {
        return size;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList List = new LinkedList();
        List.addNodeFirst("sharma");
        List.addNodeFirst("vishxwas");
//        List.printList();
//        List.printList();
        List.addNodeFirst("the");
        List.addNodeLast("is");
        List.addNodeLast("a");
        List.addNodeLast("great");
        List.addNode("man",List.getSize());
        List.printList();
        List.deleteFirst();
//        List.printList();
        List.deleteLast();
//        List.printList();
//        List.deleteLast();
//        List.printList();
//        List.printList();
        List.deleteNode(List.getSize()-3);
        List.printList();

        System.out.println( "Size --> " + List.getSize());



    }
}