class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    TreeNode root;

    // Helper function for inorder traversal (left-root-right)
    private void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversal(root.right);
       
    }

    // Entry point for inorder traversal
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Create a sample binary tree
        binaryTree.root = new TreeNode(1);
        binaryTree.root.left = new TreeNode(2);
        binaryTree.root.right = new TreeNode(3);
        binaryTree.root.left.left = new TreeNode(4);
        binaryTree.root.left.right = new TreeNode(5);

        // Perform inorder traversal and print the result
        System.out.print("Inorder Traversal: ");
        binaryTree.inorderTraversal();
    }
}
