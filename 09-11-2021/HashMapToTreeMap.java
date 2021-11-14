package techno.java.Map;


import java.util.HashMap;
import java.util.TreeMap;

public class HashMapToTreeMap {
public static void main(String[] args) {
	MapDec dec=new MapDec();
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(301, "Raghu");
	map.put(304, "B");
	map.put(323, "C");
	map.put(354, "D");
	map.put(332, "E");
	System.out.println(map);
	TreeMap<Integer,String> trm=new TreeMap<Integer,String>(map);
	System.out.println(trm);

}
}
