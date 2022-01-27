import java.util.*;
public class QuickSort {
	
	public int partition(int array[],int low, int high)
	{
		 int pivot,i,j,t;
		 
		 pivot = array[high];
		 
		 for(i=low-1,j=low;j<high;j++)
		 {
			 if(array[j]<pivot)
			 {
				 i=i+1;
				 t=array[j];
				 array[j]= array[i];
				 array[i]=t;
			 }
		 }
		 
		 t= array[high];
		 array[high]=array[i+1];
		 array[i+1]=t;
		 
		 return i+1;
	}
	
	public void quick_sort(int array[], int low, int high)
	{
		if(low>=high)
		{
			return;
		}
		
		int p;
		p= partition(array,low,high);
		
		quick_sort(array,low,p-1);
		quick_sort(array,p+1,high);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int array[]= new int[5];
		System.out.println("Enter Elements to be sort:");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]= sc.nextInt();
		}
		
		System.out.print("Unsorted Elements are ");
		
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		QuickSort qc = new QuickSort();
		
		qc.quick_sort(array,0,array.length-1);
		
		System.out.print("\nSorted Elements are ");
		
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
			
	}
}
