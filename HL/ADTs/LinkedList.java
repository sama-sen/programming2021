/*
 * LinkedList.java
 * 
 * 
 */


public class LinkedList
{
	NodeString start;
	
	// this method creates an empty linked list
	public LinkedList() { }
	
	// this method creates a list
	// with its initial element
	public LinkedList(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		start = newNode;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void append(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		if( start == null )
		{	
			start = newNode;
		} else {
			NodeString temp = start;
			while( temp.hasNext() )
			{	temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	/* Homework for next lesson:
	 * add a printList() method
	 * write a main method to test adding 5 strings
	 * print the list each time you add a string to it
	 */
	
}

