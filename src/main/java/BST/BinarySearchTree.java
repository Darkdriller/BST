package BST;
/*
 * @author DJS
 * Hashtable
 * */
class BinarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    BinarySearchTree() {
        root = null;
    }

    void insert(T key) {
        root = insertRecursive(root, key);
    }

    TreeNode<T> insertRecursive(TreeNode<T> root, T key) {
        if (root == null) {
            root = new TreeNode<>(key);
            return root;
        }

        if (key.compareTo(root.key) < 0) {
            root.left = insertRecursive(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRecursive(root.right, key);
        }

        return root;
    }
    public void inOrderPrint() {
        inOrderPrintRec(root);
        System.out.println();
    }

    private void inOrderPrintRec(TreeNode<T> root) {
        if (root != null) {
            inOrderPrintRec(root.left);
            System.out.print(root.key + " ");
            inOrderPrintRec(root.right);
        }
    }

    int size() {
        return sizeRec(root);
    }

    private int sizeRec(TreeNode<T> node) {
        return node == null ? 0 : 1 + sizeRec(node.left) + sizeRec(node.right);
    }
}
