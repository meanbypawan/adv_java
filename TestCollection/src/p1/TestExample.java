package p1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestExample {
  public static void main(String args[]) {
	  TreeMap<String, LinkedHashSet<String>> tm = new TreeMap<String, LinkedHashSet<String>>();
	  
	  LinkedHashSet<String> mpList = new LinkedHashSet<String>();
	  mpList.add("Indore");
	  mpList.add("Jabalpur");
	  mpList.add("Ujjain");
	  
	  LinkedHashSet<String> upList = new LinkedHashSet<String>();
	  upList.add("Agra");
	  upList.add("Lucknow");
	  upList.add("Mirzapur");
	  
	  LinkedHashSet<String> mhList = new LinkedHashSet<String>();
	  mhList.add("Mumbai");
	  mhList.add("Pune");
	  mhList.add("Nasik");
	  
	  tm.put("MP", mpList);
	  tm.put("UP", upList);
	  tm.put("MH", mhList);
	  
	  for(Entry<String, LinkedHashSet<String>> entry : tm.entrySet()) {
		  String stateName = entry.getKey();
		  LinkedHashSet<String> cityList = entry.getValue();
		  System.out.println(stateName+"\n---------------------");
		  for(String city: cityList)
			  System.out.println(city);
	  }
	  
	  
   }
}
