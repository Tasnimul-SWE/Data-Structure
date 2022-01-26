
public class recursion {
	public int fact(int n)
	{
		if (n>=1)
		{
			return n* fact(n-1);
		}
		else 
		{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		recursion rc = new recursion();
		
		int a=rc.fact(5);
		System.out.println(a);
	}
}
