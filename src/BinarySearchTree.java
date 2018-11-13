public class BinarySearchTree {

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    /* constructor */
    BinarySearchTree()
    {
        root = null;
    }

    public void printPostorder(Node node)
    {
        if(node == null) return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key);
    }

    public void printPreorder(Node node)
    {
        if(node == null) return;

        System.out.println(node.key);
        printPreorder(node.left);
        printPreorder(node.right);
    }


    public void printInorder(Node node)
    {
        if(node == null) return;

        printInorder(node.left);
        System.out.println(node.key);
        printInorder(node.right);
    }

    public int minValue(Node root)
    {
        int value = root.key;
        while(root.left != null)
        {
            value = root.left.key;
            root = root.left;
        }

        return value;
    }

}
