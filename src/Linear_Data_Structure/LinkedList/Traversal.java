package Linear_Data_Structure.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Traversal {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node lastNode = new Node(40);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = lastNode;

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}