
import java.util.*;
public class Graph {
	List<List<Integer>> graph;
	boolean visited[];
	
	public Graph(int node)
	{
		graph = new ArrayList<>();
		visited = new boolean[node];
		
		for (int i=0; i<node; i++)
		{
			graph.add(i, new ArrayList<>());
		}
	}
	
	public void addEdge (int a, int b)
	{
		graph.get(a).add(b);
		graph.get(b).add(a);
	}
	
	public void bfs(int startnode)
	{
		Queue<Integer> qu= new LinkedList<>();
		qu.add(startnode);
		visited[startnode] =true;
		
		while(!qu.isEmpty())
		{
			Integer node= qu.poll();
			System.out.println(node + " ");
			
			List<Integer> childlist = graph.get(node);
			
			for (int child: childlist)
			{
				if (!visited[child]) {
					qu.add(child);
					visited[child]=true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int node =6;
		Graph gp = new Graph(node);
		
		gp.addEdge(0,1);
		gp.addEdge(0,2);
		gp.addEdge(0,3);
		gp.addEdge(1,4);
		gp.addEdge(2,4);
		gp.addEdge(2,5);
		gp.addEdge(4,5);
		
		gp.bfs(0);
		
		
	}
}
