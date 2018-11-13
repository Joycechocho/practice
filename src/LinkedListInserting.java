class LinkedList 
{	

	Node head; 

	class Node 
	{
		int data;
		Node next;
		
		/* Constructor to create a new node*/
		Node(int d) { data = d; next = null; } 	
	}


	/* 1. Insert a node at the front of linked list */
	public void insertAtFront(int new_data) 
	{
		Node new_node = new Node(new_data);
		new_node.next = head; 
		head = new_node;
	}

	/* 2. Add a node at given position */
	public void inserAtGivenPosition(int new_data, Node prev_node) 
	{
		if(prev_node == null) 
		{
			return;
		}

		Node new_node = new Node(new_data);
		new_node.next = prev_node.next; 
		prev_node.next = new_node;
	}

	/* 3. Insert a node at the end lif linked list */
	public void insertAtEnd(int new_data)
	{
		Node new_node = new Node(new_data);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		Node last = head;
		while(last.next != null)
		{
			last = last.next;
		}

		last.next = new_node;
		new_node.next = null;
	}

	
	public void printlist() 
	{
		Node printNode = head;
		while(printNode != null)
		{
			System.out.print(printNode.data);
			printNode = printNode.next; 
		}
	}

}


public class LinkedListInserting 
{
        public static void main(String[] args)
        {
                LinkedList list = new LinkedList();

                list.insertAtFront(1);
                list.insertAtEnd(9);
                list.insertAtFront(2);
                list.insertAtEnd(3);
                list.inserAtGivenPosition(5, list.head.next);

                list.printlist();
        }
}
