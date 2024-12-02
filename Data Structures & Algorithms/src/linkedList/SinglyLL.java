package linkedList;

public class SinglyLL {

    node head;

    class node {
        node next;
        int data;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void print() {
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    void deleteFirst() {
        if (head == null) System.out.println("empty list");
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        if (head.next == null) {
            head = null;
            return;
        }
        node secondLast = head;
        node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.addfirst(10);
        ll.addLast(70);
        ll.addLast(80);
        ll.addLast(90);
        ll.addLast(20);
        ll.print();
        ll.deleteFirst();
        System.out.println();
        ll.print();
    }
}
