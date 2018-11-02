import Data.Node;

public class ProblemThree {

	public static int ProblemThree(Data data,int value)
	{
		int x = data.head.data;
		int y = data.tail.data;
		
		int a = Math.abs(value - x);
		int b = Math.abs(value - y);
		int compares = 0;
		if( a < b )
		{
			Node temp = data.head;
			while( temp.data != value )
			{
				temp = temp.next;
				compares++;
			}
		}
		else
		{
			Node temp = data.tail;
			while( temp.data != value )
			{
				temp = temp.prev;
				compares++;
			}
		}
			
		return compares;
	}
	
	public static void main(String[] args)
	{
		Data a = new Data();
		a.add(1);
		a.add(5);
		a.add(8);
		a.add(10);
		a.add(12);
		a.add(14);
		a.add(18);
		a.add(20);
		a.add(33);
		a.add(41);
		
		System.out.println(ProblemThree(a,33));
	}
}
