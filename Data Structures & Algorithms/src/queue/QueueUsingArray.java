package queue;

public class QueueUsingArray {
    int start, end;
    int[] arr;
    int currSize;
    int maxSize;

    public QueueUsingArray(int maxSize) {
        this.maxSize = maxSize;
        start = -1;
        end = -1;
        arr = new int[maxSize];
        currSize = 0;
    }

    void push(int n) {
        if (currSize == maxSize) {
            System.out.println("stack overflow");
        }
        if (end == -1) {
            start = end = 0;
        } else {
            end = (end + 1) % maxSize;
        }
        arr[end] = n;
        currSize++;
    }

    void print() {
        int i = start;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == end) break; // Stop when we've printed all elements
            i = (i + 1) % maxSize; // Wrap-around if necessary
        }
        System.out.println();
    }

    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }

    public int size() {
        return currSize;
    }

    int pop() {
        if (end == -1) {
            System.out.println("stack underflow");
        }
        int popEle = arr[start];
        if (currSize == 1) {
            start = end = -1;
        } else {
            start = (start + 1) % maxSize;
        }
        currSize--;
        return popEle;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println(q.top());
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.top());
//        System.out.println();
        q.push(7);
        q.push(8);
        q.print();
      //  q.push(8);
    }
}
