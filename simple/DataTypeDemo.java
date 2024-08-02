package com.simple;

public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		int i1=01; // 4 bytes | -2147483648 to 2147483647 | -2^32 to 2^32-1
		long l1=123123; //8 bytes |  -2^64 to 2^64-1
		byte b1=127;//1 bytes
		char c1='A';// 2 bytes 
		float f1=23.57f; // 4 bytes
		double d1=213.23456; // 8 bytes
		boolean bb=true; // 1 bit
		System.out.println("Integar is...."+i1);
		System.out.println("Long is...."+l1);
		System.out.println("Byte is...."+b1);
		System.out.println("character is...."+c1);
		System.out.println("Float is...."+f1);
		System.out.println("Double is...."+i1);
		System.out.println("Boolean is...."+i1);
		
		System.out.println("Integar size is "+Integer.BYTES+"bytes");
		System.out.println("Integar size is "+Long.BYTES+"bytes");
		System.out.println("Integar size is "+Byte.BYTES+"bytes");
		System.out.println("Integar size is "+Double.BYTES+"bytes");
		System.out.println("Integar size is "+Character.BYTES+"bytes");
		System.out.println("Integar size is "+Float.BYTES+"bytes");
	}
}
