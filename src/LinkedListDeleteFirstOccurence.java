class LinkedList
{
	Node head;

	class Node
	{
		int data;
		Node next;
		Node(int d) { data=d; next=null; }
	}

	/* Given a key, delete the first occurrence of key in linked list */
	void deleteNode(int key)
	{
		Node temp, prev;
		temp = head;
		prev = null;
		
		/* If header node itself holds the key to be deleted */
		if(temp.data == key)
		{
			head = temp.next;
			return;
		}

		/* Search for the key to be deleted, keey track of the 
		   previous node as we need to change temp.next */
		while(temp.data != key)
		{
			prev = temp;
			temp = temp.next;
		}

		if(temp.next  == null) return;
		
		prev.next = temp.next;	
	}

	/* Add new node at the front of list */
	void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	/* Print the list */
	void printList()
	{
		Node printNode = head;
		while(printNode != null)
		{
			System.out.print(printNode.data);
			printNode = printNode.next;
		}
	}
}



public class LinkedListDeleteFirstOccurence 
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(8);

		list.deleteNode(5);
		
		list.printList();
	}
}
