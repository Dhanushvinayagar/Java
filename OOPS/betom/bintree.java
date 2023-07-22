package betom;


public class bintree {
	static int i=-1;
	public static Node build(int nodes[]) {
		i++;
		if(nodes[i]==-1) {
			return null;
		}
		Node newnode = new Node(nodes[i]);
		System.out.println("newnode :"+ newnode.data +" "+ newnode.left +" "+ newnode.right);
		newnode.left=build(nodes);
		System.out.println("newnode (left):"+ newnode.data +" "+ newnode.left +" "+ newnode.right);
		newnode.right=build(nodes);
		System.out.println("newnode (right):"+ newnode.data +" "+ newnode.left +" "+ newnode.right);

		return newnode;
	}
	public static void traverse(Node root) {
		while(root!=null) {
			traverse(root.left);
			System.out.print(root.data);
			traverse(root.right);
		}
	}
	
	public static void main(String args[]) {
//		Node root = new Node(5);
//		
//		System.out.println(root.data);
//		System.out.println(root.left+" "+root.right);
		bintree tree = new bintree();
		int nodes[]= {1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,-1};
		Node root = tree.build(nodes);
		System.out.print(root.data);
		tree.traverse(root);
	}
}

class Node{
	int data;
	Node left;
	Node right;
	Node(int i){
		this.data=i;
		this.left=null;
		this.right=null;
	}
}