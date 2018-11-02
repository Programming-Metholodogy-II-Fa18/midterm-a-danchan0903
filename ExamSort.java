
public class ExamSort {

	public static int[] ExamSort(int[] a, int size)
	{
		recursiveSort(a,0,size-1);
		for( int i = 0; i < size; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return a;
	}
	
	private static void recursiveSort(int[] a, int low, int hi)
	{
		if( low != hi )
		{
			int mid = (low + hi) / 2;
			
			for( int i = low; i < hi; i++)
			{
				for( int j = mid + 1; j < hi; j++ )
				{
					if( a[j] < a[i] )
					{
						int z = a[j];
						a[i] = a[j];
						a[j] = z;
					}
				}
			}
			
			recursiveSort(a,low,mid);
			recursiveSort(a,mid+1,hi);
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] a = new int[]{15, 9, 60, 44, 12, 1, 4};
		ExamSort(a,7);
	}
}
