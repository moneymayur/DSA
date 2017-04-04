
public class BinarySearch {
	int count = 10;
	//System.out.println(String.valueOf(count).length);

	public int search(int start, int last, int[] a, int key){
		 if(start>=last){
			 return 0;
		 }
		if(key<a[start] || key>a[last])
		 return 0;
		 
		if(key == a[(start+last)/2]){
			return 1;
		}
		if(key>a[(start+last)/2]){
			search((start+last)/2+1,last,a,key);
		}
		if(key < a[(start+last)/2]){
			search(start,((start+last)/2)-1,a,key);
		}
	
		return 0;
	
	
	} 
	
	

}
