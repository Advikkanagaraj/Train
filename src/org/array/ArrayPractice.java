package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {
	
	public static void main(String[] args) {
		
	
	List l1=new ArrayList();
	l1.add(10);
	l1.add("java");
	l1.add(10);
	l1.add('M');
	l1.add("true");
	l1.add(34455.67787);
	l1.add(7633212347878797l);
	l1.add(10);
	
	
	//System.out.println(l1);
	
	/*int size = l1.size();
	
	System.out.println(l1.size());
	
	int l = l1.indexOf("true");
	System.out.println(l);
	
	int lastIndexOf = l1.lastIndexOf(10);
	
	System.out.println(lastIndexOf);
	
	Object remove = l1.remove(3);
	
	System.out.println(l1);
	
	boolean contains = l1.contains("java");
	System.out.println(contains);
	
	/*Object object = l1.get(0);
	System.out.println(object);
	
	Object object2 = l1.get(1);
	System.out.println(object2);*/
	
	for(int i=0;i<l1.size();i++)
	{
		Object object = l1.get(i);
		System.out.println(object);
	
	}
	
	/*for (Object a : l1) {
		System.out.println(a);
		
	}*/
	}

}