import java.util.Scanner;


public class BST_practice {
	
	Treenode root;	
	public class Treenode
		{
			int data;
			Treenode left;
			Treenode right;
			
			Treenode (int data)
			{
				this.data= data;
				this.left= this.right= null;
			}
		}
		
	
	public Treenode insert (Treenode root, int datatobeinserted)
	{
		if (root==null) 
		{
			root= new Treenode(datatobeinserted);
			return root;
		}
		
		if (root.data > datatobeinserted)
		{
			root.left = insert (root.left, datatobeinserted);
		}
		
		else if (root.data<datatobeinserted)
		{
			root.right = insert (root.right, datatobeinserted);
		}
		return root;
	}
	
	public Treenode search (Treenode root ,int datatobesearched)
	{
		if (root==null || root.data ==datatobesearched)
		{
			return root;
		}
		
		if (root.data > datatobesearched)
		{
			return search (root.left, datatobesearched);
		}
		
		else 
		{
			return search (root.right, datatobesearched);
		}
	}
	
	public void inorder (Treenode root)
	{
		if (root==null)
		{
			return;
		}
		
		inorder (root.left);
		
		System.out.println(root.data + "");
		inorder (root.right);
	}
	
	public void preorder(Treenode root)
	{
		if (root==null)
		{
			return;
		}
		System.out.println(root.data + "");
		inorder (root.left);
		inorder (root.right);
	}
	
	public void postorder(Treenode root)
	{
		if (root==null)
		{
			return;
		}
		inorder (root.left);
		inorder (root.right);
		System.out.println(root.data + "");
	}
	
	// wrapper
	public void insertintotree (int datatobeinserted)
	{
		root = insert (root,datatobeinserted);
	}
	
	public Treenode searchtree (int datatobesearched)
	{
		return search (root, datatobesearched);
	}
	
	public void inordertraversal()
	{
		inorder(root);
	}
	
	public void preordertraversal()
	{
		preorder(root);
	}
	
	public void postordertraversal()
	{
		postorder(root);
	}
	
	public static void main(String[] args) 
	{
		BST_practice bs = new BST_practice ();
		Scanner sc = new Scanner (System.in);
		
		int n;
		int num;
		
		System.out.println("Enter how many data you give as input");
		n= sc.nextInt();
		System.out.println("Enter the data");
		
		for (int i=0; i<n; i++)
		{
			num= sc.nextInt();
			bs.insertintotree(num);
		}
		
		System.out.println("Data inserted");
		
		System.out.println("Enter data to be searched");
		
		n= sc.nextInt();
		
		if(bs.searchtree(n) != null)
		{
			System.out.println("Number found");
		}
		
		else {
			System.out.println("Number not found");
		}
		
		System.out.println("Inorder traversal of binary search tree");
		bs.inordertraversal();
		
		System.out.println("Preorder traversal of binary search tree");
		bs.preordertraversal();
		
		System.out.println("Postorder traversal of binary search tree");
		bs.postordertraversal();
	}
		
}












