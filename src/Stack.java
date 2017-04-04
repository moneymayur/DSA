
public class Stack {
	static final int MAX = 1000;
	int[] a= new int[MAX];
	int top;
	Stack(){
		top =-1;
	}
	void push(int n){
		if(top>MAX){
			System.out.println("Overflow");
		}
		else{
			a[++top] = n;
		}
		
	}
	
	int pop(){
		if(top==-1){
			System.out.println("Underflow");
			return 0;
		}
		else{
			
			return(a[top--]);
		}
	}

}
