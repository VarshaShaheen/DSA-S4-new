class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinarySearchTree {
    TreeNode root;

    // Helper function to insert a value into the BST
    private TreeNode insertValue(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = insertValue(current.left, value);
        } else if (value > current.val) {
            current.right = insertValue(current.right, value);
        }

        return current;
    }

    // Entry point to insert a value into the BST
    public void insert(int value) {
        root = insertValue(root, value);
    }

    // Helper function for inorder traversal (left-root-right)
    private static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values into the BST
        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);
        bst.insert(8);

        // Perform inorder traversal to verify the values are inserted correctly
        System.out.print("Inorder Traversal: ");
        inorderTraversal(bst.root);
    }
}
