package selfstudy;

/*class Node1
{
	char key;
	Node left, right;
	Node1(char key)
	{
		this.key=key;
	}
}*/
class BinarySolution
{
	Node root;
	void insert(char key) {
		root=insertInTree(root,key);
	}
	
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
	Node insertInTree(Node root, char key) {
		// TODO Auto-generated method stub
		if (root==null)
		{
			root=new Node(key);
		}
		if (key < root.key)
		{
			root.left=insertInTree(root.left,key);
		}
		else if(key > root.key)
		{
			root.right=insertInTree(root.right,key);
		}
		return root;
	}
    public void delete(int key) {
      //root = deleteNode(root, key);
        root = deletemethod(root, key);
    }
	public Node deletemethod(Node root, int val)
	{
		if(root==null) return null;
		if(val<root.key)
		{
			root.left=deletemethod(root.left,val);
		}
		else if(val>root.key)
		{
			root.right=deletemethod(root.right,val);
		}
		else
		{
			if(root.left==null || root.right==null)
			{
				Node temp=null;
				temp=root.left==null ? root.right : root.left;
				if (temp==null)
					return null;
				else
				{
					return temp;
				}
			}
			else
			{
				Node successor= getsuccessor(root);
				//root.key= minValue(root);
				root.key=successor.key;
				root.right=deletemethod(root.right,root.key);
				return root;
			}
		}
		return root;
	}
	public Node getsuccessor(Node node)
	{
		if(node==null) return null;
		Node temp=node.right;
		while(temp.left!=null)
		{
			//min=temp
			temp=node.left;
		}
		return temp;
	}
    private Node deleteNode(Node root, int val) {
        if (root == null) return null;

        // Search for the node to delete
        if (val < root.key) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.key) {
            root.right = deleteNode(root.right, val);
        } else {
            // Node to delete found
            if (root.left == null) return root.right; // Case 1: Node has only right child
            else if (root.right == null) return root.left; // Case 2: Node has only left child

            // Case 3: Node has two children
            root.key = minValue(root.right); // Find in-order successor (minimum value in right subtree)
            root.right = deleteNode(root.right, root.key); // Delete the in-order successor
        }
        return root;
    }

    private char minValue(Node root) {
        char min = root.key;
        System.out.println("DEFAULT");
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

}
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySolution b1=new BinarySolution();
		b1.insert('K');
		b1.insert('C');
		b1.insert('B');
		b1.insert('F');
		b1.insert('Z');
		//b1.insert('H');
		/*b1.insert('L');
		b1.insert('R');
		b1.insert('P');
		b1.insert('K');
		b1.insert('S');
		b1.insert('M');*/
		//b1.insert('Z');
		//b1.preorderTraversal(b1.root);
		//b1.delete('Z');
		//b1.delete('C');
		System.out.println("hey");
	//	b1.delete('C');
		b1.insert('A');
		System.out.println("hey");
		b1.delete('C');
		b1.preorderTraversal(b1.root);
		
		//b1.preorderTraversal(b1.root);
		
	}

}
