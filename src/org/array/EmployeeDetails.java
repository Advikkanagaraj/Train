package org.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDetails {

	public static void main(String[] args) {
		Employee a=new Employee();
		a.setName("vikram");
		a.setEmpid(1234);
		a.setMobno(9865322);
		
		Employee b=new Employee();
		b.setName("vijay");
		b.setEmpid(12456);
		b.setMobno(9862442425l);
		
		
		List<Employee> l=new LinkedList<Employee>();
		l.add(a);
		l.add(b);
		
		for (int i = 0; i < l.size(); i++) {
			//String name2 = l.get(i).getName();
			//System.out.println(name2);
			
	//	int empid = l.get(i).getEmpid();
	//		System.out.println(empid);
			
			System.out.println("employee name is : "+l.get(i).getName());
			System.out.println("employee id is :"+l.get(i).getEmpid());
			System.out.println("emloyee mobno is :"+l.get(i).getMobno());
			System.out.println(" ");
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
	

