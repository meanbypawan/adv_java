package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap {
  public static void main(String args[]) {
	  HashMap<Integer, String> hm = new HashMap<Integer, String>();
	  hm.put(100, "A");
	  hm.put(200, "B");
	  hm.put(120, "C");
	  hm.put(98, "F");
	  hm.put(110, "D"); // 110 --> G
	  hm.put(110, "G");// 
	  
	  Set<Map.Entry<Integer, String>>set =  hm.entrySet();
      Iterator<Entry<Integer, String>>itr =  set.iterator();
      while(itr.hasNext()) {
    	 Entry<Integer, String> entry =  itr.next();
         System.out.println(entry.getKey()+"  "+entry.getValue());
      }
  }
}
