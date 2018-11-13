public class BSTInsert extends BinarySearchTree
{
    public void insert(int key)
    {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (root.key > key) root.left = insertRec(root.left, key);
        else if (root.key < key) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args)
    {
        BSTInsert bst = new BSTInsert();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.printInorder(bst.root);
    }
}
