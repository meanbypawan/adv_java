package p1;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestLinkedHashMap {
   public static void main(String args[]) {
	   LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
	   map.put(100, "A");
	   map.put(101, "B");
	   map.put(102, "C");
	   map.put(103, "D");
	   map.put(104, "E");
	   map.put(105, "F");
	   
	   for(Entry<Integer, String>entry : map.entrySet())
		   System.out.println(entry.getKey()+" "+entry.getValue());
   }
}
