package BST;
/*
 * @author DJS
 * Hashtable
 * */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // UC1: Add 56, then 30 & 70
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        // UC2: Check if all are added
        System.out.println("Total nodes in BST: " + bst.size());


    }
}