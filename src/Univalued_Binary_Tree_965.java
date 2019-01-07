import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Univalued_Binary_Tree_965 extends BinarySearchTree {
    List<Integer> arr = new ArrayList<>();

    public boolean isUnivalTree(Node root) {
        printInorder_965(root);

        for (int val : arr) {
            if (val != arr.get(0)) {
                return false;
            }
        }
        return true;
    }

    public void printInorder_965 (Node node) {
        printInorder(node.left);
        arr.add(node.key);
        printInorder(node.right);
    }
}
