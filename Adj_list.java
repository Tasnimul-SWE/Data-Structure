import java.util.*;

public class Adj_list {
	
	public void insert(Vector<Integer> adj[], int u , int v)
	{
		adj[u].add(v);
	}
	
	public void printlist(Vector<Integer> adj[], int v)
	{
		for (int i=0; i<v; i++)
		{
			System.out.print(i);
			
			for (int j : adj[i])
			{
				System.out.print("-->"+j);
			}
			System.out.println();
		}
	}
	// answer of algorithm question
	
	public int[][] convert(Vector<Integer> adj[], int v)
	{
		int[][] matrix = new int[v][v];
		
		for (int i=0; i<v; i++)
		{
			for (int j: adj[i])
			{
				matrix[i][j]=1;
			}
		}
		return matrix;
	}
	
	public void printMatrix(int[][] adj, int V)
	{
	    for(int i = 0; i < V; i++)
	    {
	        for(int j = 0; j < V; j++)
	        {
	            System.out.print(adj[i][j] + " ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
	
	public static void main(String[] args) {
		int v= 5;
		
		Vector<Integer> []adjList = new Vector[v];
		
		for (int i=0; i<adjList.length; i++)
		{
			adjList[i]= new Vector<Integer>();
		}
		Adj_list a = new Adj_list();
		
		a.insert(adjList, 0, 1);
	    a.insert(adjList, 0, 4);
	    a.insert(adjList, 1, 0);
	    a.insert(adjList, 1, 2);
	    a.insert(adjList, 1, 3);
	    a.insert(adjList, 1, 4);
	    a.insert(adjList, 2, 1);
	    a.insert(adjList, 2, 3);
	    a.insert(adjList, 3, 1);
	    a.insert(adjList, 3, 2);
	    a.insert(adjList, 3, 4);
	    a.insert(adjList, 4, 0);
	    a.insert(adjList, 4, 1);
	   a.insert(adjList, 4, 3);
	   
	   System.out.print("Adjacency List: \n");
	   a.printlist(adjList, v);
	   
	   int[][] adjmatrix = a.convert(adjList,v);
	   
	   System.out.print("Adjacency Matrix: \n");
	   a.printMatrix(adjmatrix, v);
		
		
	}
}
