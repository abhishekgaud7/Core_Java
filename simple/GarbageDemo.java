package com.simple;

public class GarbageDemo 
{

	 public void finalize() {
			  
			  System.out.println("clean code");
		  }
		
		  public void test() {
			  int a=5;
			  System.out.println("hello java");
		  }
		public static void main(String[] args) {
			GarbageDemo e = new GarbageDemo(); // e object memory 
			e.finalize();
			//e.test();
			/*
			 * 
			 * wat garbaze collection ?
			 * 
			 * 
			 * 
			 */

		}

}
