package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTreeLL {


    private Node root;

    // Method to insert a node
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }

    // In-order Traversal
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order Traversal
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order Traversal
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Find the height of the tree
    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(heightRec(root.left), heightRec(root.right));
    }

    // Count the number of nodes
    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(Node root) {
        if (root == null) return 0;
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }

    // Find the deepest node
    public int findDeepestNode() {
        if (root == null) return -1;
        return findDeepestNodeRec(root);
    }

    private int findDeepestNodeRec(Node root) {
        int deepest = -1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            deepest = current.data;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return deepest;
    }

    // Delete a node and return the new root
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null) return null;
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    }

    public static void main(String[] args) {
        BinarySearchTreeLL bst = new BinarySearchTreeLL();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Traversals
        System.out.println("In-order traversal:");
        bst.inOrder();
        System.out.println("Pre-order traversal:");
        bst.preOrder();
        System.out.println("Post-order traversal:");
        bst.postOrder();

        // Tree metrics
        System.out.println("Height of the tree: " + bst.height());
        System.out.println("Number of nodes: " + bst.countNodes());
        System.out.println("Deepest node in the tree: " + bst.findDeepestNode());

        // Deleting a node
        bst.delete(20);
        System.out.println("In-order traversal after deleting 20:");
        bst.inOrder();

    }
}





