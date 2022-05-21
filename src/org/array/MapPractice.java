package org.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {
public static void main(String[] args) {
	
	Map<String, Integer> m=new HashMap();//random order print
	m.put("CSK", 14);
	m.put("RR", 12);
	m.put("KKR", 13);
	m.put("RCB", 12);
	m.put("SRH", 11);
	m.put(null, null);
	m.put("GT",null);
	
	System.out.println(m);
	
	Map<String, Integer>m1=new LinkedHashMap();//insertion order print

	
	m1.put("CSK", 14);
	m1.put("RR", 12);
	m1.put("KKR", 13);
	m1.put("RCB", 10);
	m1.put("SRH", 11);
	m1.put(null, null);
	m1.put("GT",null);
	System.out.println(m1);
	
	Map<String, Integer>m2=new TreeMap();//Alphapetic oredr
	
	m2.put("CSK", 14);
	m2.put("RR", 12);
	m2.put("KKR", 13);
	m2.put("RCB", 10);
	m2.put("SRH", 11);
	//m2.put(null, null); // key null not accepted
	m2.put("GT",null);
	System.out.println(m2);
	
	Map<String, Integer>m3=new Hashtable();//random order
	m3.put("CSK", 14);
	m3.put("RR", 12);
	m3.put("KKR", 13);
	m3.put("RCB", 10);
	m3.put("SRH", 11);
	//m3.put(null, null);//null not accepted both key and value
	//m3.put("GT",null);
	System.out.println(m3);
	
	boolean containsKey = m.containsKey("KKR");
	System.out.println(containsKey);

	boolean containsValue = m.containsValue(14);
	System.out.println(containsValue);
	
	Integer remove = m.remove("RCB");
	System.out.println(remove);
	
	boolean remove2 = m.remove("RCB", 10);
	System.out.println(remove2);
	
	System.out.println(m);
	
	Set<String> keySet = m.keySet();
	System.out.println(keySet);
	
	Collection<Integer> values = m.values();
	System.out.println(values);
	
	
	
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		System.out.println(entry);
		
		

		

	String key = entry.getKey();
	System.out.println(key);	
	Integer value = entry.getValue();
	System.out.println(value);
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
}
	
}
