public class LinkedListDeleting extends LinkedList
{
	/* Given a key, delete the first occurrence of key in linked list */
	public void deleteNode(int key)
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

	/* Given a singly linked list and a position, delete a linked list node at the given position. */
    public void deleteAtGivenPosition(int position)
    {
        Node temp = head;
        Node prev = null;

        /* If head needs to be removed */
        if (position ==  0)
        {
            head = temp.next;
            return;
        }

        for (int i = 0; i < position && temp != null; i++)
        {
            prev = temp;
            temp = temp.next;
        }

        if(prev.next == null || temp == null) return;

        prev.next = temp.next;
    }


	public static void main(String[] args)
	{
		LinkedListDeleting list = new LinkedListDeleting();
		
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(8);


//		list.deleteNode(5);
		list.deleteAtGivenPosition(3);
		
		list.printList();
	}
}
