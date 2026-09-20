package Linear_Data_Structure.LinkedList;

public class insertion {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node lastNode = new Node(40);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = lastNode;

        Node newNode = new Node(5);

        lastNode.next = newNode;

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
