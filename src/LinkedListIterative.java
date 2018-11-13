public class LinkedListIterative extends LinkedList
{
    /* Count number of nodes in a given singly linked list */
    public int count()
    {
      Node temp = head;
      int count = 0;

      if(head == null) return 0;

      while (temp != null)
      {
          count ++;
          temp = temp.next;
      }

      return count;
    }

    /* Write a function that searches a given key ‘x’ in a given singly linked list.
    The function should return true if x is present in linked list and false otherwise.*/
    public boolean hasElement(int x)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == x) return true;
            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args)
    {
        LinkedListIterative list = new LinkedListIterative();
        list.push(1);
        list.push(3);
        list.push(5);
        list.push(6);
        list.push(1);

        System.out.println(list.count());
        System.out.println(list.hasElement(1));

    }


}

