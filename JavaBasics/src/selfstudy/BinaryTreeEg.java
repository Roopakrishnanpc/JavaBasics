package selfstudy;

//Binary tree three types:
//1. Inorder traversal: traverse left node then root node then right node
//2. Pre order Traversal - Root Left Right
//3. Post order Traversal - Left Right Root
class Node
{
	char key;
	Node left, right;
	Node(char key)
	{
		this.key=key;
	}
}
class TreeeTraversal
{
	Node root;
	void preorderTraversal(Node n)
	{
		//until the node doesn't reach the end
		if(n!=null)
		{
			System.out.print(n.key);
			preorderTraversal(n.left);
			preorderTraversal(n.right);
		}
	}
	// n is the root
	void postorderTraversal(Node n)
	{
		//until the node doesn't reach the end
		if(n!=null)
		{
			preorderTraversal(n.left);
			preorderTraversal(n.right);
			System.out.print(n.key);
		}
	}
	void inorderTraversal(Node n)
	{
		//until the node doesn't reach the end
		if(n!=null)
		{
			preorderTraversal(n.left);
			System.out.print(n.key);
			preorderTraversal(n.right);
		}
	}
}
public class BinaryTreeEg {
public static void main(String[] args)
{
	TreeeTraversal t1=new TreeeTraversal();
	t1.root=new Node('A');
	t1.root.left=new Node('B');
	t1.root.right=new Node('C');
	t1.root.left.left=new Node('D');
	t1.root.left.right=new Node('E');
	t1.root.right.left=new Node('F');
	System.out.println();
	t1.preorderTraversal(t1.root);
	System.out.println();
	t1.postorderTraversal(t1.root);
	System.out.println();
	t1.inorderTraversal(t1.root);
	
}
}
