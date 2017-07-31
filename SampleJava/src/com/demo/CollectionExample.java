package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

class Students{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class CollectionExample {
	public static void main(String a[]){
		
		/*
		 * List Example
		 */
		List<String> idName = new ArrayList<String>();
		idName.add("Jatin");
		idName.add("Suthar");							//add, indexof, sort, array, to string
		
		System.out.println(idName.size());				//size
		System.out.println(idName.contains("No"));		//Containt, remove index object, get
		System.out.println(idName.hashCode());
		
		/*
		 * Set Example
		 */
		Set<String> sName = new HashSet<String>();
		sName.add("Suthar");
		sName.add("Jatin");								// No duplicates
		sName.add("jatin");
		
		System.out.println(sName.size());				//size
		System.out.println(sName.contains("Jatin"));											//contains, remove removeall, clear, toArray
		System.out.println("Set" +sName.hashCode());
		
		//Sorting set
		TreeSet sorteName = new TreeSet<String>(sName);
		Iterator it = sorteName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		 * Java Map example
		 */
		Map<Integer, String> idsName = new HashMap<Integer, String>();
		idsName.put(1, "Suthar");
		idsName.put(3, "Dr");
		idsName.put(2, "Jatin");
		System.out.println(idsName.size());             //size, containskey, containtvalue, getwith key, 
		System.out.println(idsName.containsKey(1));		//remove with key
		System.out.println("Map" +idsName.hashCode());
		
		for(Map.Entry m : idsName.entrySet()){
			System.out.println(m.getKey());
		}
		
		//sorting map
		Map<Integer, String> sortemap = new TreeMap<Integer, String>(idsName);
		for(Map.Entry m : sortemap.entrySet()){
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		
	}
}
