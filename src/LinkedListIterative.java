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

    public static void main(String[] args)
    {
        LinkedListIterative list = new LinkedListIterative();
        list.push(1);
        list.push(3);
        list.push(5);
        list.push(6);
        list.push(1);

        System.out.println(list.count());

    }


}

