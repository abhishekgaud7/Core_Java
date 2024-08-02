package com.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array1stDemo {

	public static void main(String[] args) {
	
		
		arraylst a= new arraylst(1, "java", "java@gmail.com", "java@123");
		arraylst b= new arraylst(2, "java1", "java@gmail.com1", "java@1234");
		arraylst c= new arraylst(3, "java2", "java@gmail.com2", "java@1235");

		//  arraylist - dynamic array - random - search and short 
		// linkedlist - doubly linkedlist - insert 
		//   0   1   2  3  4  5  6
		//   3    6   7  8  9  3 7
		//ArrayList<arraylst> al = new ArrayList<arraylst>();
		//LinkedList<arraylst> al = new LinkedList<arraylst>();
		
		List<arraylst> al = new ArrayList<arraylst>();
		
		al.add(a);
		al.add(b);
		al.add(c);
		
		
		//System.out.println(al);
		
		for(arraylst n: al) {
			
			System.out.println(n.id + " " + n.name + " " + n.email + " "+ n.pass);
		}
	}

}
