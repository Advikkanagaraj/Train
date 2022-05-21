package org.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NewMap {

	public static void main(String[] args) {
		
		Map<String,Integer> m= new HashMap();
		
		m.put("CSK", 14);
		m.put("MI", 12);
		m.put("RR", 10);
		m.put("java",null);
		m.put("dotnet", null);
		m.put(null,10);
		m.put(null,null);
		
		
		System.out.println(m);
		
		System.out.println(m.size());
		
		boolean containsKey = m.containsKey("csk");
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(12);
		System.out.println(containsValue);
		
		
		Integer remove = m.remove("dotnet");
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
