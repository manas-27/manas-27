package Trees;

import java.util.Scanner;

class binaryTree {

    public binaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void pupulate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the value to left of " + node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter the value to left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the value to right of " + node.value);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter the value to right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
}
