
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
    
    int height(Node n){
    	int h = 0;
    	if(n == null)
    		return 0;
    	else{
    		int lh = height(n.Left);
    		int rh = height(n.Right);
    		if(lh>rh)
    			h = lh + 1;
    		else
    			h = rh + 1;	
    	}
    	return h;
    	
    }
    
    void printLevelOrder(){
    	int h = height(root);
    	for(int i=0;i<=h;i++){
    	printGivenOrder(root,i);}
    }
    
    void printGivenOrder(Node n, int i){
    	if(root == null)
    		return;
    	else if( i == 1)
    	   System.out.println(n.data);		
    	else if (i>1)
    		{printGivenOrder(n.Left, i-1);
			printGivenOrder(n.Right, i-1);}	
    
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
	t.printLevelOrder();
	//printNode(a);
}


}
