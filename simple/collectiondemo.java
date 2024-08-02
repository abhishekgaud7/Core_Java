package com.simple;

import java.util.ArrayList;
import java.util.List;

public class collectiondemo 
{


		
		/*
		 * 
		 *   arraylist linked list
		 *   class list - interface 
		 *   
		 *    
		 */
		public static void main(String[] args) {
			
			empdetail e= new empdetail(1, "java", "developer", "ahmd");
			empdetail e1= new empdetail(2, "java1", "developer1", "ahmd1");
			empdetail e2= new empdetail(3, "java2", "developer2", "ahmd2");
			empdetail e3= new empdetail(4, "java3", "developer3", "ahmd3");
			
			
			List<empdetail> al = new ArrayList<empdetail>();//generic 
			
			al.add(e);
			al.add(e1);
			al.add(e2);
			al.add(e3);
			
			
			//System.out.println(al);
			

			
			   for(empdetail h:al) {
				   
				   
				   System.out.println(h.empid1 + " " + h.empaddress1 + " " + h.empdesignation1 + " "+ h.empname1);
			   }
		}

}
