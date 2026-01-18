package depthFirstSearch;

public class PostOrderTraversal {

	static class Node{
		int data; 
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public static void postOrder(Node cNode) {
		if(cNode == null) {
			return;
		}
		
		postOrder(cNode.left);
		postOrder(cNode.right);
		System.out.print(cNode.data+" ");
		
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		postOrder(root);
		
		
	}
}
