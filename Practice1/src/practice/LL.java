package practice;


public class LL {
	Node head = null;
	public class Node{
		String data;
		Node next;
		
		public Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	// insertion in the beginning
	
	public void addFirst(String data)
	{
		Node newnode = new Node(data);
		if( head == null)
		{
			System.out.println("no list ");
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	// insertion in the end
	public void addLast(String data)
	{	
		Node newnode = new Node(data);
		Node currnode = head;
		if(head==null)
		{
			System.out.println("no list");
			return;
		}
		while(currnode.next!=null)
		{
			currnode = currnode.next;
		}
		currnode.next = newnode;
	
	}
	
		// display linkedlist
	public void printList()
	{	Node currnode = head;
		if(head == null)
		{
			System.out.println("empty list");
			return;
		}
		while(currnode!=null)
		{
			System.out.println(currnode.data + "->");
			 currnode= currnode.next;
		}
		System.out.println("NULL");
	}
	
	public static void main(String[] args)
	{
		LL list = new LL();
		list.addFirst("is");
		list.addLast("this");
		list.printList();
	}
	
	
}

	