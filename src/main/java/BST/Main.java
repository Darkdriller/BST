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
        bst.insert(22);
        bst.insert(40);
        bst.insert(60);
        bst.insert(95);
        bst.insert(11);
        bst.insert(65);
        bst.insert(3);
        bst.insert(16);
        bst.insert(63);
        bst.insert(67);

        // UC2: Check if all are added
        System.out.println("Total nodes in BST: " + bst.size());

        // UC3: Search for 63
        boolean found = bst.search(63);
        System.out.println("Is 63 in the BST? " + found);

    }
}