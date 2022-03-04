package fuck;

public class LinkedList {
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node (int data){
			this.data= data;
			next= null;
		}
	}
	
	public static LinkedList insert(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		new_node.next= null;
		
		if (list.head==null) {
			list.head= new_node;
		}
		
		else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next= new_node;
		}
		return list;
	}
	
	public static void printlist(LinkedList list)
	{
		Node curr_node = list.head;
		
		System.out.print("LinkedList:");
		
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			
			curr_node= curr_node.next;
		}
		System.out.println();
	}
	
	public static LinkedList deletebykey(LinkedList list, int key)
	{
		Node curr_node= list.head;
		Node prev= null;
		if (curr_node!=null && curr_node.data==key) {
			list.head= curr_node.next;
			System.out.println(key+" Found and deleted");
			return list;
		}
		
		while(curr_node!=null && curr_node.data!=key) {
			prev= curr_node;
			curr_node = curr_node.next;
		}
		
		if(curr_node!=null)
		{
			prev.next= curr_node.next;
			System.out.println(key+" Found and deleted");
		}
		
		if(curr_node!=null)
		{
			System.out.println(key+" Not found");
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		
		printlist(list);
		
		deletebykey(list,1);
		
		printlist(list);

	}

}
