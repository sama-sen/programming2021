/*
 * Queue.java
 *
 * Class to define the structure and behaviour of
 * a linked queue abstract data structure/type
 *
 */


public class Queue
{
	NodeString head; // first element in the queue
	NodeString tail; // last  element in the queue

	public boolean isEmpty()
	{
		return head == null;
	}

	public void enqueue(String s)
	{
		NodeString newNode = new NodeString(s);
		if( isEmpty() == true )
		{
			head = newNode;
			tail = newNode;
		} else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}

	// Classwork: write the pop method:
	public String dequeue()
	{
		if( !isEmpty() )
		{	String s = head.data;
			head = head.next;
			return s;
		}
		return null;
	}

	/*********************************************************************
	*	HOMEWORK: complete the printStack() method in the Stack class      *
	*	so that the code shows the contents of a stack, LIFO, but without  *
	*	destroying/popping the stack contents.                             *
	*********************************************************************/

	public void printStack()
	{
		if(this.isEmpty())
		{	System.out.println("Stack is empty.");
			return;
		}
		Node temp = top;
		System.out.println("Top");

		// your code goes here

		System.out.println("null");
	}

}
