package p1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TestTreeMap {
  public static void main(String args[]) {
	  TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
      tm.put(100, "A");
      tm.put(105, "C");
      tm.put(102, "D");
      tm.put(106, "F");
      tm.put(104, "E");
      tm.put(103, "B");
      tm.put(101, "G");
      
      for(Entry<Integer, String> entry : tm.entrySet())
    	  System.out.println(entry.getKey()+" "+entry.getValue());
  }
}
