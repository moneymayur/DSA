
public class BinaryTree {
	public static class Node{
		int data;
		Node Left;
		Node Right;

	Node(int data){
		this.data = data;
		this.Left = null;
		this.Right = null;
	}
	
}
	Node root;
    BinaryTree()
    {
        root = null;
    }
    
    void printPostOrder(){
    	printPostOrder(root);
    }
    
    void printPostOrder(Node n){
    	if(n == null)
    		return;
    	printPostOrder(n.Left);
    	printPostOrder(n.Right);
		System.out.println(n.data);		
    }
    
    void printPreOrder(){
    	printPreOrder(root);
    }
    
    void printPreOrder(Node n){
    	if(n == null)
    		return;

    	System.out.println(n.data);		
    	printPreOrder(n.Left);
    	printPreOrder(n.Right);
    }
    void printInorder(){
    	printInorder(root);
    }
    void printInorder(Node n){
    	if (n == null)
            return;
			
    	printInorder(n.Left);
		System.out.println(n.data);
		printInorder(n.Right);
	
		}
 

	public static void main(String [] args){
	BinaryTree t = new BinaryTree();
	Node a = new Node(1);
	Node b  = new Node (4);
	Node c = new Node(5);
	a.Left = b;
	a.Right = c;
	t.root = a;
	t.printInorder();
	t.printPostOrder();
	t.printPreOrder();
	//printNode(a);
}


}
