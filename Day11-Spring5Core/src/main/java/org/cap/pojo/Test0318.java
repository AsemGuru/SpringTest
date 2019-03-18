package org.cap.pojo;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test0318 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String ,String > tr = new TreeMap<String ,String>();
		
		tr.put("a", "apple");
		tr.put("e", "egg");
	    tr.put("g", "god");
		
		
		SortedMap<String ,String > str =tr.subMap("a" ,"e");
		str.put("b", "bail");
		str.put("f", "fish");
		tr.put("r", "red");
		
		tr.remove("a");
		System.out.println(str);
		System.out.println(tr);
		
		
	}

} 
