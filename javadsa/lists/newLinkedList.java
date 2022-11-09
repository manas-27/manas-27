class  Node{
    int data;
    Node next;
}

class Linkedlist{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n =head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;

        while(node.next != null){
            System.out.print(node.data+"-->");
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class newLinkedList {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insert(5);
        list.insert(10);
        list.insert(12);

        list.show();
    }
}
