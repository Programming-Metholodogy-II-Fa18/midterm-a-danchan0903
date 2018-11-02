
public class Data {

	public Node head;
	public Node tail;
	public int totalNodes = 0;
	public int min;
	
	class Node
	{
		int data;
		Node next, prev;
	}
	
	public Data()
	{
		tail = head;
	}

	public void add(int a)
	{
		if(totalNodes == 0)
		{
			min = a;
			head.data = 0;
		}
		else
		{
			Node temp = head;
			head.data = a - min;
			head.next = temp;
			temp.next = head;
		}
		
		if(head.data < 0)
		{
			min = a;
		}
		
		totalNodes++;
	}
	
	public int remove()
	{
		int x = tail.data + min;
		if( x < min )
		{
			x = min - tail.data;
			min = x;
		}
		
		Node temp = tail.prev;
		temp.next = null;
		tail = temp;
		
		return x;
	}
	
	public int getValue(int i)
	{
		int j = 0;
		int value = 0;
		Node temp = head;
		if(i < totalNodes)
		{
			while(j != i)
			{
				j++;
				temp = temp.next;
			}
			value = temp.data;
		}
		else
		{
			value = -1;
		}
		return value;
	}
	
	public static void main(String[] args)
	{
		Data a = new Data();
		a.add(1);
		a.add(9);
		a.add(4);
		a.add(5);
		a.add(10);
		a.add(0);
		System.out.println(a.getValue(0));
		System.out.println(a.getValue(3));
	}
}
