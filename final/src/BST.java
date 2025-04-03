package edu.augie.finalProgram.nwite;

public class BST<T extends AbstractRecord> {
    
    // Node class to represent each node in the tree
    class Node {
        T record;  // Record associated with the node
        Double grade;  // Grade associated with the record
        Node left, right;  // Left and right child nodes

        // Constructor to create a new node
        public Node(T record, Double grade) {
            this.record = record;
            this.grade = grade;
            this.left = this.right = null;
        }
    }

    private Node root;  // Root of the tree

    // Constructor to initialize an empty BST
    public BST() {
        root = null;
    }

    // Insert a new record with its grade into the BST
    public void insert(T record, Double grade) {
        root = insertRec(root, record, grade);
    }

    // Recursive method to insert a node into the BST based on grade
    private Node insertRec(Node root, T record, Double grade) {
        if (root == null) {
            root = new Node(record, grade);  // Create new node if root is null
            return root;
        }

        // Traverse left if grade is smaller, otherwise go right
        if (grade < root.grade) {
            root.left = insertRec(root.left, record, grade);
        } else if (grade > root.grade) {
            root.right = insertRec(root.right, record, grade);
        }

        return root;
    }

    // Perform in-order traversal and print the records with their grades
    public void inOrder() {
        inOrderRec(root);
    }

    // Recursive method for in-order traversal
    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);  // Traverse left subtree
            System.out.println(root.record.getRecordInfo() + " | Grade: " + root.grade);  // Print node info
            inOrderRec(root.right);  // Traverse right subtree
        }
    }

    // Get the highest grade in the BST
    public Double getHighestGrade() {
        return getHighestGradeRec(root);
    }

    // Recursive method to find the highest grade by traversing the rightmost node
    private Double getHighestGradeRec(Node root) {
        if (root == null) return Double.MIN_VALUE;  // Return a minimal value if the tree is empty
        while (root.right != null) {
            root = root.right;  // Traverse to the rightmost node
        }
        return root.grade;  // Return the highest grade
    }

    // Get the lowest grade in the BST
    public Double getLowestGrade() {
        return getLowestGradeRec(root);
    }

    // Recursive method to find the lowest grade by traversing the leftmost node
    private Double getLowestGradeRec(Node root) {
        if (root == null) return Double.MAX_VALUE;  // Return a maximal value if the tree is empty
        while (root.left != null) {
            root = root.left;  // Traverse to the leftmost node
        }
        return root.grade;  // Return the lowest grade
    }

    // Calculate the average grade of all records in the BST
    public Double calculateAverageGrade() {
        return calculateAverageGradeRec(root, 0.0, 0);
    }

    // Recursive method to calculate the average grade
    private Double calculateAverageGradeRec(Node root, Double sum, int count) {
        if (root == null) return sum / count;  // Return average when tree is fully traversed
        sum += root.grade;  // Add current grade to the sum
        count++;  // Increment count of nodes visited
        sum = calculateAverageGradeRec(root.left, sum, count);  // Traverse left subtree
        return calculateAverageGradeRec(root.right, sum, count);  // Traverse right subtree
    }

    // Method to get the root of the BST (for promotion/repeat functionality)
    public Node getRoot() {
        return root;
    }
}
