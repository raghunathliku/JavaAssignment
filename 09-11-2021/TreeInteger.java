package techno.JavaAssignment.TreeMapAssignment2;

import java.util.TreeMap;


public class TreeInteger {
	public static void main(String[] args) {
        TreeMap<MainTree2, Integer>map=new TreeMap<>();
		map.put(new MainTree2(123, "Raghu"),55);
		map.put(new MainTree2(145, "J"),15);
		map.put(new MainTree2(135, "b"),96);
		map.put(new MainTree2(156, "abc"),13);
		map.put(new MainTree2(234, "abcd"),78);
		 TreeMap<MainTree2, Integer>map1=new TreeMap<>(new TreeIntegerCom());
		 map1.putAll(map);
		 System.out.println(map);
		 System.out.println(map1);
		
	}
}
