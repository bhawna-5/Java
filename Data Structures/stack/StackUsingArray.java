package stack;

import java.util.Stack;

class stack {
    int size;

    int top = -1;
    int arr[];

    public stack(int n) {
        this.size = n;
        arr = new int[size];
    }

    void push(int n) {
        if (top == size - 1) System.out.println("stack overflow");
        top++;
        arr[top] = n;
    }

    int pop() {
        if (top < 0) System.out.println("stack underflow");
        int x=arr[top];
        top--;
        return x;
    }

    int peek() {
        if (top < 0) {
            System.out.println("no elements to present");
            return -1;
        }

        return arr[top];
    }

    int size() {
        int i = top + 1;
        return i;
    }

    void print() {
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
          //  System.out.println();

        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        stack st = new stack(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(1);
        st.push(7);
     //   st.print();
        System.out.println(st.pop());

        st.print();
    }
}
