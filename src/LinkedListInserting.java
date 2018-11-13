public class LinkedListInserting extends LinkedList
{
		/* 1. Insert a node at the front of linked list */
		public void insertAtFront(int new_data)
		{
			LinkedList.Node new_node = new LinkedList.Node(new_data);
			new_node.next = head;
			head = new_node;
		}

		/* 2. Add a node at given position */
		public void inserAtGivenPosition(int new_data, LinkedList.Node prev_node)
		{
			if(prev_node == null)
			{
				return;
			}

			LinkedList.Node new_node = new LinkedList.Node(new_data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;
		}

		/* 3. Insert a node at the end lif linked list */
		public void insertAtEnd(int new_data)
		{
			LinkedList.Node new_node = new LinkedList.Node(new_data);

			if(head == null)
			{
				head = new_node;
				return;
			}

			LinkedList.Node last = head;
			while(last.next != null)
			{
				last = last.next;
			}

			last.next = new_node;
			new_node.next = null;
		}

        public static void main(String[] args)
        {
			LinkedListInserting list = new LinkedListInserting();

                list.insertAtFront(1);
                list.insertAtEnd(9);
                list.insertAtFront(2);
                list.insertAtEnd(3);
                list.inserAtGivenPosition(5, list.head.next);

                list.printList();
        }
}
