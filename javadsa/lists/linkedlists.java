package javadsa.lists;

public class linkedlists {

    // Creation of Node
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding element at first
    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // Adding element at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // printing a list
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;

    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secLast = secLast.next;
        }

        secLast.next = null;

    }

    public static void main(String[] args) {
        linkedlists list = new linkedlists();
        list.addfirst(2);
        list.printList();

        list.addfirst(1);
        list.printList();

        list.addLast(3);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }
}
