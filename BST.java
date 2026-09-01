import java.util.Stack;

class Node3 {
    int data;
    node left;
    node right;

    Node3(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BST {
    node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private node insertRecursive(node current, int value) {
        if (current == null) {
            return new node(value);
        }

        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    static void Inorder(node root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static void Postorder(node root) {
        if (root == null) {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void Preorder(node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public void inorderIterative(node root) {
        Stack<node> stack = new Stack<>();
        node current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    public void preorderIterative(node root) {
        if (root == null) {
            return;
        }

        Stack<node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public void postorderIterative(node root) {
        if (root == null) {
            return;
        }

        Stack<node> stack1 = new Stack<>();
        Stack<node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            node current = stack1.pop();
            stack2.push(current);

            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        while (!stack2.isEmpty()) {
            node current = stack2.pop();
            System.out.print(current.data + " ");
        }
    }

    public static void main(String[] args) {

        BST tree = new BST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(2);
        tree.insert(7);

        System.out.println("Recursive Inorder:");
        Inorder(tree.root);

        System.out.println("\nRecursive Preorder:");
        Preorder(tree.root);

        System.out.println("\nRecursive Postorder:");
        Postorder(tree.root);

        System.out.println("\nIterative Inorder:");
        tree.inorderIterative(tree.root);

        System.out.println("\nIterative Preorder:");
        tree.preorderIterative(tree.root);

        System.out.println("\nIterative Postorder:");
        tree.postorderIterative(tree.root);
    }
}