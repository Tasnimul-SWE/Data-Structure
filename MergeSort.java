import java.util.*;
public class MergeSort {
	
	public void merge(int array[], int l, int mid, int r)
	{
		// Declare Size
		int n1= mid-l+1;
		int n2 = r-mid;
		
		// Declare Temporary Array
		int L[]= new int[n1];
		int R[]= new int[n2];
		
		//insert data to array
		
		for (int i=0; i<n1;++i)
		{
			L[i]= array[l+i];
		}
		for (int j=0; j<n2;++j)
		{
			R[j]= array[mid+1+j];
		}
		int i=0,j=0;
		int k=l;
		while (i<n1 && j<n2)
		{
			if (L[i]<=R[j])
			{
				array[k]= L[i];
				i++;
			}
			else 
			{
				array[k]= R[j];
				j++;
			}
			k++;
		}
		
		while (i<n1)
		{
			array[k]= L[i];
			i++;
			k++;
		}
		
		while (j<n2)
		{
			array[k]= R[j];
			j++;
			k++;
		}
	}
	
	
	public void sort(int array[], int l, int r)
	{
		if (l>=r)
		{
			return;
		}
		
		int mid = (l+r)/2;
		
		sort(array, l, mid);
		sort(array, mid+1, r);
		merge(array, l, mid , r);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		MergeSort mg = new MergeSort();
		int array[]= new int[5];
		System.out.println("Enter the elements");
		for (int i=0; i<array.length; i++)
		{
			array[i]= sc.nextInt();
		}
		
		System.out.println("Unsorted Array");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		mg.sort(array, 0, array.length-1);
		
		System.out.println("\nSorted Array");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+ " ");
		}
		
	}
}
