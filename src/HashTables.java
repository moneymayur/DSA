import java.util.HashMap;

public class HashTables {
	public class Students{
	int id;
	int getID(){
		return 0;
	}
	}
public HashMap<Integer,Students> buildMap (Students[] students){
	HashMap<Integer, Students> map = new HashMap<Integer,Students>();
	for(Students s: students) map.put(s.getID(), s);
	return map;
}
}
