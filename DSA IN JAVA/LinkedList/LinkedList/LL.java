package LinkedList;

public class LL {
	Node head = null;
	class  Node{
		String data;
		Node next;
		
		
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	// insertion in the beginning
	
	public void InsertionFirst(String data)
	{
		
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	// insertion in the end
	public void InsertionLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	// deletion in the beginning
	public void deleteFirst()
	{
		if (head == null)
		{
			System.out.println("the list is empty");
			return;
		}
			head.next = head;
		
	}
	// deletion in the end
	public void deleteEnd()
	{
		Node ptr = head;
		if(head == null)
		{
			System.out.println("The list is empty");
			return;
		}
		while(ptr.next.next !=null)
		{
			ptr=ptr.next;
		}
		ptr.next = null;
	}
	
	// printing the nodes
	public void PrintList()
	{
		if(head == null)
		{
			System.out.println("node is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	
	public static void main(String[] args)
	{
		LL list = new LL();
		list.InsertionFirst("a");
		list.InsertionFirst("is");
		list.PrintList();
		list.InsertionLast("list");
		list.PrintList();
		list.InsertionFirst("this");
		list.PrintList();
//		list.deleteFirst();
//		list.PrintList();
		list.deleteEnd();
		list.PrintList();
		
	}

}
