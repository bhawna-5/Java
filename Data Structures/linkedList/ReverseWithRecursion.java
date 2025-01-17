package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseWithRecursion {
    Node head;

    // Function to reverse the list recursively
    Node reverse(Node head) {
        // Base case: if list is empty or single node
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node front = head.next;
        // Reverse the links
        front.next = head;
        head.next = null;
        return newHead; // Return the new head of the reversed list
    }

    // Helper function to print the list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseWithRecursion list = new ReverseWithRecursion();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original List:");
        list.printList(list.head);

        // Reverse the list
        list.head = list.reverse(list.head);

        System.out.println("Reversed List:");
        list.printList(list.head);
    }

}
