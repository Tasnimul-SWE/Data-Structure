
public class HeapSort {
	
	public int left(int i)
	{
		return i*2;
	}
	
	public int right(int i)
	{
		return i*2+1;
	}
	
	public int parent(int i)
	{
		return i/2;
	}
	
	public void sort(int array[], int heap_size) 
	{
		int t;
		
		for (int i=heap_size;i>1;i--)
		{
			t= array[1];
			array[1]= array[i];
			array[i]=t;
			
			heap_size-=1;
			max_heapify(array,heap_size,1);
		}
	}
	
	public void max_heapify(int array[], int heap_size, int i)
	{
		int l,r,t, largest;
		
		l= left(i);
		r= right(i);
		
		if (l<=heap_size && array[l]> array[i])
		{
			largest= l;
		}
		else {
			largest=i;
		}
		
		if (r<=heap_size && array[r]> array[largest])
		{
			largest= r;
		}
		
		if (largest!=i)
		{
			t= array[i];
			array[i]= array[largest];
			array[largest]=t;
			
			max_heapify(array,heap_size,largest);
		}
		
	}
	
	public static void main(String[] args) {
		HeapSort hp = new HeapSort();
		
		int array[]= {0,12,11,13,5,6,7};
		
		int heap_size= 6;
		
		hp.sort(array,heap_size);
		
		System.out.println("Sorted array is");
		
		for (int i=1; i<=heap_size; i++)
            System.out.print(array[i]+" ");
        System.out.println();
		 
		
	}
}
