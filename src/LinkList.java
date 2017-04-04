
public class LinkList {
	Node head;
class Node{	
    int data;
	Node link;

	public Node(){
		this.data = 0;
		this.link = null;
	}
	
	public Node(int data, Node n){
		this.data = data;
		this.link = n;
	}

public void setLink(Node l)
{
	this.link = l;
	}



public Node getLink(){
	return this.link;
	
}


public void setData(int d){
	this.data = d;
}

public int getData(){
	return this.data;
	
}
}
public void push(int a){
	Node l1 = new Node(a,head);
	head = l1;
	head = l1;
}

public void insert(int a, Node n){
	if(n == null){
		return;
	}
	Node n1 = new Node(a,n.link);
	n.link = n1;
}

public void append(int a){
	if(head == null){
		Node n = new Node(a,null);
		head = n;
		return;
	}
	Node curr = head;
	Node n = new Node(a,null);

	 while(curr.link != null){curr = curr.link; }
	curr.link = n;
	return;
}
public void printLinkedList(){
	Node n = head;
	while(n != null){
		System.out.println("n.data"+ n.data);
		n = n.link;
	}
	
}
public void delete(int a){
 Node curr = head;
 Node prev = null;
	while(curr.data !=a ){
		prev = curr;
		curr= curr.link;
	}		
		prev.link = curr.link;
	
}
public boolean search(Node head, int x){
	Node curr = head;
	if(head == null)
		return false;
	else if(curr.data == x)
		return true;
	else
		return(search(curr.link,x));
}
public boolean searchT(int x){
	return search(head,x);
}
public int getCountRec(Node n){
	if(n == null)
		return 0;
	
		return 1+ getCountRec(n.link);	
}

public void swaptwo(Node head){
	Node curr = head;
	int test;
	if(head.link == null){
		return;
	}
	if(head.link!= null && head!= null){
		test = head.link.data;
		head.link.data = head.data;
		head.data = test;
		
		swaptwo(head.link.link);
	}
	
}


public void setLastFirst(){
	Node curr= head;
	Node prev = null;
	if( curr.link == null){
		return;
	}
	while (curr.link != null){
		prev = curr;
		curr = curr.link;
	}
	
	prev.link = null;
	curr.link= head;
	head = curr;
}

public int getCount(){
	return getCountRec(head);
}
 public static void main (String [] args){
	 
	 LinkList ll = new LinkList();
	 ll.append(10);
	 ll.push(8);
	 ll.push(12);
	 ll.append(16);
	 ll.insert(17, ll.head.link.link);
	 ll.printLinkedList();
	 ll.delete(17);
	 ll.printLinkedList();
	 System.out.println(ll.getCount());
	 System.out.println(ll.searchT(1));

 }


}
