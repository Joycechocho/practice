public class LinkedList
{

        Node head;

        static class Node
        {
            int data;
            Node next;
            Node (int d) {
                data = d;
                next = null;
            }
        }

        public void printList()
        {
            Node n = head;
            while (n != null)
            {
                System.out.println(n.data + " ");
                n = n.next;
            }
        }

        /* Add new node at the front of list */
        public void push(int data)
        {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }

}
