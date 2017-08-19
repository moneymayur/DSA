public class BinaryHeap {

	int [] Heap;
	int size;
	int maxSize ;
	int front =1;
	BinaryHeap(int maxSize){
		this.maxSize = maxSize;
		this.size = 0;
		Heap = new int[maxSize+1];
		Heap[0] = Integer.MIN_VALUE;
	}
	int parent(int pos){
		return pos/2;
	}
	int leftChild(int pos){
		return 2*pos;
	}
	int rightChild(int pos){
		return 2*pos+1;
	}
	boolean isLeaf(int pos){
		if(pos>=size/2 && pos<=size){
			return true;}
		return false;
	}
void minHeapify(int pos){
	if(Heap[pos]>Heap[leftChild(pos)] || Heap[pos]>Heap[rightChild(pos)])
	{	if(Heap[leftChild(pos)]< Heap[rightChild(pos)])
		{swap(pos,leftChild(pos));
	    minHeapify(leftChild(pos));}
	else{
		swap(pos,rightChild(pos));
	    minHeapify(rightChild(pos));}
	}
	}
void swap(int a ,int b){
	int temp;
	temp = a;
	a=b;
	b=temp;
}
	}


