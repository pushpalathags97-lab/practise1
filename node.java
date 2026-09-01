public class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
//==============Recursive Traversal=========================
    static void treeTraversal(node root) {
        if (root == null) {
            return;
        }

        System.out.print("Inorder: ");
        Inorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        Postorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        Preorder(root);
        //==========Recursive Traversal=========================
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

    public static void main(String[] args) {
        node root = new node(10);

        root.left = new node(5);
        root.right = new node(20);

        root.left.left = new node(2);
        root.left.right = new node(7);

        treeTraversal(root);
    }
}