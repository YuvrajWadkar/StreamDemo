package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sumit");
		list.add("vinayak");
		list.add("ganesh");
		
		list.stream().forEach(x ->System.out.println(x));
 		
	}
	
}
