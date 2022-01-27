/*
 * Node.java
 * 
 * 
 * 
 */


public class Node
{
	int data;
	Node next; // self-referential data structure

	public boolean hasNext()
	{
		return next != null;
	}
	
	public Node()
	{	}
	
	public Node(int n)
	{
		data = n;
		next = null;
	}

}

