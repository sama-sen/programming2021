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
		list1.append("Jane"); list1.printList();
		list1.delete("Mary"); list1.printList();
		list1.delete("Ollie"); list1.printList();
		list1.delete("Jane"); list1.printList();
		
		list1.insertAfter("Bruce", "Diana"); list1.printList();
		list1.insertAfter("Lisa", "Ada"); list1.printList();
		list1.insertAfter("Peter", "Otto"); list1.printList();
		list1.insertAfter("Kyle", "Nova"); list1.printList();
		/* end of insertAfter test cases
		* 
		* special challenge --if you have time--
		* write and test an insertBefore method!
		*/
		LinkedList sortedList = new LinkedList();
		System.out.println( sortedList.isEmpty() );
		sortedList.add("Ollie"); sortedList.printList();
		sortedList.add("Lisa"); sortedList.printList();
		sortedList.add("Mary"); sortedList.printList();
		sortedList.add("Peter"); sortedList.printList();
		sortedList.add("Bruce"); sortedList.printList();
		sortedList.add("Jane"); sortedList.printList();
		

	}
}
