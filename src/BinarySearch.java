- Given a sorted array of N distinct elements. Find a key in the array using least number of comparisons. (Do you think binary search is optimal to search a key in sorted array?)
- Given an array of N distinct integers, find floor/Ceil value of input ‘key’. Say, A = {-1, 2, 3, 5, 6, 8, 9, 10} and key = 7, we should return 6 as outcome.
- Given a sorted array with possible duplicate elements. Find number of occurrences of input ‘key’ in log N time.
- Given a sorted array of distinct elements, and the array is rotated at an unknown position. Find minimum element in the array.


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
