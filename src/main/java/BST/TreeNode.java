package BST;
/*
 * @author DJS
 * Hashtable
 * */
class TreeNode<T extends Comparable<T>> {
    T key;
    TreeNode<T> left, right;

    public TreeNode(T item) {
        key = item;
        left = right = null;
    }
}
