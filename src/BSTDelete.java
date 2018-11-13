public class BSTDelete extends BSTInsert
{
    void delete(int key)
    {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key)
    {
        /* base case" of the tree is empty */
        if (root == null) return root;

        if (root.key < key)
        {
            root.right = deleteRec(root.right, key);
        }
        else if (root.key > key)
        {
            root.left = deleteRec(root.left, key);
        }
        else
        {
            // node with only one child
            if (root.right == null) return root.left;
            else if (root.left == null) return root.right;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    public static void main(String[] args)
    {
        BSTDelete bst = new BSTDelete();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.delete(50);
        bst.printInorder(bst.root);
    }
}
