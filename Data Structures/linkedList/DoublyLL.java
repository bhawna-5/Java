package linkedList;

public class DoublyLL {
    node head;

    class node {
        node next;
        node prev;
        int data;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertFirst(int data) {
        node newNode = new node(data);


        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int data) {
        node newNode = new node(data);
        node temp = head;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) head = null;
        else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public node find(int value) {
        node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void print() {
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.insertFirst(12);
        obj.insertLast(13);
        //obj.deleteLast();
        obj.find(12);
        obj.print();
    }
}
