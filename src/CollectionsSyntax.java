import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Collections {

	public static void main(String[] args){
		ArrayList<Integer> l =new  ArrayList<Integer>();	
		l.add(10);
		l.add(12);
		Iterator<Integer> itr = l.listIterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
	for(Integer i: l){
	System.out.println(i);	
	}
	HashSet<Integer> s = new HashSet<Integer>();	
	System.out.println(s.add(10));
	System.out.println(s.add(12));
	System.out.println(s.add(10));
	
	Iterator<Integer> i = s.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	for(Integer iv : s){
		System.out.println(iv);
	}
	
	Integer arr[] = {10,20,20,30,20,40,50};
	int n = arr.length;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int p=0;p<n;p++){
		map.put(arr[p],java.util.Collections.frequency(Arrays.asList(arr),arr[p]));
	}
	   Hashtable<String, String> hashtable = 
	              new Hashtable<String, String>();
	 
	   // Adding Key and Value pairs to Hashtable
	   hashtable.put("Key1","Chaitanya");
	   hashtable.put("Key2","Ajeet");
	   hashtable.put("Key3","Peter");
	   hashtable.put("Key4","Ricky");
	   hashtable.put("Key5","Mona");
	 
	   Set<Entry<String,String>> ss = hashtable.entrySet();
	   Enumeration names = hashtable.keys();
	   while(names.hasMoreElements()) {
	     String key = (String) names.nextElement();
	      System.out.println("Key: " +key+ " & Value: " +
	      hashtable.get(key));
	   }
	 
	
	Map<String,Integer> m = new HashMap<String,Integer>();
	m.put("ram", 100);
	m.put("Ramesh", 123);
	m.put("Ramesh", 124);
	
	Set<Entry<String, Integer>> sb = m.entrySet();
	m.forEach((k,v)->System.out.println(k + v)); //enhanced for each and lamda expression
	for(Entry sp:sb){
		System.out.println(sp.getKey()+"  "+ sp.getValue());
	}
	
	}
}
