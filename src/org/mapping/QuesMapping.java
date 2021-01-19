package org.mapping;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class QuesMapping {
	public static void main(String[] args) {
	Map<String,Integer> m= new TreeMap<>();
	m.put("!", 10);
	m.put(",", 20);
	m.put("*", 30);	
		
	System.out.println(m);	
	System.out.println("===To hav key alone====");
	Set<String> s1= m.keySet();
	System.out.println(s1);
	System.out.println("====enhanced loop======");
	for (String k : s1) {
		System.out.println(k);
	}
		
		System.out.println("===to hav values alone====");
	Collection<Integer> s2=m.values();	
	System.out.println(s2);
	System.out.println("====to have enhaced loop====");
	for (Integer l : s2) {
		
		System.out.println(l);
		
	}
	
System.out.println("====to hav both key and value");
Set<Entry<String,Integer>> en = m.entrySet();
System.out.println(en);

System.out.println("=======to hav key and value in enhanced for loop===");

for (Entry<String, Integer> entry : en) {

	System.out.println(entry);
	
}		
	}

}
