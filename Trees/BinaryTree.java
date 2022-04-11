package Trees;

import java.util.Scanner;

 class Node{
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    static Scanner scanner = new Scanner(System.in);

    public static Node createTree(){
        Node root = null;                              //    } NOT WORKING for        3
        System.out.println("Enter data:");             //                            / \
        int data = scanner.nextInt();                  //                           2   5
        if (data == -1) return null;                   //                          / \
        root = new Node(data);                         //                         1   4    (4<3)

        System.out.println("Left of "+data + ":");
        root.left = createTree();
        System.out.println("right of"+data + ":");
        root.right = createTree();

        return root;
    }
    static void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    static Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }else if (key<root.data)root.left = insertNode(root.left,key);
        else root.right=insertNode(root.right,key);
        return root;
    }

//    static boolean isBST(Node node) {
//        if (node == null)
//            return true;
//        if (node.left != null && node.left.data > node.data)
//            return false;
//        if (node.right != null && node.right.data < node.data)
//            return false;
//        if (!isBST(node.left) || !isBST(node.right))
//            return false;
//
//        return true;
//    } NOT WORKING for        3
//                            / \
//                           2   5
//                          / \
//                         1   4         (4<3)

    public static void main(String[] args) {
        Node root = createTree();
//        if (isBST(root)){
//            System.out.println("yes");
//        }
        insertNode(root,0);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }

}

