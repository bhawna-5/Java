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
        node newNode=new node(data);
        if (head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }


    public static void main(String[] args) {

    }
}
