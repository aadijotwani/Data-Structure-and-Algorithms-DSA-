package depthFirstSearch;
public class BoundaryTraversal 
{
	
	static class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
	
	
	
	
	
	
	
	public static boolean isleafNode(Node cNode) 
	{
		return cNode.left==null && cNode.right==null;
	}
	
	public void leftBoundary(Node cNode)
	{
		cNode = cNode.left;
		while(cNode!=null)
		{
			if(!isleafNode(cNode))
			{
				System.out.print(cNode.data + " ");
			}
			
			if(cNode.left!=null)
			{
				cNode = cNode.left;
			}
			
			else 
			{
				cNode = cNode.right;
			}
			
		}
		
	}
	
	public void leafNodes(Node cNode)
	{
		
	}
	
	public void rightBoundary(Node cNode)
	{
		cNode = cNode.right;
	}
	public void boundaryTraversal(Node cNode) 
	{
		if(cNode==null)
		{
			return;
		}
		
		if(!isleafNode(cNode))
		{
			System.out.print(cNode.data );
		}
		
		leftBoundary(cNode);
		leafNodes();
		rightBoundary();
		
	}
	
	
	
	public static void main(String[] args) 
	{
		BoundaryTraversal tree = new BoundaryTraversal();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(7);
		root.left.right = new Node(6);
		root.left.right.left = new Node(11);
		root.left.right.right = new Node(10);
		root.left.left.left = new Node(5);
		root.right.right.right = new Node(8);
		root.right.right.right.left = new Node(9);
		tree.boundaryTraversal(root);
	}
}
