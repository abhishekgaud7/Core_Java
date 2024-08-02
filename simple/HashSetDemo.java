package com.simple;

import java.util.HashSet;

public class HashSetDemo 
{


		public static void main(String[] args) 
		{

			/*
			 * 
			 *    hashing tech 
			 *    
			 *    java - Ad456788 hashcode 
			 * 
			 */
			
			    HashSet<String> hs = new HashSet<String>();
			    
			    hs.add("java");
			    hs.add("php");
			    hs.add("python");
			    hs.add("java");
			    hs.add("dotnet");
			    
			    
			    for(String s: hs) {
			    	
			    	System.out.println(s);
			    }
		}

}
