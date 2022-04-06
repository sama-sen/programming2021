/*
 * LinkedListDemo.java
 * 
 * 
 * 
 */


public class LinkedListDemo
{
	
	public static void main (String[] args)
	{
		LinkedList list1 = new LinkedList();
		System.out.println( list1.isEmpty() );
		list1.append("Ollie"); list1.printList();
		list1.append("Lisa"); list1.printList();
		list1.append("Mary"); list1.printList();
		list1.append("Peter"); list1.printList();
		list1.append("Bruce"); list1.printList();
	}
}

