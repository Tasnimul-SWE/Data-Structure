import java.util.*;
import java.util.ArrayList;
import java.util.Stack;
public class DFS {
	List<List<Integer>> graph;
	boolean visited[];
	public DFS (int node)
	{
		graph = new ArrayList<>();
		visited = new boolean[node];
		
		for (int i= 0; i<node; i++)
		{
			graph.add(i, new ArrayList<>());
		}
	}
	
	public void addedge(int a, int b)
	{
		graph.get(a).add(b);
		graph.get(b).add(a);
	}
	
	public void dfs(int startnode)
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.push(startnode);
		visited[startnode] = true;
		
		while(!stack.isEmpty())
		{
			Integer node = stack.pop();
			System.out.println(node+ " ");
			
			List<Integer> childlist = graph.get(node);
			
			for (int child: childlist)
			{
				if (!visited[child])
				{
					stack.push(child);
					visited[child]=true;
				}
			}
		}
	
	}
	
	public static void main(String[]args) {
		DFS df = new DFS(7);
		
		df.addedge(0,1);
		df.addedge(0,2);
		df.addedge(1,3);
		df.addedge(2,4);
		df.addedge(3,5);
		df.addedge(4,5);
		df.addedge(4,6);
		
		df.dfs(1);
		
	}
}
