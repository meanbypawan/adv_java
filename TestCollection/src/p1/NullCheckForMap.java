package p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NullCheckForMap {
  public static void main(String args[]) {
	  HashMap<Integer, String> hm = new HashMap<Integer, String>();
	  hm.put(null, "A");
	  hm.put(null, "B");
	  System.out.println("HashMap : "+hm);
  
	  LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
	  lhm.put(null, "A");
	  lhm.put(null, "B");
	  System.out.println("LinkedHashMap : "+lhm);
  
	  TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	  tm.put(null, "A");
	  System.out.println("TreeMap : "+tm);
  }
}
